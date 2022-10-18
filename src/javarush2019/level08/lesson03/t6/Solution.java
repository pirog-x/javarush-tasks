package javarush2019.level08.lesson03.t6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Коллекция HashMap из Object

Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5
 */

public class Solution {
    public static void solution() {
        Map<String, Object> map = new HashMap<>();

        map.put("some", 5);
        map.put("obj", 5.23);
        map.put("look", "for");
        map.put("it", true);
        map.put("one", null);
        map.put("two", new HashMap<String, Integer>());
        map.put("three", new List[10]);
        map.put("four", (Integer)12);
        map.put("five", (Double)3.38729834709);

        printMap(map);
    }

    private static void printMap(Map<String, Object> map) {
        for(Map.Entry<String, Object> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
