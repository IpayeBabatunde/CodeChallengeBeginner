import java.util.*;
public class ProductMaximizer {

    // FUNCTION TO FIND MAXIMUM PAIR IN AN ARRAY
    static void maxProduct (int arr[], int n) {
        if (n<2)
        {
            System.out.println("No Pairs exists");
            return;
        }

        //INITIALIZE MAXIMUM PRODUCT PAIR
        int a = arr[0], b = arr [1];

        //TRANSVERSE THROUGH EVERY POSSIBLE PAIR AND KEEP TRACK OF MAXIMUM PRODUCT
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] * arr [j] > b*a) {
                    a = arr[i];
                    b = arr[j];
                }
        System.out.println("Max product pair is { " + a + ", " + b + "}");
    }
    // DRIVER TO TEST ABOVE FUNCTION
    public static void main(String[] args) {
        int arr[] = {1, 3, 4,6,7,0};
        int n = arr.length;
        maxProduct(arr, n);

    }
}
