package Date_10_26_Before_26;

import java.util.Scanner;

public class Pattern_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            int n = 1;
            for (int j = i; j < 5; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
