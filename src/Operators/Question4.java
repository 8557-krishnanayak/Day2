package Operators;

public class Question4 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        a += 1;
        b -= a;
        a *= b;
        b /= a;
        a %= b;


        System.out.println(a);
        System.out.println(b);
    }
}
