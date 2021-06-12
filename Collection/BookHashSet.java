package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class BookHashSet {
    

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("four");
        hashSet.add("Five");
        hashSet.add("Two");


        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        // Book hashSet Example
        HashSet<Book> bookSet = new HashSet<Book>();
        Book b1 = new Book(101, "Math", "David", "Bob", 10);
        Book b2 = new Book(102, "English", "Sam", "Smith", 20);
        Book b3 = new Book(103, "Biology", "Aron", "John", 40);

        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);

        for (Book b : bookSet) {
            System.out.println("id: " + b.id + " name: " + b.name + " Author  " + b.author + " publisher: "
                    + b.publisher + " quantity: " + b.quantity);

        }


    }
}