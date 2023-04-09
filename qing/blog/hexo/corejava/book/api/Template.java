package book.api;

/**
 * @author: Robert Sunq
 * @date: 2022-07-14 23:01
 * @since: JDK-
 */
public class Template {

    public static void main(String[] args) {
        System.out.println(" API");
    }

    private void api(Object object) {

    }

    public static void main1(String[] args) {
        String s = "d 3e d";
        StringBuilder stringBuilder = new StringBuilder();
        char ch;
        for(int i = 0;i < s.length();i++) {
            ch = s.charAt(i);
            if (ch == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(ch);
            }
        }
        stringBuilder.toString();
    }
}
