package Logical;

import java.util.Scanner;
import java.lang.Math;

public class Question4 {

    public static void main(String[] args) {
        System.out.println("Enter number to Reverse its Number");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();
        int temp = n;
        int count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int rev = 0;
        temp = n;

        for (int i = 0; i < count; i++) {
            int rem = temp % 10;
            rev = (int) (Math.pow(10,  (count-i-1)) * rem + rev);
            temp = temp / 10;
        }

        System.out.println(rev);

    }
}
