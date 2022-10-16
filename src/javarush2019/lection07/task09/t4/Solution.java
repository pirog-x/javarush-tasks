package javarush2019.lection07.task09.t4;
import java.util.*;

/*
Буква «р» и буква «л»

1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void solution() {
        List<String> list = new ArrayList<>();

        list.add("роза");
        list.add("лира");
        list.add("лоза");

        fix(list);
        System.out.println(list);
    }


    private static void fix(List<String> list) {
        List<String> tempList = new ArrayList<>(list);
           for (String s : list) {
            if (s.contains("р") && s.contains("л")) {
                continue;
            } else if (s.contains("р")) {
                tempList.remove(s);
            } else if (s.contains("л")) {
                tempList.add(s);
            }
        }
        Collections.copy(list, tempList);
    }
}
