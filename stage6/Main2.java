package stage6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] num = {1, 1, 2, 2, 2, 8};
        
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();
        
        for (int i = 0; i < 6; i++) {
            System.out.print((num[i] - input[i]) + " ");
        }
    }
    
}
