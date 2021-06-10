package Collection;

import java.util.Stack;

public class StackList {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Gerry");
        s.push("Tom");
        s.push("David");
        s.push("Sam");


        System.out.println("Stack: " + s);
        String v = s.peek();
        System.out.println("Peek: "+ v);

        // Stack Search (only return an int)
        int location = s.search("Sam");
        System.out.println("Location at : "+ location);
    }

}
