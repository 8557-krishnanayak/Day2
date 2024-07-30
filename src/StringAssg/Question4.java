package StringAssg;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int[] ch = new int[128];

        Arrays.fill(ch, -1);
        String str = "abacaebcd";
        int right;
        int left = 0;

        int maxLength = 0;

        for(right = 0; right < str.length(); right++) {
            if(ch[str.charAt(right)] >= left){
                left = ch[str.charAt(right)] + 1;
            }

            ch[str.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);

    }
}
