package Day17;

/**
 * @Author: KanZhou
 * @Date: 2023-09-09 2:04 p.m.
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        synchronized (obj) {
            while (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ticket + " ticket");
                ticket --;
            }
        }
    }
}
