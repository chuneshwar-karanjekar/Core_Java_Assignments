package assignment22;

public class Palindrome {
    public static void main(String[] args) {
        String s = "ramar";
        char[] ch = s.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        if (rev.equals(s)) {
            System.out.println("it is palindrome");
        }
    }
}
