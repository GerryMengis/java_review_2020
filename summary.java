
import java.lang.Math;

public class summary {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        System.out.println(Integer.parseInt("123"));
        System.out.println(Math.random());
        int x = 2, y = 3;
        if (x < y) {
            int t = x;
            x = y;
            y = t;
            System.out.println(x + " and " + y);
        }

        int t = 1;
        while (t < 10) {
            System.out.print(t + " ");
            t++;
        }
        System.out.println();

        // n! for loop
        int n = 10;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
            System.out.print(product + " ");
        }
        System.out.println();

        // do while loop
        int z = 1;
        do {
            System.out.print(z + " ");
            z++;
        } while (z < 10);

        // Array
        int m = 5;
        double[] a = new double[m];
        for (int i = 0; i < m; i++) {
            a[i] = Math.round(5);
            System.out.print(a[i] + " ");
        }
    }
}
