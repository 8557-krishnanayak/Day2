package Logical;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 'Enter' to start timer ... ");
        scanner.nextLine();
        long start = System.currentTimeMillis();

        System.out.println("Press 'Enter' again to end timer ... ");
        scanner.nextLine();
        long finish = System.currentTimeMillis();


        long timeElapsed = finish - start;

        System.out.println("Total time taken to complete: \n" +
                "in millisecond "+ timeElapsed +" ms\n" +
                "in second " +(timeElapsed * 0.001)+" s\n");
    }
}
