package javarush2019.level07.lesson12.hard.t2;
import java.util.ArrayList;
import java.util.Scanner;

/*
Нужно добавить в программу новую функциональность.

Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается,
если нечётное – утраивается. Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
 */

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String temp = scanner.nextLine();
            if (temp.isEmpty()) break;

            list.add(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                list.set(i, list.get(i) + " " + list.get(i));
            } else {
                list.set(i, list.get(i) + " " + list.get(i) + " " + list.get(i));
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
