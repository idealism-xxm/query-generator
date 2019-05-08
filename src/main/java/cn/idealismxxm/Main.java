package cn.idealismxxm;

import cn.idealismxxm.exception.BusinessException;
import cn.idealismxxm.utils.FileUtils;
import com.itranswarp.compiler.JavaStringCompiler;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * 命令行启动类
 *
 * @author idealism
 * @date 2018/9/11
 */
public class Main {
    /**
     * 启动格式：query-generator filepath
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) throws Exception {
        try {
            if (args.length < 2) {
                throw BusinessException.buildCustomizedMessageException("启动格式：query-generator filepath");
            }

            // 1. 编译并载入 class 对象
            Class<?> clazz = loadClass(args[1]);

            // 2. 读取模版文件，生成相应代码 TODO


        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("未知错误");
        }
    }

    /**
     * 编译载入 filepath 的 class 对象
     *
     * @param filepath 文件路径
     * @return class 对象
     */
    private static Class<?> loadClass(String filepath) throws Exception {
        // 编译生成 class
        String filename = new File(filepath).getName();
        String source = FileUtils.readString(filepath);
        String classPath = getClassPath(filename, source);
        // TODO 由于 compiler 已经是实例，所以可以将 results 封装在 JavaStringCompiler 内（putAll）
        JavaStringCompiler compiler = new JavaStringCompiler();
        Map<String, byte[]> results = compiler.compile(filename, source);
        return compiler.loadClass(classPath, results);
    }

    /**
     * 通过 源码 获取 类路径
     *
     * @param filename 文件名
     * @param source   源码
     */
    private static String getClassPath(String filename, String source) {
        if (source == null || source.isEmpty()) {
            throw BusinessException.buildCustomizedMessageException("源码格式错误");
        }

        int startIndex = source.indexOf(" ") + 1;
        int endIndex = source.indexOf(";");
        if (startIndex == 0 || endIndex == -1) {
            throw BusinessException.buildCustomizedMessageException("源码必须显示声明包");
        }

        String packageName = source.substring(startIndex, endIndex);
        return packageName + "." + filename.split("[.]")[0];
    }
}
