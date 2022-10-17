package javarush2019.lection07.task12.normal.t6;

/*
Семья

Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе
объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 */


/*
Два дедушки,
две бабушки,
отец,
мать,
трое детей.
 */
public class Solution {
    public static void solution() {
        Human gf1 = new Human("Саша", true, 72);
        Human gm1 = new Human("Шура", false, 70);

        Human gf2 = new Human("Толя", true, 74);
        Human gm2 = new Human("Галя", false, 71);

        Human dad = new Human("Сергей", true, 50, gf1, gm1);
        Human mom = new Human("Лена", false, 48, gf2, gm2);

        Human son1 = new Human("Виталик", true, 17, mom, dad);
        Human son2 = new Human("Дима", true, 20, mom, dad);
        Human daughter1 = new Human("Диана", true, 22, mom, dad);


        System.out.println(gf1.toString());
        System.out.println(gm1.toString() + "\n");

        System.out.println(gf2.toString());
        System.out.println(gm2.toString() + "\n");

        System.out.println(dad.toString());
        System.out.println(mom.toString() + "\n");

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter1.toString());
    }
}


class Human {
    private String name;
    private final boolean gender;
    private int age;
    private final Human dad;
    private final Human mom;

    public Human(String name, boolean gender, int age, Human dad, Human mom) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dad = dad;
        this.mom = mom;
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mom = null;
        this.dad = null;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String result = new String();

        result = "имя: " + this.name;
        result += ", пол:" + (this.gender ? "мужской" : "женский");
        result += ", возраст: " + this.age;
        result += ", отец: " + (this.dad == null ? "-" : this.dad.getName());
        result += ", мама: " + (this.mom == null ? "-" : this.mom.getName());

        return result;
    }
}
