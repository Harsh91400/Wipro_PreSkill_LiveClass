package Date_10_26_Before_26;

public class String_Question {
    public static void main(String[] args) {
        String s = "Harshit";
        String s1 = "Tripathi";
        String str = s + " "+ s1;
        System.out.println("First String : " + s);
        System.out.println("Second String : " + s1);
        System.out.println("Concatenate :" + str);
        System.out.println("Acess a Specific char : " + str.charAt(3));

        System.out.println(s.substring(2,5));
        System.out.println(s.toUpperCase());
        System.out.println("Length : " + (s.length()-1));
    }
}
