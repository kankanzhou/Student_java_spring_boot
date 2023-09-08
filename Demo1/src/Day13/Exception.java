package Day13;

import java.io.FileNotFoundException;

/**
 * @Author: KanZhou
 * @Date: 2023-09-07 6:50 p.m.
 */
public class Exception {
    public static void main(String[] args) {
        try {
            readFile("ajdskajs");
        } catch (FileNotFoundException e) {
            System.out.println("there are some wrong with u");
        }
    }
    public static void readFile(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("This is not a valid file");
        }
    }
}
