package Logical;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];

        boolean complete = false;
        int fill = 0;
//        check for the complete fill in array
        while (!complete) {
            int number = (int) Math.floor(Math.random() * 10+1);
            if(!include(number, arr))
            {
                arr[fill] = number;
                fill++;
            }
            if (n == fill) {
                complete = true;
            }
        }

        System.out.println(Arrays.toString(arr));
//
    }

    public static boolean include(int el, int[] arr) {
        for (int j : arr) {
            if (j == el) return true;
        }

        return false;
    }
}
