package cn.idealismxxm.server.checker;

import cn.idealismxxm.client.enums.FieldEnumInterface;
import cn.idealismxxm.server.enums.EntityFieldEnum;

/**
 * 实体字段 name 校验器
 *
 * @author idealism
 * @date 2018/9/9
 */
public class EntityFieldCheckerName extends AbstractFieldChecker {

    private static final EntityFieldCheckerName CHECKER = new EntityFieldCheckerName();

    private final Class clazz = String.class;

    @Override
    public void diyCheck(Object value) {
        // 1. 转成真实类型，开始进行 name 字段的定制校验
        String id = (String) value;

        // 2. 定制校验
        // TODO your checker code here
    }

    @Override
    public Class getFieldClass() {
        return this.clazz;
    }

    @Override
    public FieldEnumInterface getFieldEnum() {
        return EntityFieldEnum.NAME;
    }

    public static EntityFieldCheckerName getInstance() {
        return CHECKER;
    }

    private EntityFieldCheckerName() {
    }
}
