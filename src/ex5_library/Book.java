package ex5_library;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        // Direct access to protected 'title' and 'id'
        System.out.println("Book [" + id + "]: '" + title + "' by " + author);
    }
}
