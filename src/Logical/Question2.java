package Logical;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter number for Perfect Number");
        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for(int i = 1; i<=n/2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }

        if(sum == n) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");
    }
}
