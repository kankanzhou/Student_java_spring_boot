package Day16;

/**
 * @Author: KanZhou
 * @Date: 2023-09-09 1:21 p.m.
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
