package assignment22;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ram";
        char ch[] = s.toCharArray();
        String res = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            res += ch[i];
        }
        System.out.println(res);
    }
}
