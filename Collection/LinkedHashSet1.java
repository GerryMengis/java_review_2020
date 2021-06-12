package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        

        Set<String> llHashSet = new LinkedHashSet<String>();
        llHashSet.add("Sam");
        llHashSet.add("Gerry");
        llHashSet.add("David");

        LinkedHashSet<String> llHashSet2 = new LinkedHashSet<>();
        llHashSet2.add("Tom");
        llHashSet2.add("Smith");
        llHashSet.addAll(llHashSet2);
        System.out.println("hashSet1: "+llHashSet);

    }
    
}
