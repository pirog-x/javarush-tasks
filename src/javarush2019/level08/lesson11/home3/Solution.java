package javarush2019.level08.lesson11.home3;
import java.util.Map;
import java.util.HashMap;

/*
Люди с одинаковыми именами и/или фамилиями

1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя». 2. Пусть среди
этих 10 человек есть люди с одинаковыми именами и/или фамилиями.
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
 */

public class Solution {
    public static void solution() {
        Map<String, String> people = fillMap();
        printMap(people);
    }

    public static Map<String, String> fillMap() {
        Map<String, String> map = new HashMap<>(10);

        map.put("Петров", "Петр");
        map.put("Иванов", "Иван");
        map.put("Василисов", "Владимер");
        map.put("Жмуриков", "Антон");
        map.put("Дуров", "Павел");
        map.put("Костачкина", "Иван");
        map.put("Александрович", "Виктор");
        map.put("Пяточкин", "Илья");
        map.put("Трубочкина", "Галина");  // same surname
        map.put("Трубочкин", "Иван");     // same surname

        return map;
    }

    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
