package ex5_library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "B-001", "Robert C. Martin");
        book.displayInfo();
        // Outside another package, book.title is inaccessible because it is protected.
    }
}
