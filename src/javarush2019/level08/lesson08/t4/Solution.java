package javarush2019.level08.lesson08.t4;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
Удалить всех людей, родившихся летом

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
 */

public class Solution {
    @Deprecated
    public static void solution() {
        Map<String, Date> map = fillMap();
        removePeopleWithBirthdayOnSummer(map);

        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue().getMonth());
        }
    }

    @Deprecated
    private static Map<String, Date> fillMap() {
        Map<String, Date> map = new HashMap<>(10);

        map.put("Петров", new Date(2022, Calendar.JULY, 12));  // will remove
        map.put("Иванов", new Date(1999, Calendar.MARCH, 2));
        map.put("Василисов",new Date(2005, Calendar.SEPTEMBER, 6));
        map.put("Жмуриков", new Date(2030, Calendar.JANUARY, 9));
        map.put("Дуров", new Date(2006, Calendar.AUGUST, 16));  // will remove
        map.put("Костачкина", new Date(2017, Calendar.OCTOBER, 29));
        map.put("Александрович",new Date(1995, Calendar.JUNE, 1));  // will remove
        map.put("Пяточкин", new Date(1834, Calendar.DECEMBER, 23));
        map.put("Жильева", new Date(2077, Calendar.JUNE, 28));  // will remove
        map.put("Трубочкин", new Date(1906, Calendar.MARCH, 26));

        return map;
    }

    @Deprecated
    private static void removePeopleWithBirthdayOnSummer(Map<String, Date> map) {
        Map<String, Date> tempMap = Map.copyOf(map);

        for (Map.Entry<String, Date> pair : tempMap.entrySet()) {
            if (4 < pair.getValue().getMonth() && pair.getValue().getMonth() < 8) {
                map.remove(pair.getKey());
            }
        }
    }
}
