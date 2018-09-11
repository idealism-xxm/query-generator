package cn.idealismxxm.common.query;

/**
 * 字段 个体项
 *
 * @author idealism
 * @date 2018/9/5
 */
public class FieldUnitItem {
    /**
     * 字段标识
     */
    private Integer field;

    /**
     * 字段 个体值
     */
    private Object unitValue;

    private FieldUnitItem() {
        throw new RuntimeException("FieldUnitItem 不能调用默认构造方法");
    }

    public FieldUnitItem(int field, int value) {
        this(field, (Object) value);
    }

    public FieldUnitItem(int field, long value) {
        this(field, (Object) value);
    }

    public FieldUnitItem(int field, float value) {
        this(field, (Object) value);
    }

    public FieldUnitItem(int field, double value) {
        this(field, (Object) value);
    }

    public FieldUnitItem(int field, boolean value) {
        this(field, (Object) value);
    }

    public FieldUnitItem(int field, String value) {
        this(field, (Object) value);
    }

    public FieldUnitItem(int field, java.util.Date value) {
        this(field, (Object) value);
    }

    private FieldUnitItem(int field, Object value) {
        this.field = field;
        this.unitValue = value;
    }
}
