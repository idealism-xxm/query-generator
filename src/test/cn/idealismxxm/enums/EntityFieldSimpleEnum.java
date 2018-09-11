package cn.idealismxxm.enums;

/**
 * 实体字段简化枚举类（用于暴露）
 *
 * @author idealism
 * @date 2018/9/5
 */
public enum EntityFieldSimpleEnum {
    ;

    /**
     * 字段标识
     */
    private Integer code;

    /**
     * 字段描述
     */
    private String description;

    EntityFieldSimpleEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static EntityFieldSimpleEnum getEntityFieldSimpleEnumByCode(Integer code) {
        for (EntityFieldSimpleEnum fieldSimpleEnum : EntityFieldSimpleEnum.values()) {
            if (fieldSimpleEnum.getCode().equals(code)) {
                return fieldSimpleEnum;
            }
        }
        return null;
    }
}
