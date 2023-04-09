package book.api;

import java.awt.*;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 20:55
 * @since: JDK-
 */
public class ToolkitApi {
    public static void main(String[] args) {
        System.out.println("Toolkit API");

        Toolkit.getDefaultToolkit().beep();
    }

    private void api(Toolkit toolkit) {

        // static 获取默认的工具箱。 工具箱包含有关GUI环境的信息
        Toolkit.getDefaultToolkit();

        // 发出一声铃响
        toolkit.beep();
    }
}
