package tasks05.task0515;
import java.util.Arrays;

/*
Сравнение двумерных массивов
*/

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void solution() {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}

