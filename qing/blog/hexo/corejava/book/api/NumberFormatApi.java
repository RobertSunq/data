package book.api;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author: Robert Sun q
 * @date: 2022-12-05 1:32
 * @since: JDK-
 */
public class NumberFormatApi {

    public static void main(String[] args) {
        System.out.println(" API");
    }

    private void api(NumberFormat numberFormat) throws ParseException {


        // 返回数字值， 如果无法解析抛出异常 ParseException
        Number parse = numberFormat.parse("1000");

    }

}
