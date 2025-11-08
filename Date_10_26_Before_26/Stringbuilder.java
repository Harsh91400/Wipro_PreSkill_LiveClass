package Date_10_26_Before_26;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Harshit");
        StringBuilder sbRev = new StringBuilder("");
        for (int i = sb.length()-1; i >= 0 ; i--) {
            sbRev.append(sb.charAt(i));
        }
        System.out.println(sbRev);

        sb.append("Tripathi");
        System.out.println(sb);
        sb.insert(7,", ");
        System.out.println(sb);

        sb.delete(7,sb.length());
        System.out.println(sb);

        sb.append(" Tripathi");
        System.out.println(sb);

        sb.replace(7,sb.length()," Tripathi JI");
        System.out.println(sb);



    }
}
