package Day17;

/**
 * @Author: KanZhou
 * @Date: 2023-09-09 2:06 p.m.
 */
public class Demo1 {
    public static void main(String[] args) {
        Runnable r = new RunnableImpl();
        Thread t = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t.start();
        t1.start();
        t2.start();
    }
}
