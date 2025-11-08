package Date_10_28;
class Book{
    String book;
    String author;
    int year;
    static int bookCount;
    Book(String book,String author,int year){
        this.book = book;
        this.author = author;
        this.year = year;
        bookCount++;
    }
    void displayInfo(){
        System.out.println("Book : "+ book);
        System.out.println("Author : "+ author);
        System.out.println("year : "+ year);
        System.out.println("Book Count : "+ bookCount);
    }
    static void display2(){
        System.out.println("Static Method");
    }
}
public class Static_Variable {
    public static void main(String[] args) {
        Book book = new Book("DSA","XYZ",2021);
        book.displayInfo();
        System.out.println("=============================");
        Book book1 = new Book("ABC","PQR",2025);
        book1.displayInfo();
        book1.display2();
        Book.display2();
    }
}
