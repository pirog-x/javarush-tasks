package javarush2019.lection07.task06.t2;
import java.util.ArrayList;
import java.util.Scanner;

/*
Задача 2. Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

*/

public class Solution {
    public static void solution(){
        ArrayList<String> list = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);

        int theBiggestSize = 0;
        for (int i = 0; i < 5; i++) {
            String temp = scanner.nextLine();
            list.add(temp);

            if (theBiggestSize < list.get(i).length()) {
                theBiggestSize = list.get(i).length();
            }
        }

        for (String s : list) {
            if (theBiggestSize == s.length()) {
                System.out.println(s);
            }
        }
    }
}
