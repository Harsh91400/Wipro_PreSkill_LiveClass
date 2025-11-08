package Date_10_26_Before_26;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num > 0){
            int temp = num%10;
            rev = rev * 10 + temp;
            num /= 10;
        }
        System.out.println(rev);
    }
}
