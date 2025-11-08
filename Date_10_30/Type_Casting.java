package Date_10_30;

class School{
    void showSchool(){
        System.out.println("School Class");
    }
}
class Student extends School{
    void showStudent(){
        System.out.println("Student Class");
    }
}
public class Type_Casting {
    public static void main(String[] args) {
        //Premitive typecasting
        // Implicit Typecasting
        int num = 10;
        double resNum = num;
        System.out.println(num + " : Implicit Typecasting: "+resNum);

        // Explicit Typecasting
        double num2 = 98.25;
        int resNum2 = (int) num2;
        System.out.println(num2 + " : Explicit Typecasting: "+resNum2);

        // Object Typecasting

        School sc = new Student();
        sc.showSchool();


        Student st = (Student) sc;
        st.showStudent();

        System.out.println("Creating Object of Sub class");
        Student st1 = new Student();
        st1.showStudent();
        st1.showSchool();



    }
}
