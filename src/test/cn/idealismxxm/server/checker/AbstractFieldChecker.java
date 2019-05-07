package cn.idealismxxm.server.checker;

/**
 * 字段校验器 接口 抽象实现
 *
 * @author idealism
 * @date 2018/9/9
 */
public abstract class AbstractFieldChecker implements FieldChecker {

    @Override
    public boolean check(Object value) {
        // 通用校验 和 定制化校验都通过 才算校验通过
        // 子类也可以覆盖 check 方法，可以不进行通用校验
        return this.commonCheck(value) && this.diyCheck(value);
    }

    /**
     * 所有类通用校验
     *
     * @param value 字段值
     * @return true：校验通过；false：校验不通过
     */
    protected final boolean commonCheck(Object value) {
        // 1. 空值校验
        if (value == null) {
            return false;
        }

        // 2. 类型校验
        return this.getFieldClass().equals(value.getClass());
    }


    /**
     * 子类定制化校验
     *
     * @param value 字段值
     * @return true：校验通过；false：校验不通过
     */
    protected boolean diyCheck(Object value) {
        return true;
    }

    public abstract Class getFieldClass();
}
