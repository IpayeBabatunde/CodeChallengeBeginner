public class PrimeFactors {
    // TO PRINT ALL PRIME FACTOR OF A GIVEN NUMBER x
    public static void PrimeFactorsNumber (int x) {
        //PRINT THE NUMBER OF 2'S THAT DIVIDES X
        while (x % 2 == 0) {
            System.out.println(2 + " ");
            x /= 2;
        }
        //x MUST BE ODD AT THIS POINT, SO WE CAN SKIP ONE ELEMENT
        for (int i = 3; i <= Math.sqrt(x); i += 2) {
            //WHILE I DIVIDES X, PRINT I AND DIVIDE X
            while (x % i == 0) {
                System.out.println(i + " ");
                x /= i;
            }
        }
        //THE CONDITION IS TO HANDLE THE CASE WHEN x IS A PRIME NUMBER GREATER THAN 2
        if (x>2)
            System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 900;
        PrimeFactorsNumber(x);
    }

}
