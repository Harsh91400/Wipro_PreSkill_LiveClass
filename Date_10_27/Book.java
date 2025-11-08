package Date_10_27;

public class Book {
    String title = "unknown";
    String author = "ABC";
    double price = 500;
    Book(){
        System.out.println("Default Constructer Called.");
    }
    Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("Author : "+ author);
        System.out.println("Price : $" + price);
    }

}
class Main{
    public static void main(String[] args) {
        Book book = new Book();
        book.displayInfo();
        new Book().displayInfo();
        Book book2 = new Book();
        book2.title = "Wipro PreSkill";
        book2.author = "Unknown";
        book2.price = 1000;
        book2.displayInfo();
        book.displayInfo();
        System.out.println("===================");
        book2 = book;
        book2.title = "Data Structures";
        book.displayInfo();
        book2.displayInfo();
        Book book3 = new Book("Wipro","Unknown");
        System.out.println("==========Book3 Info==============");
        book3.displayInfo();
    }
}
