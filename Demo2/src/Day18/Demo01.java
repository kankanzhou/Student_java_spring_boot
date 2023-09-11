package Day18;

/**
 * @Author: KanZhou
 * @Date: 2023-09-11 4:16 p.m.
 */
public class Demo01 {
    public static void main(String[] args) {
        Runnable run= new RunnableImpl();
        Thread t = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t.start();
        t1.start();
        t2.start();
    }
}
