package Collection;

import java.util.LinkedList;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    } 

}


public class BookLinkedList {
    public static void main(String[] args) {

        LinkedList<Book> book = new LinkedList<Book>();
        Book b1 = new Book(101, "Math", "David", "Bob", 10);
        Book b2 = new Book(102, "English", "Sam", "Smith", 20);
        Book b3 = new Book(103, "Biology", "Aron", "John", 30);

        book.add(b1);
        book.add(b2);
        book.add(b3);

        for (Book b : book) {
            System.out.println("id: "+b.id +" name: " +b.name + " Author  "
                                +
                        b.author+" publisher: "+b.publisher+" quantity: "+b.quantity); 
        }
        
    }
    
}
