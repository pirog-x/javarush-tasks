package javarush2019.level08.lesson06.t2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Провести 10 тысяч вставок, удалений

Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
 */

public class Solution {
    public static void solution() {
        List<Object> linkedList = new LinkedList<>();
        insert(linkedList);
        get(linkedList);
        set(linkedList);
        remove(linkedList);

        List<Object> arrayList = new ArrayList<>();
        insert(arrayList);
        get(arrayList);
        set(arrayList);
        remove(arrayList);

    }

    private static void insert(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    private static void get(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    private static void set(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i, i);
        }
    }

    private static void remove(List list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
    }
}
