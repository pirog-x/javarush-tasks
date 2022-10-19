package javarush2019.level08.lesson06.t3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Измерить сколько времени занимает 10 тысяч вставок для каждого списка

Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
 */

public class Solution {
    public static void solution() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("arrayList = " + getTimeMsOfInsert(arrayList));
        System.out.println("linkedList = " + getTimeMsOfInsert(linkedList));
    }

    private static void insert(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
    }

    private static long getTimeMsOfInsert(List<Integer> list) {
        Date start = new Date();
        insert(list);
        Date end = new Date();

        return (long)(end.getTime() - start.getTime());
    }
}
