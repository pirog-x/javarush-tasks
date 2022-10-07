package task0508;
import java.util.Scanner;

/*
Удаляем одинаковые строки
https://javarush.ru/tasks/com.javarush.task.pro.task05.task0508
*/

public class Solution {
    public static String[] strings;

    public static void solution() {
        Scanner scanner = new Scanner(System.in);


        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }


        String currentString;
        for (int i = 0; i < strings.length; i++) {
            currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}
