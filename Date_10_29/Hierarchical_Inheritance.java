package Date_10_29;
class Animal{
    void eat(){
        System.out.println("All Animal eats");
    }
}
class Dog extends  Animal {
    void legs(){
        System.out.println("Dog has 4 legs");
    }
}
class Goat extends Animal{
    void goatEats(){
        System.out.println("Goat eats Grass");
    }
    void eat(){
        System.out.println("Goat also Eats");
        super.eat();
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Goat g = new Goat();
        g.goatEats();
        g.eat();

        System.out.println("======================");
        Dog d = new Dog();
        d.legs();
        d.eat();

    }
}
