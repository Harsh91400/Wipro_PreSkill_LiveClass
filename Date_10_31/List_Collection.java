package Date_10_31;
import java.util.*;
public class List_Collection {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // duplicates allowed
        fruits.add("Mango");

        // Accessing elements
        System.out.println("List: " + fruits);

        // Get specific element
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Last fruit: " + fruits.get(fruits.size()-1));

        System.out.println("Before Removing List: " + fruits);
        // Remove element
        fruits.remove("Banana");
        System.out.println("After Removing One: " + fruits);

        System.out.println("Size of List : " +  fruits.size());

        System.out.println("Set Element : "+ fruits.set(2,"Banana"));

        System.out.println("Contains Elements : " + fruits.contains("Banana"));


    }
}
