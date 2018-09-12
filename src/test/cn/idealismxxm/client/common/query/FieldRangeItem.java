package cn.idealismxxm.client.common.query;

import cn.idealismxxm.client.enums.FieldEnumInterface;

/**
 * 字段 范围项
 *
 * @author idealism
 * @date 2018/9/5
 */
public class FieldRangeItem<T extends FieldEnumInterface> {
    /**
     * 字段标识
     */
    private Integer field;

    /**
     * 字段 下限值
     */
    private Object lowerValue;

    /**
     * 字段 上限值
     */
    private Object upperValue;

    /**
     * 是否包含 下限值，默认包含
     */
    private boolean includeLower = true;

    /**
     * 是否包含 上限值，默认包含
     */
    private boolean includeUpper = true;

    private FieldRangeItem() { }

    public FieldRangeItem(T fieldEnum, int lowerValue, int upperValue) {
        this(fieldEnum, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(T fieldEnum, long lowerValue, long upperValue) {
        this(fieldEnum, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(T fieldEnum, float lowerValue, float upperValue) {
        this(fieldEnum, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(T fieldEnum, double lowerValue, double upperValue) {
        this(fieldEnum, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(T fieldEnum, String lowerValue, String upperValue) {
        this(fieldEnum, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(T fieldEnum, java.util.Date lowerValue, java.util.Date upperValue) {
        this(fieldEnum, (Object) lowerValue, upperValue);
    }

    private FieldRangeItem(T fieldEnum, Object lowerValue, Object upperValue) {
        this.field = fieldEnum.getCode();
        this.lowerValue = lowerValue;
        this.upperValue = upperValue;
    }

    public FieldRangeItem includeLower(boolean includeLower) {
        this.includeLower = includeLower;
        return this;
    }

    public FieldRangeItem includeUpper(boolean includeUpper) {
        this.includeUpper = includeUpper;
        return this;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public Object getLowerValue() {
        return lowerValue;
    }

    public void setLowerValue(Object lowerValue) {
        this.lowerValue = lowerValue;
    }

    public Object getUpperValue() {
        return upperValue;
    }

    public void setUpperValue(Object upperValue) {
        this.upperValue = upperValue;
    }

    public boolean isIncludeLower() {
        return includeLower;
    }

    public void setIncludeLower(boolean includeLower) {
        this.includeLower = includeLower;
    }

    public boolean isIncludeUpper() {
        return includeUpper;
    }

    public void setIncludeUpper(boolean includeUpper) {
        this.includeUpper = includeUpper;
    }
}
