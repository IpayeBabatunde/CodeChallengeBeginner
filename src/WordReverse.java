import java.util.Arrays;
import java.util.Collections;

public class WordReverse {
    public static void main(String[] args) {
        String s = "Dog Bites Man";
        printReverseWords(s);
    }
    public static void printReverseWords(String s) {
        String[] words = s.split(" ");
        Collections.reverse(Arrays.asList(words));
        System.out.println(String.join(" ", words));
    }
}
