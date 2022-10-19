package javarush2019.level08.lesson06.t4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка

Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.
 */

public class Solution {
    public static void solution() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        insert(arrayList);
        insert(linkedList);

        System.out.println("arrayList = " + getTimeMsOfGet(arrayList));
        System.out.println("linkedList = " + getTimeMsOfGet(linkedList));
    }

    private static void get(List<Integer> list) {
        int toGet = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(toGet);
        }
    }

    private static void insert(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
    }

    private static long getTimeMsOfGet(List<Integer> list) {
        Date start = new Date();
        get(list);
        Date end = new Date();

        return end.getTime() - start.getTime();
    }
}
