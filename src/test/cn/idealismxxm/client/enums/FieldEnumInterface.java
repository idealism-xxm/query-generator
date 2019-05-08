package cn.idealismxxm.client.enums;

/**
 * 字段枚举 接口
 *
 * @author idealism
 * @date 2018/9/12
 */
public interface FieldEnumInterface {
    /**
     * 获取 字段标识
     *
     * @return 字段标识
     */
    Integer getCode();

    /**
     * 获取 字段描述
     *
     * @return 字段描述
     */
    String getDescription();
}
