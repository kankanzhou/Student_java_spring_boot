package Day1;

/**
 * @Author: KanZhou
 * @Date: ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = (Animal) a;
        b.speak();
        a.getName();
        System.out.println(Cat.name);
    }
}