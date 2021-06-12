package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Sam");
        hashSet1.add("Gerry");
        hashSet1.add("David");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Tom");
        hashSet2.add("Smith");
        System.out.println("hashSet1: "+hashSet1);

        hashSet1.addAll(hashSet2);
        
        System.out.println("Check the size of new hashSet1 : " + hashSet1.size());
        System.out.println("hashSet1: " + hashSet1);
        
        System.out.println("Check if hashSet1: contain Gerry: "+hashSet1.contains("Gerry"));
        hashSet1.remove("Gerry");
        System.out.println("hashSet1: " + hashSet1);
        hashSet1.removeIf(str -> str.contains("Smith"));
        System.out.println("hashSet1: " + hashSet1);
        // Iterate through the list
        Iterator<String> itr = hashSet1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        
        HashSet<String> clonedHashSet = new HashSet<String>();
        clonedHashSet = (HashSet)hashSet1.clone();
        System.out.println("Check if hashSet1 isEmpty: " + hashSet1.isEmpty());
        hashSet1.clear();
        hashSet2.clear();
        System.err.println("hashSet1: " + hashSet1 + " hashSet2: " + hashSet2);
        System.out.println("check if hashSet1 isEmpty: " + hashSet1.isEmpty());

        System.err.println("clonedHashSet is still :" + clonedHashSet);
    }
    
}
