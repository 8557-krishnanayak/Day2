package Operators;

public class Question6 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        int max = a > b ? a : b;
        System.out.println(max);

        int marks = 50;

        String passOrFail = marks >= 50 ? "Pass": "Fails";
        System.out.println(passOrFail);

    }
}
