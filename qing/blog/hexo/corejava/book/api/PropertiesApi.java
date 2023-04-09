package book.api;

import java.io.*;
import java.util.Properties;

/**
 * @author: Robert Sun q
 * @date: 2023-03-19 22:43
 * @since: JDK-
 */
public class PropertiesApi {
    public static void main(String[] args) {
        System.out.println("Properties API");
    }

    private void api(Properties properties) throws IOException {

        // 创建一个空属性映射
        Properties properties1 = new Properties();

        // 用一组默认值创建一个空属性映射
        Properties properties2 = new Properties(properties);

        // 获得一个属性。返回与键关联的值，或者如果这个键未在表中出现，则返回默认值表中与这个键关联的值，或者如果键再默认值中也未出现，则返回 null
        Object key = properties.get("key");

        // 如果键未找到，获得有默认值的属性。返回与键关联的字符串，或者如果键再表中未出现，则返回默认字符串
        Object orDefault = properties.getOrDefault("key", "default_vualue");

        // 设置一个属性。返回给定键之间设置的值
        Object o = properties.setProperty("key", "value");

        // 从一个输入流加载一个属性映射
        properties.load(new FileInputStream("d"));

        // 将一个属性映射保存到一个输出流 header 是所存储文件的第一行
        properties.store(new FileOutputStream("c"), "header");
    }
}
