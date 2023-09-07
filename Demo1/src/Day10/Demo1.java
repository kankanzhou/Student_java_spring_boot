package Day10;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: KanZhou
 * @Date: 2023-09-07 12:01 a.m.
 * @ JDK9 List Set Map
 */
public class Demo1 {
    public static void main(String[] args) {
        String s = "aadakjaljd";
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (Character c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

    }
}
