package OOP.StringBufferANDBuilder;

import java.util.StringTokenizer;

import DataTypes.switchCase;

public class tokonizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is gerry");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer("my name is : gerry");
        System.out.println(st1.nextToken(":"));
    }
    
}
