package book.api;

import java.util.Objects;

/**
 * @author: Robert Sun q
 * @date: 2023-04-09 19:59
 * @since: JDK-
 */
public class ObjectApi {
    public static void main(String[] args) {
        System.out.println("Object API");
    }

    private void api(Object object) throws InterruptedException {

        // 返回对象的散列码。散列码可以是任意的整数，包括正数或负数。两个相等的对象要求返回相等的散列码，equals 和 hashCode 的定义必须兼容，即如果 x.equals(y) 为 true，x.hashCode() 必须等于 y.hashCode()
        int i = object.hashCode();

        // 返回一个散列码，由听过的所有对象的散列码组合而得到
        int hash = Objects.hash(object, new ObjectApi());

        // 如果 objects 为 null 返回 0， 否则返回  objects.hashcode()
        int i1 = Objects.hashCode(object);

        // 返回包含对象信息的类对象。
        Class<? extends ObjectApi> aClass = new ObjectApi().getClass();

        // 比较两个对象是否相等，如果两个对象指向同一块存储区域，方法返回true； 否则方法返回false。 要在自定义的类中覆盖这个方法。
        boolean equals = object.equals(new Object());

        // 返回表示这个对象值的字符串。要在自定义的类中覆盖这个方法。
        String s = object.toString();

        // 解除在这个对象上调用 await 方法的那些线程的阻塞状态。该方法只能在同步方法或同步块中调用。如果当前线程不是对象锁的所有者，该方法会抛出一个 IllegalMonitorStateException 异常
        object.notifyAll();

        // 随机选择一个在这个对象上调用 await 方法的线程，解除其阻塞状态。该方法只能在一个同步方法或同步块中调用。如果当前线程不是对象锁的所有者，该方法会抛出一个 IllegalMonitorStateException 异常
        object.notify();

        // 导致一个线程进入等待状态，直到它得到通知。该方法只能在一个同步方法或同步块中调用。如果当前线程不是对象锁的所有者，该方法会抛出一个 IllegalMonitorStateException 异常
        object.wait();

        // 导致一个线程进入等待状态，直到它得到通知或者经过了指定的时间。这些方法只能在同一个同步方法或同步块中调用。如果当前线程不是对象锁的所有者，这些方法会抛出 IllegalMonitorStateException 异常。纳秒数不能超过 1 000 000。
        object.wait(100L);
        object.wait(1000L, 10);
    }
}
