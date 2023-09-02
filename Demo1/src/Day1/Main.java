package Day1;


public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        ((Cat) a).speak();
        a.getName();
    }
}