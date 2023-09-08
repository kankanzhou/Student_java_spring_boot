package Day12;

/**
 * @Author: KanZhou
 * @Date: 2023-09-07 12:33 p.m.
 */
public class Exception {
    public static void main(String[] args) {
        int num = 100;
        if (num != 10) {
            throw new RuntimeException("this is a error");
        }
    }
}
