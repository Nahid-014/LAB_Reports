package lab5_Five;

class LibraryBook {
    String title;
    String author;
    int bookID;
    LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }
    void displayBookInfo() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Book ID: " + this.bookID);
    }
}
public class taskTwo {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Head First Java", "Kathy Sierra & Bert Bates",
                101);
        LibraryBook book2 = new LibraryBook("Effective Java", "Joshua Bloch", 102);
        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
    }
}