package javarush2019.level08.lesson08.t5;

/*
Удалить людей, имеющих одинаковые имена

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void solution() {
        Map<String, String> map = fillMap();

        printMap(map);
        removePeopleWithSameNames(map);
        printMap(map);
    }

    private static Map<String, String> fillMap() {
        Map<String, String> map = new HashMap<>(10);
        map.put("", "");

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


    }

    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}











