package Logical;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter number for Prime Number");
        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        boolean flag = false;
        for(int i = 2; i<=n/2; i++) {
            if(n % i == 0) {
                flag = true;
                break;
            }
        }

        if(!flag) System.out.println("Prime Number");
        else System.out.println("Not Prime Number");
    }
}
