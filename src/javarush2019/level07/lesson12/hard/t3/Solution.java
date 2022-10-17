package javarush2019.level07.lesson12.hard.t3;
import java.util.Scanner;

/*
Задача по алгоритмам.
Задача: Программа вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
