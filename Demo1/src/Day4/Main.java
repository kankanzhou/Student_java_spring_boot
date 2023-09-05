package Day4;

/**
 * @Author: KanZhou
 * @Date: 2023-09-02 3:19 p.m.
 */

public class Main {
    public static void main(String[] args) {
        MyInterface e = new MyInterface() {
            @Override
            public void method() {
                System.out.println("inner obj");
            }
        };
        e.method();

        new MyInterface() {
            @Override
            public void method() {
                System.out.println("This anonymous");
            }
        }.method();
    }
}
