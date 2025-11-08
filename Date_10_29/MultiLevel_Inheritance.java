package Date_10_29;

class A{
    void showA(){
        System.out.println("Class A");
    }
}
class B extends A{
    void showB(){
        System.out.println("Class B");
    }
}
class C extends B{
    void showC(){
        System.out.println("Class C");
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.showC();
        c.showB();
        c.showA();
    }
}
