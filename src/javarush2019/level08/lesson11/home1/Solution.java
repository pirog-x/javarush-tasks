package javarush2019.level08.lesson11.home1;

import java.util.Set;
import java.util.HashSet;

/*
Set из котов

1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него три кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
   Каждый кот с новой строки.
 */

public class Solution {
    public static class Cat {}

    public static void solution() {
        Set<Cat> cats = createCats();

        printCats(cats);
        System.out.println();

        for (Cat c : cats) {
            cats.remove(c);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>(3);
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        return set;
    }

    public static void printCats(Set<Cat> set) {
        for(Cat c : set) {
            System.out.println(c);
        }
    }
}
