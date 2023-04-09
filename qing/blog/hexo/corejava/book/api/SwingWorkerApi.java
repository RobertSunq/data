package book.api;

import javax.swing.*;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 21:32
 * @since: JDK-
 */
public class SwingWorkerApi {
    public static void main(String[] args) {
        System.out.println("SwingWorker API");
    }

    private <T, V> void api(SwingWorker<T, V> object) {

        // 要覆盖这个方法来执行后台的任务并返回这个工作的结果
        // abstract T doInBackGround()

        // 要覆盖这个方法在事件分配线程中处理中间进度数据
        // void process(List<V> data)

        // 将中间进度数据转发到事件分配线程。从 doInBackground 调用这个方法。
        // void publish(V... data)

        // 调度这个工作器在一个工作线程中执行
        // void execute()

        // 得到这个工作器的状态，可用是 PENDING、STARTED 或 DONE
        // SwingWorker.StateValue getState()
    }
}
