package cn.idealismxxm.server.utils;

import cn.idealismxxm.client.common.query.FieldArrayItem;
import cn.idealismxxm.client.common.query.FieldQueryBuilder;
import cn.idealismxxm.client.common.query.FieldRangeItem;
import cn.idealismxxm.client.common.query.FieldUnitItem;
import cn.idealismxxm.server.enums.EntityFieldEnum;

import java.util.List;

/**
 * 实体字段校验工具类
 *
 * @author idealism
 * @date 2018/9/11
 */
public class EntityFileldCheckUtils {
    /**
     * 页号上下界
     */
    private static int MIN_PAGE = 1;
    private static int MAX_PAGE = 100;

    /**
     * 页大小上下界
     */
    private static int MIN_PAGE_SIZE = 1;
    private static int MAX_PAGE_SIZE = 100;

    /**
     * 校验所有字段
     *
     * @param fieldQueryBuilder 字段查询构造器
     */
    @SuppressWarnings("unchecked")
    public static void checkAll(FieldQueryBuilder fieldQueryBuilder) {
        // 1. 限制 页号 和 页大小 的上下界
        limitPageAndPageSize(fieldQueryBuilder);

        // 2. 校验 字段个体项
        checkFieldUnitItems("equalClauses", fieldQueryBuilder.getEqualClauses());
        checkFieldUnitItems("notEqualClauses", fieldQueryBuilder.getNotEqualClauses());

        // 3. 校验 字段集合项
        checkFieldUnitItems("inClauses", fieldQueryBuilder.getInClauses());
        checkFieldUnitItems("notInClauses", fieldQueryBuilder.getNotInClauses());

        // 4. 校验 字段范围项
        checkFieldRangeItems("betweenClauses", fieldQueryBuilder.getBetweenClauses());
        checkFieldRangeItems("notBetweenClauses", fieldQueryBuilder.getNotBetweenClauses());
    }

    /**
     * 限制 页号 和 页大小 的上下界
     *
     * @param fieldQueryBuilder 字段查询构造器
     */
    public static void limitPageAndPageSize(FieldQueryBuilder fieldQueryBuilder) {
        if (fieldQueryBuilder.getPage() < MIN_PAGE) {
            fieldQueryBuilder.setPage(MIN_PAGE);
        }
        if (fieldQueryBuilder.getPage() > MAX_PAGE) {
            fieldQueryBuilder.setPage(MAX_PAGE);
        }

        if (fieldQueryBuilder.getPageSize() < MIN_PAGE_SIZE) {
            fieldQueryBuilder.setPageSize(MIN_PAGE_SIZE);
        }
        if (fieldQueryBuilder.getPageSize() > MAX_PAGE_SIZE) {
            fieldQueryBuilder.setPageSize(MAX_PAGE_SIZE);
        }
    }

    /**
     * 校验 字段个体项
     *
     * @param fieldUnitItems 字段个体项 列表
     */
    public static void checkFieldUnitItems(String name, List<FieldUnitItem> fieldUnitItems) {
        if (fieldUnitItems == null) {
            throw new IllegalArgumentException(String.format("[%s] must not be null", name));
        }

        // 对 字段个体项 列表均进行相关校验
        fieldUnitItems.forEach(fieldUnitItem -> {
            // 1. 根据 code 获取相应的枚举
            EntityFieldEnum entityFieldEnum = EntityFieldEnum.getEntityFieldEnumByCode(fieldUnitItem.getField());
            if (entityFieldEnum == null) {
                // 不存在则表明 code 有误
                throw new IllegalArgumentException(String.format("[%s] contains illegal code [%s] ", name, fieldUnitItem.getField()));
            }

            // 2. 对字段个体项的值进行校验
            entityFieldEnum.getChecker().check(fieldUnitItem.getUnitValue());
        });
    }

    /**
     * 校验 字段集合项
     *
     * @param fieldArrayItems 字段集合项 列表
     */
    public static void checkFieldArrayItems(String name, List<FieldArrayItem> fieldArrayItems) {
        if (fieldArrayItems == null) {
            throw new IllegalArgumentException(String.format("[%s] must not be null", name));
        }

        // 对 字段集合项 列表均进行相关校验
        fieldArrayItems.forEach(fieldArrayItem -> {
            // 1. 根据 code 获取相应的枚举
            EntityFieldEnum entityFieldEnum = EntityFieldEnum.getEntityFieldEnumByCode(fieldArrayItem.getField());
            if (entityFieldEnum == null) {
                // 不存在则表明 code 有误
                throw new IllegalArgumentException(String.format("[%s] contains illegal code [%s] ", name, fieldArrayItem.getField()));
            }

            // 2. 对字段集合项的值进行校验
            for (Object value : fieldArrayItem.getArrayValue()) {
                entityFieldEnum.getChecker().check(value);
            }
        });
    }

    /**
     * 校验 字段范围项
     *
     * @param fieldRangeItems 字段范围项 列表
     */
    public static void checkFieldRangeItems(String name, List<FieldRangeItem> fieldRangeItems) {
        if (fieldRangeItems == null) {
            throw new IllegalArgumentException(String.format("[%s] must not be null", name));
        }

        // 对 字段范围项 列表均进行相关校验
        fieldRangeItems.forEach(fieldRangeItem -> {
            // 1. 根据 code 获取相应的枚举
            EntityFieldEnum entityFieldEnum = EntityFieldEnum.getEntityFieldEnumByCode(fieldRangeItem.getField());
            if (entityFieldEnum == null) {
                // 不存在则表明 code 有误
                throw new IllegalArgumentException(String.format("[%s] contains illegal code [%s] ", name, fieldRangeItem.getField()));
            }

            // 2. 对字段范围项的值进行校验
            Object lowerValue = fieldRangeItem.getLowerValue();
            Object upperValue = fieldRangeItem.getUpperValue();
            if (lowerValue == null && upperValue == null) {
                // 下限和上限不能同时为空
                throw new IllegalArgumentException(String.format("[%s] contains illegal fieldRangeItem, code: [%s], lowerValue and upperValue must not be null at the same time", name, fieldRangeItem.getField()));
            }
            // 下限和上限 不为 null，则进行值校验
            if (lowerValue != null) {
                entityFieldEnum.getChecker().check(lowerValue);
            }
            if (upperValue != null) {
                entityFieldEnum.getChecker().check(upperValue);
            }
        });
    }
}
