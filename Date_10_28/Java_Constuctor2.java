package Date_10_28;
class Student{
    String name;
    int age;
    char grade;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }

}
public class Java_Constuctor2 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "ABC";
        st.age = 20;
        st.grade = 'A';
        st.display();
    }
}
