package JunkFolder;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class summary {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        // user input
        Scanner input = new Scanner(System.in);
        System.out.print("Verify your name please ");
        // String inputchar = input.nextLine();
        String inputchar = input.next();
        System.out.println("Thank you for verifing your name " + inputchar);

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

        int b = 0;
        do{
            System.out.println("do must printing at least once....");
            b++;
        } while (b < 1 );

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

         // Convert Array to ArrayList
         String[] w = { "dbfiah", "hgfiwy" };
         System.out.println("array's are" + Arrays.toString(w));
    }
}
