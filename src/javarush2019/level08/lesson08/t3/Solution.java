package javarush2019.level08.lesson08.t3;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

/*
Удалить все числа больше 10

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
 */

public class Solution {
    public static void solution() {
        Set<Integer> set = fillSetOfRandomNums(20, 30);
        removeNumsInSetGreater(set, 10);

        System.out.println(set);
    }

    private static Set<Integer> fillSetOfRandomNums(int size, int range) {
        if (size <= 0)return null;

        Random random = new Random();
        Set<Integer> set = new HashSet<>(size);

        for (int i = 0; i < size; i++) set.add(random.nextInt(range));
        return set;
    }

    private static void removeNumsInSetGreater(Set<Integer> set, int limit) {
        if (set.isEmpty()) return;
        Set<Integer> tempSet = Set.copyOf(set);
        for (Integer i : tempSet) if (i > limit) set.remove(i);
    }
}
