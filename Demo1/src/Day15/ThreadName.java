package Day15;

/**
 * @Author: KanZhou
 * @Date: 2023-09-09 12:55 p.m.
 */
public class ThreadName extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
