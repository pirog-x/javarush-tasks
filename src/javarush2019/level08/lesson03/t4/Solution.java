package javarush2019.level08.lesson03.t4;

import java.util.HashMap;
import java.util.Map;

/*
Вывести на экран список ключей

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.
 */

public class Solution {
    public static void solution() {
        Map<String, String> map = new HashMap<>();

        map.put("some", "text");
        map.put("date", "text");
        map.put("in", "text");
        map.put("this", "text");
        map.put("hash", "text");
        map.put("map", "text");
        map.put("wow", "text");
        map.put("I", "text");
        map.put("love", "text");
        map.put("java", "text");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey());
        }
    }
}
