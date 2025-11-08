package Date_10_28;

public class Factorial {
    public static int factorial(int n){
        int fac = 1;
        for (int i = 1; i <= n; i++) {
               fac *= i;
        }
        return fac;
    }
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println(res);
    }
}
