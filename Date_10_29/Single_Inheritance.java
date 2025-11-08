package Date_10_29;

class Vehical{
    public void vehicalWheels(){
        System.out.println("Undefined Wheels");
    }

}
class Car extends Vehical{
    public void carWheels(){
        System.out.println("4 Wheels");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.carWheels();
        c.vehicalWheels();

    }
}
