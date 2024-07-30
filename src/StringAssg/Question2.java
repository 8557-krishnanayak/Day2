package StringAssg;

import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean result = true;

        if (s1.length() != s2.length()) result = false;
        else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

//            System.out.println(Arrays.toString(ch1));
//            System.out.println(Arrays.toString(ch2));

            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    System.out.println(ch1[i]);
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
