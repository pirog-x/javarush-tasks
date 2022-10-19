package javarush2019.level08.lesson08.t1;
import java.util.HashSet;
import java.util.Set;

/*
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
 */

public class Solution {
    public static void solution() {
        Set<String> set = createNewSet();
    }

    private static Set<String> createNewSet() {
        Set<String> set = new HashSet<>(20);
        set.add("Лодка");
        set.add("Лёд");
        set.add("Лемон");
        set.add("Линукс");
        set.add("Луна");
        set.add("Лань");
        set.add("Лапть");
        set.add("Лошадь");
        set.add("Лол");
        set.add("Лом");
        set.add("Лорд");
        set.add("Лягушка");
        set.add("Ладья");
        set.add("Лама");
        set.add("Лара");
        set.add("Лампа");
        set.add("Лещ");
        set.add("Лучь");
        set.add("Лупа");
        set.add("Люди");
        set.add("Люкс");

        return set;
    }
}
