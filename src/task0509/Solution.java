package task0509;

/*
Таблица умножения
https://javarush.ru/tasks/com.javarush.task.pro.task05.task0509
*/


public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void solution() {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < 10; i++) {
            MULTIPLICATION_TABLE[0][i] = i + 1;
        }

        int tempNum;

        for (int i = 1; i < MULTIPLICATION_TABLE.length; i++) {
            tempNum = MULTIPLICATION_TABLE[i - 1][0] + 1;


            for (int j = 1; j < MULTIPLICATION_TABLE.length + 1; j++) {
                    MULTIPLICATION_TABLE[i][j - 1] = tempNum * j;
            }
        }


        for (int[] ints : MULTIPLICATION_TABLE) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
