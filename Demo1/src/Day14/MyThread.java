package Day14;

/**
 * @Author: KanZhou
 * @Date: 2023-09-08 4:41 p.m.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread" + i);
        }
    }
}
