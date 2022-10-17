package javarush2019.level07.lesson09.t2;
import java.util.Scanner;
import java.util.ArrayList;

/*
Слова в обратном порядке:

Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи
оставшиеся элементы в обратном порядке.
 */

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String temp;
        for (int i = 0; i < 5; i++) {
            temp = scanner.next();
            list.add(temp);
        }

        list.remove(2);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
