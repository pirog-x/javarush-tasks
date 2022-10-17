package javarush2019.lection07.task12.normal.t4;
import java.util.Scanner;
import java.util.ArrayList;

/*
Вводить с клавиатуры строки, пока пользователь не введёт строку “end

Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. “end” не учитывать.
Вывести строки на экран, каждую с новой строки
 */

public class Solution {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String temp;
        while (true) {
            temp = scanner.nextLine();
            if (temp.equals("end")) break;
            list.add(temp);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
