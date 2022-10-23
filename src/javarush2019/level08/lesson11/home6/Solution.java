package javarush2019.level08.lesson11.home6;

import java.util.ArrayList;
import java.util.List;

/*
Вся семья в сборе

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
 */

public class Solution {
    public static void solution() {
        Human child1 = new Human("Artem", true, 12, null);
        Human child2 = new Human("Vika", false, 9, null);
        Human child3 = new Human("Gena", true, 17, null);

        List<Human> children = new ArrayList<>(3);
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human mom = new Human("Lera", false, 43, new ArrayList<>(List.copyOf(children)));
        Human dad = new Human("Andrew", true, 45, new ArrayList<Human>(List.copyOf(children)));

        children.clear();
        children.add(dad);
        Human gm1 = new Human("Galay", false, 78, new ArrayList<>(List.copyOf(children)));
        Human gf1 = new Human("Vova", true, 80, new ArrayList<>(List.copyOf(children)));

        children.clear();
        children.add(mom);
        Human gm2 = new Human("Alona", false, 77, new ArrayList<>(List.copyOf(children)));
        Human gf2 = new Human("Igor", true, 81, new ArrayList<>(List.copyOf(children)));


        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        System.out.println(mom.toString());
        System.out.println(dad.toString());

        System.out.println(gm1.toString());
        System.out.println(gf1.toString());

        System.out.println(gm2.toString());
        System.out.println(gf2.toString());
    }
}


class Human {
    private String name;
    private boolean gender;
    private int age;
    private ArrayList<Human> children;

    public Human(String name, boolean gender, int age, ArrayList<Human> children) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.children = children;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Name: " + this.name + ", gender: " + (this.gender ? "male" : "female") + ", age: " + this.age);

        if (this.children != null) {
            result.append(", children: [");
            for (Human h : this.children) {
                result.append(h.getName()).append(", ");
            }
            result.append("\b\b]");
        } else {
            result.append(", children: [none]");
        }
        return result.toString();
    }
}