package Date_10_28;


public class Method_Even_Odd {
    public static int evenOdd(int num){
        if(num%2 == 0){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int res = evenOdd(num);
        int res = evenOdd(21);

        if(res == 1){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
