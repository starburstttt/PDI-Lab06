package ex5_library;

public class LibraryItem {
    protected String title;
    protected String id;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Item ID: " + id + " | Title: " + title);
    }
}
