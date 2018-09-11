package cn.idealismxxm.common.query;

/**
 * 字段排序参数
 *
 * @author idealism
 * @date 2018/9/9
 */
public class FieldSort {
    /**
     * 排序顺序枚举
     */
    public enum SortOrderEnum {
        /**
         * 升序
         */
        ASC(1, "升序"),

        /**
         * 降序
         */
        DESC(2, "降序");

        /**
         * 排序顺序标识
         */
        private Integer code;

        /**
         * 排序顺序描述
         */
        private String description;

        SortOrderEnum(Integer code, String description) {
            this.code = code;
            this.description = description;
        }

        public Integer getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public static SortOrderEnum getSortOrderEnumByCode(Integer code) {
            for (SortOrderEnum sortOrderEnum : values()) {
                if (sortOrderEnum.getCode().equals(code)) {
                    return sortOrderEnum;
                }
            }

            return null;
        }
    }

    /**
     * 字段标识
     */
    private Integer field;

    /**
     * 排序顺序标识
     */
    private Integer sortOrder;

    public FieldSort(int field, SortOrderEnum sortOrderEnum) {
        this.field = field;
        this.sortOrder = sortOrderEnum.getCode();
    }

    public Integer getField() {
        return field;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }
}
