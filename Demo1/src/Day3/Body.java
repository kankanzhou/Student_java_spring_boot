package Day3;

/**
 * @Author: KanZhou
 * @Date: 2023-09-02 2:33 p.m.
 */
public class Body {
    protected int num;
    public void mainMethod() {
        System.out.println("this is a outer method");
    }
    public class Heart {
        public void subMethod() {
            System.out.println("This is a inner method");
        }
    }
    public void getInnerMethod() {
        new Heart().subMethod();
    }
}
