package book.api;

import java.util.Set;

/**
 * @author: Robert Sun q
 * @date: 2023-03-12 22:19
 * @since: JDK-
 */
public class StackWalkerApi {
    public static void main(String[] args) {
        System.out.println("StackWalker API");
    }

    private void api(StackWalker stackWalker) {

        // 得到一个 StackWalker 实例。 选项包括 StackWalker.Option 枚举中的 RETAIN_CLASS_REFERENCE、SHOW_REFLECT_FRAMES、SHOW_HIDDEN_FRAMES
        StackWalker instance = StackWalker.getInstance();
        StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
        StackWalker.getInstance(Set.of(StackWalker.Option.RETAIN_CLASS_REFERENCE, StackWalker.Option.SHOW_HIDDEN_FRAMES));

        // 在每个帧上完成给定的动作，从最近调用的方法开始。
        // stackWalker.forEach(Consumer<? super StackWalker.StackFrame> action);

        // 对一个栈帧流应用给定的函数，返回这个函数的结果
        // stackWalker.walk(Function<? super Stream<StackWalker.StackFrame>, ? extends T> function);
    }
}
