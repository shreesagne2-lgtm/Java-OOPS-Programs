import java.util.ArrayList;

class Book {

    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String ISBN) {
        books.removeIf(book -> book.ISBN.equals(ISBN));
    }

    void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available");
        }

        for (Book b : books) {
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.ISBN);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java Programming", "James Gosling", "101");
        Book b2 = new Book("Python Basics", "Guido Van Rossum", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("Books in Library:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("\nAfter Removing Book:");
        lib.displayBooks();
    }
}