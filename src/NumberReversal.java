public class NumberReversal {


        //ITERATE FUNCTION TO REVERSE DIGIT OF NUMBERS
        static int reverseDigits(int num){
            int rev_num = 0;
            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;

            }
            return rev_num;
        }

        // DRIVER CODE
        public static void main(String[] args) {
            int num = 4567;
            System.out.println("Reverse of no. is " + reverseDigits(num));
        }

    }

