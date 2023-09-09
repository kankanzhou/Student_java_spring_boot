package Day15;

/**
 * @Author: KanZhou
 * @Date: 2023-09-09 12:57 p.m.
 */
public class Demo01 {
    public static void main(String[] args) {
        ThreadName t = new ThreadName();
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
