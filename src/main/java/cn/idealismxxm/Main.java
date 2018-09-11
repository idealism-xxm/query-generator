package cn.idealismxxm;

import cn.idealismxxm.utils.FileUtils;
import com.itranswarp.compiler.JavaStringCompiler;

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
     * 启动格式：query-generator folderPath filename classname
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) throws Exception {
        if(args.length < 4) {
            System.out.println("启动格式：query-generator folderPath filename classname");
            return ;
        }

        String source = FileUtils.readString(args[1]);
        // TODO 由于 compiler 已经是实例，所以可以将 results 封装在 JavaStringCompiler 内（putAll）
        JavaStringCompiler compiler = new JavaStringCompiler();
        // TODO 文件名自动识别
        Map<String, byte[]> results = compiler.compile(args[2], source);
        // TODO 包名自动识别
        Class<?> clazz = compiler.loadClass(args[3], results);
    }
}
