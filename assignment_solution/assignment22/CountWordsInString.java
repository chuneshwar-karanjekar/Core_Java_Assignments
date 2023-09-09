package assignment22;

public class CountWordsInString {
    public static void main(String[] args) {
        String s = "ram";
        char[] ch = s.toCharArray();
        int word = 0;
        for (int i = 0; i <= ch.length - 1; i++) {
            word++;
        }
        System.out.println(word);
    }
}
