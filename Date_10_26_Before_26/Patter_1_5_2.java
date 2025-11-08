package Date_10_26_Before_26;

public class Patter_1_5_2 {
    public static void main(String[] args) {
        int sp = 4;
        for (int i = 1; i <= 5; i++) {
            int spa = sp;
            for (int j = 1; j <= i; j++) {
                while(spa>0){
                    System.out.print(" ");
                    spa--;
                }
                System.out.print(j+ " ");
            }
            sp -= 1;
            System.out.println();
        }
    }
}
