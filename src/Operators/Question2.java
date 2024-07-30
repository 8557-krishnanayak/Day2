package Operators;

public class Question2 {

    public static int findMaxNumber(int a, int b, int c) {
        if (a > b)
            return a > c ? a : c;
        return b > c ? b : c;
    }

    public static boolean equality(String str1, String st2) {
        return st2.equals(str1);
    }

    public static void main(String[] args) {

    }
}
