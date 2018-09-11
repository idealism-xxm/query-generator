package cn.idealismxxm.common.checker;

/**
 * 字段校验器
 *
 * @author idealism
 * @date 2018/9/5
 */
public interface FieldChecker {
    /**
     * 校验字段是否合法
     * @return true：校验通过；false：校验不通过
     */
    boolean check(Object value);
}
