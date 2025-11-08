package Date_10_26_Before_26;

import java.util.Arrays;

public class Array_Questions {
    public static void main(String[] args) {
        int marks[] = {40,45,41,48,49,41};
        System.out.println("First Value : " + marks[0]);
        System.out.println("Last Value : " + marks[marks.length-1]);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            if(marks[i]>max){
                max = marks[i];
            }
            if(marks[i] < min){
                min = marks[i];
            }
            if(marks[i]%2==0){
                even++;
            }
            if(marks[i] %2 != 0){
                odd++;
            }
        }
        System.out.println("Sum Of all : " + sum);
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
        Arrays.sort(marks);
        System.out.println("Second largest : " + marks[marks.length-2]);

    }
}
