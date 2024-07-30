package StringAssg;

public class Question1 {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev += str.charAt(str.length() - i - 1);
        }

        if (rev.equals(str)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
