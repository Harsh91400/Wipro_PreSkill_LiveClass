package Date_10_29;

interface color {
    void go();
    default void look(){
        System.out.println("its white");
    }

}

interface height {

    default void h(){
        System.out.println("its 4ft");
    }

}

class german_shepherd implements color,height {
    public void go(){
        System.out.println("its going");
    }
    void name(){
        System.out.println("Name is honey");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        german_shepherd g = new german_shepherd();
        g.look();
        g.h();
        g.name();
        g.go();
    }
}
