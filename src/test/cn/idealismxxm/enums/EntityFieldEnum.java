package cn.idealismxxm.enums;

import cn.idealismxxm.common.checker.FieldChecker;

/**
 * 实体字段枚举类
 *
 * @author idealism
 * @date 2018/9/5
 */
public enum EntityFieldEnum {
    ;

    /**
     * 字段标识
     */
    private Integer code;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段描述
     */
    private String description;

    /**
     * 字段校验器
     */
    private FieldChecker checker;

    EntityFieldEnum(Integer code, String name, String description, FieldChecker checker) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.checker = checker;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public FieldChecker getChecker() {
        return checker;
    }

    public static EntityFieldEnum getEntityFieldEnumByCode(Integer code) {
        for (EntityFieldEnum fieldEnum : EntityFieldEnum.values()) {
            if (fieldEnum.getCode().equals(code)) {
                return fieldEnum;
            }
        }
        return null;
    }
}
