package Operators;

public class Question3 {

    public static boolean leapYear(int year) {
        if(year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else return year % 4 == 0;
    }

    public static boolean isDivisibleBy_5_and_7(int number) {
        return number % 5 == 0 && number % 7 ==0;
    }
    public static void main(String[] args) {

    }
}
