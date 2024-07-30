package Array;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int m = sc.nextInt();

        int[] arr = new int[m];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }


        display(arr, m);
        int sum = sum(arr, m);
        double avg = avg(arr, m);
        reversalArr(arr, m);
        display(arr, m);

    }

    public static int sum(int[] arr, int m) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double avg(int[] arr, int m) {
        int sum = sum(arr, m);
        double avg = (double) sum / m;
        return avg;
    }

    public static int maxArr(int[] arr, int m, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }


    public static int minArr(int[] arr, int m, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static void display(int[] arr, int m) {
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reversalArr(int[] arr, int m) {
        for (int i = 0; i < m / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[m - i - 1];
            arr[m - i - 1] = temp;
        }
    }
}
