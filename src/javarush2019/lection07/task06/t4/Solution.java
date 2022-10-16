package javarush2019.lection07.task06.t4;
import java.util.ArrayList;
import java.util.Scanner;


/*
10 строчек в начало списка

    1. Создай список строк в методе main.
    2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
    3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void solution() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String temp;
        for (int i = 0; i < 10; i++) {
            temp = scanner.nextLine();
            list.add(0, temp);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
