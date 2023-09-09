package Day16;

/**
 * @Author: KanZhou
 * @Date: 2023-09-09 1:22 p.m.
 */
public class Demo01 {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread t = new Thread(r);
        t.start();
        System.out.println(Thread.currentThread().getName());
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("first" + i);
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("second" + i);
                }
            }
        }).start();
    }
}
