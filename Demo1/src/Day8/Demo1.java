package Day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: KanZhou
 * @Date: 2023-09-05 12:16 a.m.
 */
public class Demo1 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator<Integer> i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
