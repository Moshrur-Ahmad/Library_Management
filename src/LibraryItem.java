public class LibraryItem {
    private String title;
    private String author;
    private int itemID;

    // Constructor
    public LibraryItem(String title, String author, int itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getItemID() {
        return itemID;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

