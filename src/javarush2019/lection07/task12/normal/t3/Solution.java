package javarush2019.lection07.task12.normal.t3;
import java.util.Scanner;

/*
Максимальное и минимальное числа в массиве

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
 */

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
