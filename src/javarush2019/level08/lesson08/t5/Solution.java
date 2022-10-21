package javarush2019.level08.lesson08.t5;

import java.util.HashMap;
import java.util.Map;

/*
Удалить людей, имеющих одинаковые имена

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
 */

public class Solution {
    public static void solution() {
        Map<String, String> map = fillMap();

        System.out.println("before:");
        printMap(map);

        removePeopleWithSameNames(map);

        System.out.println("\n\nafter:");
        printMap(map);
    }

    private static Map<String, String> fillMap() {
        Map<String, String> map = new HashMap<>(10);

        map.put("Петров", "Петр");
        map.put("Иванов", "Иван");
        map.put("Василисов", "Виктор");
        map.put("Жмуриков", "Антон");
        map.put("Дуров", "Павел");
        map.put("Костачкина", "Иван");
        map.put("Александрович", "Виктор");
        map.put("Пяточкин", "Илья");
        map.put("Жильева", "Галина");
        map.put("Трубочкин", "Иван");

        return map;
    }

    private static void removePeopleWithSameNames(Map<String, String> map) {
        if (map == null || map.size() == 0) return;

        Map<String, String> tempMap = Map.copyOf(map);
        boolean used = false;

        for (Map.Entry<String, String> pairOut : tempMap.entrySet()) {
            for (Map.Entry<String, String> pairIn : tempMap.entrySet()) {
                if (pairOut.getValue().equals(pairIn.getValue()) && !pairOut.getKey().equals(pairIn.getKey())) {
                    map.remove(pairIn.getKey());
                    used = true;
                }
            }
            if (used) {
                map.remove(pairOut.getKey());
                used = false;
            }
        }
    }

    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}











