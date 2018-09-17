package cn.idealismxxm.client.common.query;

import cn.idealismxxm.client.enums.FieldEnumInterface;

/**
 * 字段 集合项
 *
 * @author idealism
 * @date 2018/9/5
 */
public class FieldArrayItem<T extends FieldEnumInterface> {
    /**
     * 字段标识
     */
    private Integer field;

    /**
     * 字段 数组值
     */
    private Object[] arrayValue;

    /**
     * just for deserialize
     * @deprecated this method is deprecated, you can use {@link FieldArrayItem#FieldArrayItem(FieldEnumInterface, int...)} etc.
     */
    @Deprecated
    public FieldArrayItem() { }

    public FieldArrayItem(T fieldEnum, int... value) {
        this(fieldEnum, toObjectArray(value));
    }

    public FieldArrayItem(T fieldEnum, long... value) {
        this(fieldEnum, toObjectArray(value));
    }

    public FieldArrayItem(T fieldEnum, float... value) {
        this(fieldEnum, toObjectArray(value));
    }

    public FieldArrayItem(T fieldEnum, double... value) {
        this(fieldEnum, toObjectArray(value));
    }

    public FieldArrayItem(T fieldEnum, String... value) {
        this(fieldEnum, (Object[]) value);
    }

    public FieldArrayItem(T fieldEnum, java.util.Date... value) {
        this(fieldEnum, (Object[]) value);
    }

    private FieldArrayItem(T fieldEnum, Object[] value) {
        this.field = fieldEnum.getCode();
        this.arrayValue = value;
    }

    /**
     * int[] 转 Object[]
     *
     * @param value int[]
     * @return Object[]
     */
    private static Object[] toObjectArray(int[] value) {
        if (value == null) {
            return null;
        }
        if (value.length == 0) {
            return new Object[0];
        }
        final Integer[] result = new Integer[value.length];
        for (int i = 0; i < value.length; ++i) {
            result[i] = value[i];
        }
        return result;
    }

    /**
     * long[] 转 Object[]
     *
     * @param value long[]
     * @return Object[]
     */
    private static Object[] toObjectArray(long[] value) {
        if (value == null) {
            return null;
        }
        if (value.length == 0) {
            return new Object[0];
        }
        final Long[] result = new Long[value.length];
        for (int i = 0; i < value.length; ++i) {
            result[i] = value[i];
        }
        return result;
    }

    /**
     * float[] 转 Object[]
     *
     * @param value float[]
     * @return Object[]
     */
    private static Object[] toObjectArray(float[] value) {
        if (value == null) {
            return null;
        }
        if (value.length == 0) {
            return new Object[0];
        }
        final Float[] result = new Float[value.length];
        for (int i = 0; i < value.length; ++i) {
            result[i] = value[i];
        }
        return result;
    }

    /**
     * double[] 转 Object[]
     *
     * @param value double[]
     * @return Object[]
     */
    private static Object[] toObjectArray(double[] value) {
        if (value == null) {
            return null;
        }
        if (value.length == 0) {
            return new Object[0];
        }
        final Double[] result = new Double[value.length];
        for (int i = 0; i < value.length; ++i) {
            result[i] = value[i];
        }
        return result;
    }

    public Integer getField() {
        return field;
    }

    /**
     * just for deserialize
     * @deprecated this method is deprecated, you can use {@link FieldArrayItem#FieldArrayItem(FieldEnumInterface, int...)} etc.
     */
    @Deprecated
    public void setField(Integer field) {
        this.field = field;
    }

    public Object[] getArrayValue() {
        return arrayValue;
    }

    /**
     * just for deserialize
     * @deprecated this method is deprecated, you can use {@link FieldArrayItem#FieldArrayItem(FieldEnumInterface, int...)} etc.
     */
    @Deprecated
    public void setArrayValue(Object[] arrayValue) {
        this.arrayValue = arrayValue;
    }
}
