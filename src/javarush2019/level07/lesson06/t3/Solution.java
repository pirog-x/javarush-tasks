package javarush2019.level07.lesson06.t3;
import java.util.Scanner;
import java.util.ArrayList;

/*
Самая короткая строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int theSmallestSize = 0;
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());

            if (i == 0) {
                theSmallestSize = list.get(i).length();
            } else if (theSmallestSize > list.get(i).length()) {
                theSmallestSize = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (theSmallestSize == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
