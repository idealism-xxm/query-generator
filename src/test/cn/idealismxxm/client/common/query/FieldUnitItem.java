package cn.idealismxxm.client.common.query;

import cn.idealismxxm.client.enums.FieldEnumInterface;

import java.util.Date;

/**
 * 字段 个体项
 *
 * @author idealism
 * @date 2018/9/5
 */
public class FieldUnitItem<T extends FieldEnumInterface> {
    /**
     * 字段标识
     */
    private Integer field;

    /**
     * 字段 个体值
     */
    private Object unitValue;

    /**
     * just for deserialize
     * @deprecated this method is deprecated, you can use {@link FieldUnitItem#FieldUnitItem(FieldEnumInterface, int)} etc.
     */
    @Deprecated
    public FieldUnitItem() { }

    public FieldUnitItem(T fieldEnum, int value) {
        this(fieldEnum, (Object) value);
    }

    public FieldUnitItem(T fieldEnum, long value) {
        this(fieldEnum, (Object) value);
    }

    public FieldUnitItem(T fieldEnum, float value) {
        this(fieldEnum, (Object) value);
    }

    public FieldUnitItem(T fieldEnum, double value) {
        this(fieldEnum, (Object) value);
    }

    public FieldUnitItem(T fieldEnum, boolean value) {
        this(fieldEnum, (Object) value);
    }

    public FieldUnitItem(T fieldEnum, String value) {
        this(fieldEnum, (Object) value);
    }

    public FieldUnitItem(T fieldEnum, Date value) {
        this(fieldEnum, (Object) value);
    }

    private FieldUnitItem(T fieldEnum, Object value) {
        this.field = fieldEnum.getCode();
        this.unitValue = value;
    }

    public Integer getField() {
        return field;
    }

    /**
     * just for deserialize
     * @deprecated this method is deprecated, you can use {@link FieldUnitItem#FieldUnitItem(FieldEnumInterface, int)} etc.
     */
    @Deprecated
    public void setField(Integer field) {
        this.field = field;
    }

    public Object getUnitValue() {
        return unitValue;
    }

    /**
     * just for deserialize
     * @deprecated this method is deprecated, you can use {@link FieldUnitItem#FieldUnitItem(FieldEnumInterface, int)} etc.
     */
    @Deprecated
    public void setUnitValue(Object unitValue) {
        this.unitValue = unitValue;
    }
}
