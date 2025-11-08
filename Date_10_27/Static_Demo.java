package Date_10_27;
class Static_Variable{
    static int add(int a,int b){
        return a+b;
    }
}
public class Static_Demo {
    public static void main(String[] args) {
        int sum = Static_Variable.add(4,5);
        System.out.println("Sum : " + sum);
    }
}
