public class ArmstrongNumber {

    //FUNCTION TO CALCULATE X RAISED TO THE POWER OF Y
    int power (int x, long y){
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power (x, y / 2) * power (x, y/2);
        return x * power (x, y / 2) * power(x, y/2);

    }
    //FUNCTION TO CALCULATE ORDER OF THE NUMBER
    int order (int x) {
        int n = 0;
        while (x != 0) {
            n++;
            x = x/10;
        }
        return n;
    }

    //FUNCTION TO CHECK WHETHER THE BOOLEAN NUMBER IS ARMSTRONG OR NOT
    boolean isArmstrong (int x) {

        // CALLING ORDER FUNCTION
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0 ) {
            int r = temp % 10;
            sum = sum + power (r, n);
            temp =  temp / 10;

        }
        // IF SATISFIES ARMSTRONG CONDITIONS
        return (sum == x);
    }
    //DRIVER CODE
    public static void main(String[] args) {
        ArmstrongNumber arm = new ArmstrongNumber();
        int x = 153;
        System.out.println(arm.isArmstrong(x));
        x = 1253;
        System.out.println(arm.isArmstrong(x));
    }

}
