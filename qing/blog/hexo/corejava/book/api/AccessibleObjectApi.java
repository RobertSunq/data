package book.api;

import java.lang.reflect.AccessibleObject;

/**
 * @author: Robert Sun q
 * @date: 2023-02-04 23:06
 * @since: JDK-
 */
public class AccessibleObjectApi {

    public static void main(String[] args) {
        System.out.println("AccessibleObject API");
    }

    private void api(AccessibleObject accessibleObject) {

        // 设置或取消这个可访问对象的可访问标志，如果拒绝访问则抛出一个 InaccessibleObjectException 异常
        accessibleObject.setAccessible(true);

        // 为这个可访问的对象设置可访问标志，如果拒绝访问则返回 false
        boolean b = accessibleObject.trySetAccessible();

        // 得到这个可访问对象的可访问标志位
        boolean accessible = accessibleObject.isAccessible();

        // 用于设置一个对象数组的可访问标志
        AccessibleObject.setAccessible(new AccessibleObject[]{}, Boolean.TRUE);

    }

}
