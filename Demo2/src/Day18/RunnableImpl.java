package Day18;

/**
 * @Author: KanZhou
 * @Date: 2023-09-11 4:14 p.m.
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        syn();
    }

    public synchronized void syn() {
        while (ticket > 0) {
            System.out.println("This is the " + ticket + " ticket");
            ticket --;
        }
    }
}
