package Day7;

/**
 * @Author: KanZhou
 * @Date: 2023-09-04 10:37 p.m.
 */
public class Demo1 {
    public String method(StringBuilder s) {
        return s + "";
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append(123).append("kanzhou");
        System.out.println(s);
        Long i = 100L;
        System.out.println(i.longValue());
        String s1 = new Demo1().method(new StringBuilder(100));
        System.out.println(s1);
    }
}
