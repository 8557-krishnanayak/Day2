package StringAssg;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] ch = new int[128];

        Arrays.fill(ch, 0);
        String str = "qwertyuiuytrewqfc";


        char[] store_unique = new char[str.length()];
        Arrays.fill(store_unique, '-');

        for (int i = 0, j = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (ch[character] == 0) {
                store_unique[j] = character;
                j++;
            }
            ch[character] = ch[character] + 1;
        }


        for (char c : store_unique) {
            if(c == '-') continue;
            System.out.print(c + ": " + ch[c] +", ");
        }
        System.out.println();
    }
}
