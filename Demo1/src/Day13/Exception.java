package Day13;

import java.io.FileNotFoundException;

/**
 * @Author: KanZhou
 * @Date: 2023-09-07 6:50 p.m.
 * finally : No matter if there is exception, it will be executed.
 */
public class Exception {
    public static void main(String[] args) {
        try {
            readFile("ajdskajs");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("release resource");
        }
    }
    public static void readFile(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("This is not a valid file");
        }
    }
}
