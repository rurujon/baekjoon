package stage6;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int left = 0;
        int right = word.length() - 1;

        int result = 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                result = 0;
            }
            left++;
            right--;
        }

        sc.close();

        System.out.println(result);
    }
    
}
