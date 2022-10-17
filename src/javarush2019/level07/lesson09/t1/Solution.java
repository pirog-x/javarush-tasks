package javarush2019.level07.lesson09.t1;
import java.util.ArrayList;
import java.util.Scanner;

/*
Три массива

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.

2. Метод printList должен выводить на экран все элементы списка с новой строки.

3. Используя метод printList, выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который
для x%2, потом последний.
 */

public class Solution {
    public static void solution() {
        ArrayList<Integer> mainList = new ArrayList<>(20);
        Scanner scanner = new Scanner(System.in);

        int temp = 0;
        for (int i = 0; i < 20; i++) {
            temp = scanner.nextInt();
            mainList.add(temp);
        }


        ArrayList<Integer> mulOfTwo = new ArrayList<>();
        ArrayList<Integer> mulOfThree = new ArrayList<>();
        ArrayList<Integer> otherNums = new ArrayList<>();

        for (Integer i : mainList) {
            if (i % 2 == 0 && i % 3 == 0) {
                mulOfTwo.add(i);
                mulOfThree.add(i);
            } else if (i % 2 == 0) {
                mulOfTwo.add(i);
            } else if (i % 3 == 0) {
                mulOfThree.add(i);
            } else {
                otherNums.add(i);
            }
        }

        printList(mulOfThree);
        System.out.println();
        printList(mulOfTwo);
        System.out.println();
        printList(otherNums);
    }


    private static <T> void printList(ArrayList<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
