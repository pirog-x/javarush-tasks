package javarush2019.level08.lesson03.t5;

import java.util.HashMap;
import java.util.Map;

/*
Вывести на экран список значений

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
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

        printValue(map);
    }

    private static void printValue(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}
