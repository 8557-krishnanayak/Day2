package Logical;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("Enter n.th number");
        Scanner scanner =new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        if(n == 1) {
            System.out.println("0");
        } else if(n == 2) {
            System.out.println("0 1");
        } else {
            int t1 = 0;
            int t2 = 1;

            System.out.print(t1 +" "+ t2+ " ");

            for(int i = 2; i<=n; i++) {
                int t3 = t1 + t2;
                System.out.print((t3)+ " ");
                t1 = t2;
                t2 = t3;
            }
        }

    }
}
