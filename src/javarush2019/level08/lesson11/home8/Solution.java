package javarush2019.level08.lesson11.home8;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
 */

public class Solution {
    public static void solution() {
        List<Integer> list = fillArrayList();
        System.out.println(getTheGreatestNumbers(list, 5));
    }

    public static List<Integer> fillArrayList() {
        List<Integer> list = new ArrayList<>(20);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) list.add(scanner.nextInt());
        return list;
    }

    public static List<Integer> getTheGreatestNumbers(List<Integer> list, int range) {
        if (range <= 0) return null;
        if (range > list.size()) return null;
        if (range == list.size()) return list;

        List<Integer> tempList = new ArrayList<>(List.copyOf(list));
        bubbleSort(tempList, false);

        return new ArrayList<>(tempList.subList(0, range));
    }

    public static void bubbleSort(List<Integer> list, boolean inOrder) {
        int temp;

        if (inOrder) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list.get(j) < list.get(j + 1)) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }
    }
}
