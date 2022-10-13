package tasks05.task18;
import java.util.Arrays;

/*
Сортировка массива
https://javarush.ru/tasks/com.javarush.task.pro.task05.task0518
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void solution() {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

