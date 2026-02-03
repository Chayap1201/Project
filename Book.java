public class Book {
    private String title;
    private boolean isAvailable;

    
    public Book(String title) {
        this.title = title;
        this.isAvailable = true; 
    }

    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    
    public boolean isAvailable() {
        return isAvailable;
    }


    public String getTitle() {
        return title;
    }

    
    public static void main(String[] args) {
        Book book = new Book("Java Programming");

        System.out.println(book.getTitle() + " available? " + book.isAvailable()); 
        book.borrowBook();
        System.out.println(book.getTitle() + " available? " + book.isAvailable()); 
        book.returnBook();
        System.out.println(book.getTitle() + " available? " + book.isAvailable()); 
    }
}
