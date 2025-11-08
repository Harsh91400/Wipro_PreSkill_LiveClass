package Date_10_31;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // add
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate ignored

        System.out.println("Fruits: " + fruits);

        // contains
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // size
        System.out.println("Size of set: " + fruits.size());

        // remove
        fruits.remove("Orange");
        System.out.println("After removing Element : " + fruits);

        // isEmpty
        System.out.println("Is set empty :  " + fruits.isEmpty());

        // iterator
        System.out.println("Using iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // addAll
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Mango");
        moreFruits.add("Banana");

        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        // retainAll
        Set<String> tropical = new HashSet<>();
        tropical.add("Mango");
        tropical.add("Banana");

        fruits.retainAll(tropical);
        System.out.println("After retainAll(): " + fruits);

        // 9. clear
        fruits.clear();
        System.out.println("After clear(): " + fruits);
    }
}
