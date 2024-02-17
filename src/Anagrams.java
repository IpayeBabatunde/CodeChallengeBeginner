import java.util.Arrays;

//TO CHECK WHETHER TWO STRINGS ARE ANAGRAMS
public class Anagrams {

    //TO CHECK WHETHER TWO STRINGS ARE ANAGRAMS
    static boolean areAnagram(char [] str1, char [] str2){

        //GET LENGTH OF BOTH STRINGS
        int n1 = str1.length;
        int n2 = str2.length;

        //IF LENGTH OF BOTH STRINGS ARE NOT THE SAME, THEN THEY CAN'T BE ANAGRAMS
        if (n1 != n2)
            return false;

        //SORT BOTH STRINGS
        Arrays.sort(str1);
        Arrays.sort(str2);

        //COMPARE SORTED STRINGS
        for (int i = 0; i<n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;


    }
    public static void main(String[] args) {
        char str1[] = {'g', 'a', 'm','e'};
        char str2[] = {'m','a','g','e'};

        boolean game = true;
        boolean mage = false;

        if (areAnagram(str1, str2))
            System.out.println(game + "," + " The two Strings are anagram of each other");

        else
            System.out.println("The two Strings are not anagram of each other");

    }
}
