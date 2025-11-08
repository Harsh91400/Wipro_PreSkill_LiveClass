package Date_10_29;

class BankAccount {
    private String name;
    private String acno;
    private int bal;
    public BankAccount(String name, String acno, int bal) {
        this.name = name;
        this.acno = acno;
        this.bal = bal;
    }
    public String get_name() {
        return name;
    }
    public String set_name(String name){
        this.name=name;
        System.out.println("Name Updated ");
        return name;
    }
    public String get_acno() {
        return acno;
    }
    public String set_acno(String acno){
        this.acno = acno;
        System.out.println("Acc No. Updated ");
        return acno;
    }
    public double get_bal(){
        return bal;
    }
    public void deposit(int amt){
        bal += amt;
        System.out.println("Amount Deposited: " + amt);
        System.out.println("New Balance: " + bal);
    }
    public void with(int amt){
        if (amt > bal) {
            System.out.println("Not Enough Bal");
        }
        else {
            bal -= amt;
            System.out.println("Amount Withdrawn: " + amt);
            System.out.println("New Balance: " + bal);
        }
    }
    public void display(){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + acno);
        System.out.println("Account Balance: " + bal);
    }

}
class main{
    public static void main(String args[]) {
        BankAccount acc = new BankAccount("Harshit", "12345", 1000);
        acc.display();
        acc.deposit(500);
        acc.with(200);
        acc.set_name("Harshit Tripathi");
        acc.set_acno("12345");
        acc.display();
        acc.get_bal();
    }
}