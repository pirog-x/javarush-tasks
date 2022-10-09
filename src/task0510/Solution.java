package task0510;


/*
Треугольный массив
https://javarush.ru/tasks/com.javarush.task.pro.task05.task0510
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void solution() {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }


        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}



















