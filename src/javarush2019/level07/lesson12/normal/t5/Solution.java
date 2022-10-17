package javarush2019.level07.lesson12.normal.t5;

/*
Бум

Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку,
воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.

Пример:
30
29
…
1
0
Бум!
 */

public class Solution {
    public static void solution() {
        int i = 30;

        while (i != -1) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i--;
        }

        System.out.println("Бум!");
    }
}
