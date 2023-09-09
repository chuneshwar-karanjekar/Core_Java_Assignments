package assignment22;

public class CountVowelsInString {
    public static void main(String[] args) {
        String s = "chuneshwar";
        char ch[] = s.toCharArray();
        int vowel = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                vowel++;
            }
        }
        System.out.println("Vovel is :" + vowel);
    }
}
