package exam;

/**
 * @Author hui
 * @Description 1、编写一个递归版本的 reverse(s) 函数(或方法),以将字符串s倒置。
 * @Date
 * @Param s
 * @return
 */

public class Exam01 {

    public static String reverse(String s){

        if(s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);

    }
}
