package javarush2019.lection07.task09.t5;
import java.util.Scanner;
import java.util.ArrayList;

/*
Удвой слова

1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
3. Используя цикл for, выведи результат на экран, каждое значение с новой строки.
 */

public class Solution {
    public static void solution() {
        ArrayList<String> list = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            String temp = scanner.next();
            list.add(temp);
        }

        doubleValues(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void doubleValues(ArrayList<String> list) {
        int listSize = list.size();
        for (int i = 0; i < listSize * 2; i = i + 2) {
            list.add(i, list.get(i));
        }
    }
}
