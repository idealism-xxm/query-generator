package cn.idealismxxm.common.query;

/**
 * 字段 范围项
 *
 * @author idealism
 * @date 2018/9/5
 */
public class FieldRangeItem {
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

    private FieldRangeItem() {
        throw new RuntimeException("FieldRangeItem 不能调用默认构造方法");
    }

    public FieldRangeItem(int field, int lowerValue, int upperValue) {
        this(field, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(int field, long lowerValue, long upperValue) {
        this(field, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(int field, float lowerValue, float upperValue) {
        this(field, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(int field, double lowerValue, double upperValue) {
        this(field, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(int field, String lowerValue, String upperValue) {
        this(field, (Object) lowerValue, upperValue);
    }

    public FieldRangeItem(int field, java.util.Date lowerValue, java.util.Date upperValue) {
        this(field, (Object) lowerValue, upperValue);
    }

    private FieldRangeItem(int field, Object lowerValue, Object upperValue) {
        this.field = field;
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

    public Object getLowerValue() {
        return lowerValue;
    }

    public Object getUpperValue() {
        return upperValue;
    }

    public boolean isIncludeLower() {
        return includeLower;
    }

    public boolean isIncludeUpper() {
        return includeUpper;
    }
}
