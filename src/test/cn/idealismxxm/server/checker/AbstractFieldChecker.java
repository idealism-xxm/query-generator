package cn.idealismxxm.server.checker;

import cn.idealismxxm.client.enums.FieldEnumInterface;

/**
 * 字段校验器 接口 抽象实现
 *
 * @author idealism
 * @date 2018/9/9
 */
public abstract class AbstractFieldChecker implements FieldChecker {

    @Override
    public void check(Object value) {
        // 通用校验 和 定制化校验都通过 才算校验通过
        // 子类也可以覆盖 check 方法，可以不进行通用校验
        this.commonCheck(value);
        this.diyCheck(value);
    }

    /**
     * 所有类通用校验
     *
     * @param value 字段值
     */
    protected final void commonCheck(Object value) {
        // 1. 空值校验
        if (value == null) {
            throw new IllegalArgumentException(String.format("filed value [%s] must not be null", this.getFieldEnum().getDescription()));
        }

        // 2. 类型校验
        if (!this.getFieldClass().equals(value.getClass())) {
            throw new IllegalArgumentException(String.format("filed value [%s] type error, expected: %s, actual: %s",
                    this.getFieldEnum().getDescription(), this.getFieldClass().getName(), value.getClass().getName()));
        }
    }


    /**
     * 子类定制化校验
     *
     * @param value 字段值
     */
    protected void diyCheck(Object value) {

    }

    /**
     * 返回待校验字段的真实类型
     *
     * @return Class
     */
    public abstract Class getFieldClass();

    /**
     * 返回待校验字段的枚举
     *
     * @return FieldEnumInterface
     */
    public abstract FieldEnumInterface getFieldEnum();
}
