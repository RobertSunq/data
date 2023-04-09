package book.api;

import java.util.Stack;

/**
 * @author: Robert Sun q
 * @date: 2023-03-19 23:07
 * @since: JDK-
 */
public class StackApi {
    public static void main(String[] args) {
        System.out.println("Stack API");
    }

    private <E> void api(Stack<E> stack, E e) {

        // 将item压入栈并返回item
        E push = stack.push(e);

        // 弹出并返回栈顶的item。如果栈为空，不要调用这个方法
        E pop = stack.pop();

        // 返回栈顶元素，但不弹出。如果栈为空，不要调用这个方法
        E peek = stack.peek();
    }
}
