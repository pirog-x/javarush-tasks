package tasks05.task0511;

import java.util.Scanner;

/*
Создаем двумерный массив
https://javarush.ru/tasks/com.javarush.task.pro.task05.task0511
*/

public class Solution {
    public static int[][] multiArray;

    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        // arr[row][column]
        int row = scanner.nextInt();
        multiArray = new int[row][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }
    }
}
