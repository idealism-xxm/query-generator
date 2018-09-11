package cn.idealismxxm.common.checker;

/**
 * 字段校验器 接口 抽象实现
 * @author idealism
 * @date 2018/9/9
 */
public abstract class AbstractFieldChecker implements FieldChecker {

    @Override
    public boolean check(Object value) {
        // 1. 空值校验
        if(value == null) {
            return false;
        }

        // 2. 类型校验
        if(!this.getFieldClass().equals(value.getClass())) {
            return false;
        }
        return true;
    }

    public abstract Class getFieldClass();
}
