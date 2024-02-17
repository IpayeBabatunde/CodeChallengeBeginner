import java.io.*;
public class Pangram {

    //RETURN TRUE IF THE STRING IS PANGRAM, ELSE FALSE
    public static boolean checkPangram (String str){

        //CREATE A HASH TABLE TO MARK THE CHARACTERS PRESENT IN THE STRING
        boolean[] mark = new boolean[26];

        //FOR INDEXING IN MARK
        int index;

        //TRANSVERSE ALL CHARACTERS
        for (int i =0; i<str.length(); i++) {

            //IF UPPERCASE, SUBTRACT A TO FIND INDEX
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

            //IF LOWERCASE, SUBTRACT a TO FIND INDEX

            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';

            else
                continue;
            mark[index] = true;

        }

        //RETURN TRUE IF ANY CHARATER IS UNMARKED
        for (int i =0; i<=25; i++)
            if (!mark[i])
                return (false);

        //IF ALL CHARACTERS WERE PRESENT
        return true;

    }
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over a lazy dog";

        if (checkPangram(str) == true)
            System.out.println(str + " \nis a Pangram");
            else
            System.out.println(str + " \nis not a Pangram");
    }
}
