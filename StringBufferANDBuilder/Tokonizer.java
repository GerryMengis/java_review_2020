package StringBufferANDBuilder;

import java.util.StringTokenizer;

public class Tokonizer {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("my name is gerry");
        
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer("my name is : gerry");
        System.out.println(st2.nextToken(":"));
    }
    
}
