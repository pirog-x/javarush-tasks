package javarush2019.level08.lesson11.home5;

import java.util.Scanner;

/*
Мама Мыла Раму. Теперь с большой буквы

Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.
Пример вывода:
Мама Мыла Раму.
 */

public class Solution {
    public static void solution() {
        String s = fillString();
        s = changeFirstLetterInWordToUpper(s);
        System.out.println(s);
    }

    public static String fillString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String changeFirstLetterInWordToUpper(String word) {
        char[] wordArr = word.toCharArray();

        if (wordArr[0] != ' ') wordArr[0] = Character.toUpperCase(wordArr[0]);
        for (int i = 0; i < word.length(); i++) {
            if (wordArr[i] == ' ') wordArr[i + 1] = Character.toUpperCase(wordArr[i + 1]);
        }

        return new String(wordArr);
    }
}
