package javarush2019.level08.lesson08.t3;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

/*
Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */

public class Solution {
    public static void solution() {
        Map<String, String> map = fillMap();
        System.out.println("checkSameName(map) = " + checkSameName(map, "Виктор"));
        System.out.println("checkSameName(map) = " + checkSameSurname(map, "Дуров"));
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

    private static int checkSameName(Map<String, String> map, String name) {
        int countOfSameNames = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(name)) countOfSameNames++;
        }
        return countOfSameNames;
    }

    private static int checkSameSurname(Map<String, String> map, String surname) {
        int countSameSurnames = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals(surname)) countSameSurnames++;
        }
        return countSameSurnames;
    }
}
