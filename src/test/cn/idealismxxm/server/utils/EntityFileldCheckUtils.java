package cn.idealismxxm.server.utils;

import cn.idealismxxm.client.common.query.FieldQueryBuilder;

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
     * @return true：通过校验；false：未通过校验
     */
    public static boolean checkAll(FieldQueryBuilder fieldQueryBuilder) {
        // 1. 限制 页号 和 页大小 的上下界
        limitPageAndPageSize(fieldQueryBuilder);

        return true;
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
}
