package Array;

public class Question2 {

    public static void even_odd_number(int[] arr) {
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("\n" +
                "Even: " + even + "\n" +
                "Odd: " + odd);
    }

    public static void pos_neg_number(int[] arr) {
        int positive = 0, negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) positive++;
            else negative++;
        }

        System.out.println("\n" +
                "Positive: " + positive + "\n" +
                "Negative: " + negative);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -6, 7};
        even_odd_number(arr);
        pos_neg_number(arr);
    }
}
