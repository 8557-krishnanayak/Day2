package Operators;


// Bitwise operation
public class Question5 {

    public static boolean isEvenOdd(int n) {
        if((n^1) == (n+1)) // XOR operation
            return true;
        return false;
    }

    public static double divideBy2(int number) {
        return number >> 1; // right shift n / 2 ^ b;
    }

    public static double multipleBy2(int number) {
        return number << 1; // left shift  n * 2 ^ a;
    }

    public static void main(String[] args) {
        boolean a = isEvenOdd(10);
        System.out.println(a);
        double divide = divideBy2(3);
        double multi = multipleBy2(4);

        System.out.println(divide);
        System.out.println(multi);

    }
}
