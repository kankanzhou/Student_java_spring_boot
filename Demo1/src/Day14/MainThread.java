package Day14;

/**
 * @Author: KanZhou
 * @Date: 2023-09-07 7:11 p.m.
 */
public class MainThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main" + i);
        }
        new MyThread();
    }
}
