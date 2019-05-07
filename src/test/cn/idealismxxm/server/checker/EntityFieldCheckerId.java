package cn.idealismxxm.server.checker;

/**
 * 实体字段 Id 校验器
 *
 * @author idealism
 * @date 2018/9/9
 */
public class EntityFieldCheckerId extends AbstractFieldChecker {

    private static final EntityFieldCheckerId CHECKER = new EntityFieldCheckerId();

    private final Class clazz = Long.class;

    @Override
    public boolean diyCheck(Object value) {
        // 1. 转成真实类型，开始进行 id 字段的定制校验
        Long id = (Long) value;

        // 2. 定制校验
        // TODO your checker code here
        return true;
    }

    /**
     * 返回 id 字段的真实类型
     *
     * @return Class
     */
    public Class getFieldClass() {
        return this.clazz;
    }

    public static EntityFieldCheckerId getInstance() {
        return CHECKER;
    }

    private EntityFieldCheckerId() {
    }
}
