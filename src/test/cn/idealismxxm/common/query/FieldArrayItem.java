package cn.idealismxxm.common.query;

/**
 * 字段 集合项
 *
 * @author idealism
 * @date 2018/9/5
 */
public class FieldArrayItem {
    /**
     * 字段标识
     */
    private Integer field;

    /**
     * 字段 数组值
     */
    private Object[] arrayValue;

    private FieldArrayItem() {
        throw new RuntimeException("FieldArrayItem 不能调用默认构造方法");
    }

    public FieldArrayItem(int field, int... value) {
        this(field, toObjectArray(value));
    }

    public FieldArrayItem(int field, long... value) {
        this(field, toObjectArray(value));
    }

    public FieldArrayItem(int field, float... value) {
        this(field, toObjectArray(value));
    }

    public FieldArrayItem(int field, double... value) {
        this(field, toObjectArray(value));
    }

    public FieldArrayItem(int field, String... value) {
        this(field, (Object[]) value);
    }

    public FieldArrayItem(int field, java.util.Date... value) {
        this(field, (Object[]) value);
    }

    private FieldArrayItem(int field, Object[] value) {
        this.field = field;
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
}
