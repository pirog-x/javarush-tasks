package javarush2019.level08.lesson03.t3;

import java.util.HashMap;
import java.util.Map;

/*
Коллекция HashMap из котов

Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
 */

public class Solution {
    public static void solution() {
        String[] catsNames = new String[]{"рыжуля", "марта", "мика", "куля", "буся", "мура", "милка", "симба", "варя", "аля"};
        Map<String, Cat> cats = fillMap(catsNames);

        for (Map.Entry<String, Cat> pair : cats.entrySet()) {
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " - " + value.toString());
        }

    }

    private static HashMap<String, Cat> fillMap(String[] arr) {
        HashMap<String, Cat> resultMap = new HashMap<>();

        for (String s : arr) {
            resultMap.put(s, new Cat(s));
        }

        return resultMap;
    }
}


class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name != null ? this.name : null;
    }
}