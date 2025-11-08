package Date_10_30;

class Boxx<T>{
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
public class With_Generics {
    public static void main(String[] args) {
        Boxx<Integer> box = new Boxx<>();
        box.setItem(12);
        System.out.println(box.getItem());

        Boxx<String> box2 = new Boxx<>();
        box2.setItem("Harshit");
        System.out.println(box2.getItem());

    }
}
