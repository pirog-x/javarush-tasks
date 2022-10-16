package javarush2019.lection07.task06.t5;
import java.util.ArrayList;
import java.util.Scanner;

/*
Удали последнюю строку и вставь её в начало

1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void solution() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String temp;
        for (int i = 0; i < 5; i++) {
            temp = scanner.nextLine();
            list.add(temp);
        }

        for (int i = 0; i < 13; i++) {
            temp = list.remove(list.size() - 1);
            list.add(0, temp);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
