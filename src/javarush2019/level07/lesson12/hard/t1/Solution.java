package javarush2019.level07.lesson12.hard.t1;
import java.util.ArrayList;
import java.util.Scanner;

/*
Нужно исправить программу, чтобы компилировалась и работала.
Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
 */

public class Solution {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            int age = scanner.nextInt();
            int weight = scanner.nextInt();
            int tailLength = scanner.nextInt();

            cats.add(new Cat(name, age, weight, tailLength));
            scanner.nextLine();
        }

        printList();
    }

    public static void printList() {
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }
}


class Cat {
    private String name;
    private int age;
    private int weight;
    private int tailLength;

    Cat (String name, int age, int weight, int tail) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tailLength = tail;
    }

    public String toString() {
        String result;

        result = "Cat name is " + this.name;
        result += ", age is " + this.age;
        result += ", weight is " + this.weight;
        result += ", tail = " + this.tailLength;

        return result;
    }
}
