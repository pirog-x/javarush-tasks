package javarush2019.level07.lesson09.t3;
import java.util.Scanner;
import java.util.ArrayList;

/*
Слово «именно»

1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for, вывести результат на экран. Каждый элемент списка с новой строки.
 */

public class Solution {
    public static void solution() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String temp = scanner.next();
            list.add(temp);
            list.add("именно");
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
