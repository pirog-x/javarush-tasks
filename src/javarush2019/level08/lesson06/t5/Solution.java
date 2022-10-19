package javarush2019.level08.lesson06.t5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения
данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
 */

public class Solution {
    // add, set, get, remove
    public static List listForAddAndInsert() {
        return new LinkedList<>();
    }

    public static List listForSet() {
        return new ArrayList<>();
    }

    public static List listForGet() {
        return new ArrayList<>();
    }

    public static List listForRemove() {
        return new LinkedList<>();
    }
}
