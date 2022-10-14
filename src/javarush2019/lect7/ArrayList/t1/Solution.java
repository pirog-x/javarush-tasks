package javarush2019.lect7.ArrayList.t1;
import java.util.ArrayList;

/*

Задача 1. 5 различных строчек в списке

1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки.

*/


public class Solution {
    public static void solution() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("my");
        list.add("friend");
        list.add("!");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
