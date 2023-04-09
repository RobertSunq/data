package book.api;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 20:50
 * @since: JDK-
 */
public class TimerApi {

    public static void main(String[] args) {
        System.out.println("Timer API");
    }

    private void api(Timer timer) {

        // 构造一个定时器， 每经过 interval = 10 毫秒通知 listener 一次
        javax.swing.Timer timer1 = new javax.swing.Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
            }
        });


        // 启动定时器。一旦启动，定时器将调用监听器的 actionPerformed
        timer1.start();

        // 停止定时器。一旦停止，定时器将不再调用监听器的 actionPerformed
        timer1.stop();
    }


}
