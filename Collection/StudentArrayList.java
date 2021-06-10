package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

 class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    
}
public class StudentArrayList {

    public static void main(String[] args) {
        System.out.println("ArrayList printing .....");
        // String ArrayList
        List<String> list = new ArrayList<>();
        System.out.println("Current array list is : "+list);
        list.add("Gerry");
        list.add("Sam");
        list.add("Adam");
        list.add("Sam");
        list.add("Dan");
        list.add(3, "David");
        // List of the elements
        System.out.println("New ArrayList is : "+list);
        list.removeIf(str -> str.contains("Sam")); //Lambda expression

        // List of the elements
        System.out.println("Updated ArrayList is : " + list);
        
        // Iterating to each array
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // remove element from index 2
        list.remove(2);
            
        // Iterating to each array
        System.out.println("After array index 2 removed");
        for (String names : list) {
            System.out.println(names);

        }
      
        // Get and Set ArrayList
        System.out.println("returning an element: " + list.get(0));
        list.set(1, "Alex");

        for (String name : list) {
            System.out.println(name);
        }
        // Sort String ArrayList
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
        // Remove all arrays
        list.clear();
        System.out.println("Check if array get cleared: " + list.isEmpty());

        // Integer ArrayList
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);
        intList.add(20);

        for (Integer num : intList) {
            System.out.println(num);
            
        }

        // sort numerical ArrayList
        Collections.sort(intList);
        for (Integer name : intList) {
            System.out.println(name);
        }
        // Iterate through reverse ArrayList
        Collections.sort(intList, Collections.reverseOrder());
        for (Integer num : intList) {
            System.out.println(num);
            
        }

        ListIterator<Integer> listItr = intList.listIterator(intList.size());
                int x = intList.size();
                while (listItr.hasPrevious()) {
                    System.out.println("current index of intList.size() " + x + " is " + listItr.previous());
                    x--;
        }
        
        // Creating user-defined ArrayList
        Student s1 = new Student(101, "Gerry", 20);
        Student s2 = new Student(102, "Sam", 30);
        Student s3 = new Student(103, "Adam", 40);

        List<Student> studentlist = new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);

        // Iterate through Student list
        Iterator Sitr = studentlist.iterator();
        while (Sitr.hasNext()) {
            Student st = (Student) Sitr.next();
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }
        // Convert Array to ArrayList
        String[] a = { "Jen", "Smith" };
        System.out.println("Array's" + Arrays.toString(a));

        List<String> l = new ArrayList<>();
        for (String i : a) {
            l.add(i);
        }
        System.out.println("New ArrayList" + l);
        
    }
}