package javarush2019.level07.lesson12.normal.t1;
import java.util.Scanner;
import java.util.ArrayList;

/*
Вывести числа в обратном порядке

Ввести с клавиатуры 10 чисел и заполнить ими список.
Используя цикл for вывести их в обратном порядке.
 */

public class Solution {
    public static void solution() {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int temp = scanner.nextInt();
            list.add(temp);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + ", ");
        }
    }
}
