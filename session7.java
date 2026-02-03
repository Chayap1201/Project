class Book {
    
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

public class session7 {
    public static void main(String[] args) {
        
        Book book1 = new Book("Java Basics", "Alice", 350);
        Book book2 = new Book("Data Structures", "Bob", 450);
        Book book3 = new Book("Algorithms", "Charlie", 500);

        
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
