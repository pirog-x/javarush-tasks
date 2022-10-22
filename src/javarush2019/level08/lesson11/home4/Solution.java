package javarush2019.level08.lesson11.home4;

import java.util.*;

/*
Минимальное из N чисел

1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
 */

public class Solution {
    public static void solution() {
        List<Integer> list = getIntegerList();
        System.out.println(getMinimum(list));
    }

    public static List<Integer> getIntegerList() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) list.add(scanner.nextInt());

        return list;
    }

    public static int getMinimum(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>(List.copyOf(list));
        Collections.sort(tempList);
        return tempList.get(0);
    }
}
