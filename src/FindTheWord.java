import java.util.Arrays;

public class FindTheWord {
    public static void main(String[] args) {
        String string = "I love Code Academy";
        String Keyword = "love";

        Boolean found = Arrays.asList(string.split(" ")).contains(Keyword);
        if (found) {
            System.out.println(Keyword);
        }
    }
}
