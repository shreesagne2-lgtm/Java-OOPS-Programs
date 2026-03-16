class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class LibraryBooks {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "James Gosling", 450);
        books[1] = new Book("Python Guide", "Guido Van Rossum", 500);
        books[2] = new Book("C Programming", "Dennis Ritchie", 400);

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}