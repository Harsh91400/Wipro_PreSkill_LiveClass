package Date_10_26_Before_26;

public class Palindrome_String {
    public static void main(String[] args) {
        String str = "naan";
        String str1 = "";
        int j =0;
        for (int i=str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
            j++;
        }
        if(str.equals(str1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No");
        }
    }
}
