package Day11;

import java.util.Objects;

/**
 * @Author: KanZhou
 * @Date: 2023-09-07 11:52 a.m.
 */
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        if (s1 == s2) {
            System.out.println("s1 == s2");
        }
        if (s1 == s3) {
            System.out.println("s1 == s3");
        }
        if (s1.equals(s3)) {
            System.out.println("s1 and s3 are equal");
        }
        int[] arr = null;
        method(arr);
    }

    public static void method(int[] arr) {
        Objects.requireNonNull(arr);
    }
}
