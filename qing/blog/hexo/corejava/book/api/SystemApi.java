package book.api;

import java.io.Console;
import java.util.Properties;

/**
 * @author: Robert Sunq
 * @date: 2022-07-14 23:22
 * @since: JDK-
 */
public class SystemApi {

    public static void main(String[] args) {
        System.out.println(" API");
    }

    private void api(System system){

        // 如果可以进行交互，就返回一个 Console 对象通过控制台窗口与用户交互，头则返回null。对于任何一个在控制台窗口启动的程序，头可以使用Console对象。否则，是否可用取决与所使用的系统
        Console console = System.console();

        // 获取所有系统属性，引用必须有权限获取所有属性，否则会抛出一个安全异常。
        Properties properties = System.getProperties();

        // 获取给定建名对应的系统属性。应用必须有权限获取这个属性，否则会抛出一个安全异常。
        String key = System.getProperty("key");
        // 以下属性是总允许获得的
        // java.version
        // java.vendor
        // java.vendor.url
        // java.home
        // java.class.path
        // java.library.path
        // java.class.version
        // os.name
        // os.version
        // os.arch
        // file.separator
        // path.separator
        // line.separator
        // java.io.tempdir
        // user.name
        // user.home
        // user.dir
        // java.compiler
        // java.specification.version
        // java.specification.vendor
        // java.specification.name
        // java.vm.specification.version
        // java.vm.specification.vendor
        // java.vm.specification.name
        // java.vm.version
        // java.vm.vendor
        // java.vm.name
    }


}
