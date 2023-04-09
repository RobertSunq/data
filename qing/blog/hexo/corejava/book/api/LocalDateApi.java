package book.api;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author: Robert Sunq
 * @date: 2022-07-20 0:34
 * @since: JDK-
 */
public class LocalDateApi {

    public static void main(String[] args) {
        System.out.println("LocalDateApi API");
    }

    private void api(LocalDate localDate) {

        // static 构造一个表示当前日期的对象
        LocalDate now = LocalDate.now();

        // static 构造一个表示给定日期的对象
        LocalDate of = LocalDate.of(2022, 7, 21);

        // 得到当前日期的年
        int year = localDate.getYear();

        // 得到当前日期的月
        int monthValue = localDate.getMonthValue();

        // 得到当前日期的日
        int dayOfMonth = localDate.getDayOfMonth();

        // 得到当前日期是星期几，作为DayOfWeek类的一个实例返回
        // 调用getValue 来得到 1 -- 7 之间的一个数，表示这是星期几， 1 表示星期一， 2 表示星期天
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        // 当前日期加一天
        LocalDate localDate1 = localDate.plusDays(1);

        // 当前日期减一天
        LocalDate localDate2 = localDate.minusDays(1);
    }
}
