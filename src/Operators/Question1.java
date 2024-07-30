package Operators;

public class Question1 {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static void multiplication(int n) {
        for (int i = 1; i < 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
            sum += arr[i];

        return (double)(sum/arr.length);
    }

    public static double circle(int raduis) {
        double pi = Math.PI;
        return 2 * pi * raduis;
    }

    public static void main(String[] args) {


    }
}
