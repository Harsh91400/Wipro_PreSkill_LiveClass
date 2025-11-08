package Date_10_30;

public class Wrapper_Class {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = num; // Boxing
        System.out.println(num2);

        Integer num3 = 10;
        int num4 = num3; // OutBoxing
        System.out.println(num4);
    }
}
