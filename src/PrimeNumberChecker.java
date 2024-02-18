import java.util.Arrays;

public class PrimeNumberChecker {
    public static void PrimeNumberFinder (int srt, int n) {
        //CREATE A BOOLEAN ARRAY "PRIME (SRT TO N) " AND INITIALIZE ALL ENTRIES
        //AS TRUE. A VALUE IN PRIME [I] WILL FINALLY BE FALSE IF I NOT A PRIME, ELSE TRUE.
        boolean[] prime = new boolean[n + 2];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int p =2; p * p <= n; p++) {
            //IF PRIME [P] IS NOT CHANGED, THEN IT'S A PRIME
            if (prime[p] == true) {
                //UPDATE ALL MULTIPLES OF P GREATER THAN OR EQUAL
                //TO THE SQUARE OF ITS NUMBERS WHICH ARE MULTIPLES OF P
                //ARE MULTIPLES OF P AND ARE LESS THAN P^2 ARE ALREADY BEEN MARKED
                for (int i = p*p; i <=n; i +=p) {
                    prime[i] = false;
                }
            }
        }
        //PRINT ALL PRIME NUMBERS
        for (int p = srt; p<=n; p++) {
            if (prime[p]) {
                System.out.println(p + " ");
            }
        }
    }

    // DRIVE THE CODE
    public static void main(String[] args) {
        int srt = 1;
        int end = 20;
        PrimeNumberFinder(srt, end);
    }
}
