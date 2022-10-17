package javarush2019.level07.lesson12.normal.t7;

/*
Переставь один модификатор static

Переставь один модификатор static, чтобы пример скомпилировался.
 */

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void solution() {
    }

    public int getValue() {
        return C;
    }
}
