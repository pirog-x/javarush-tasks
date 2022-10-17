package javarush2019.level07.lesson12.normal.t2;
import java.util.Scanner;
import java.util.ArrayList;

/*
Переставить M первых строк в конец списка

Ввести с клавиатуры 2 числа N и M
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
 */

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>(n);

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String temp = scanner.nextLine();
            list.add(temp);
        }


        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);
        }

        for (String s : list) {
            System.out.print(s + ", ");
        }
    }
}
