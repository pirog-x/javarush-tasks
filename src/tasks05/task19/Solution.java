package tasks05.task19;
import java.util.Arrays;

/*
Есть ли кто?
https://javarush.ru/tasks/com.javarush.task.pro.task05.task0519
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void solution() {
        int[] tempArr = Arrays.copyOf(array, array.length);

        Arrays.sort(tempArr);
        System.out.println(0 <= Arrays.binarySearch(tempArr, element));
    }
}
