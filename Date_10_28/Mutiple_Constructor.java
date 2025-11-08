package Date_10_28;
class Employee{
    String name;
    int salary;
    String department;

    Employee(String name){
        System.out.println("Called with name : ");
        this.name = name;
        this.salary = 0;
        this.department = "Default";

    }
    Employee(int salary){
        System.out.println("Called with Salary : ");
        this.name = "Default";
        this.salary = salary;
        this.department = "Default";
    }
    Employee(String department,int salary){
        System.out.println("Called with Department & Salary : ");
        this.name = "Default";
        this.salary = salary;
        this.department = department;
    }
    void displayInfo(){
        System.out.println("Name : " + name + "\n" + "Salary : " + salary + "\n" + "Department : "+department);
    }
}
public class Mutiple_Constructor {
    public static void main(String[] args) {
        Employee emp = new Employee("Harshit");
        emp.displayInfo();
        Employee emp1 = new Employee(400000);
        emp1.displayInfo();
        Employee emp2 = new Employee("CSE",50000);
        emp2.displayInfo();




    }
}
