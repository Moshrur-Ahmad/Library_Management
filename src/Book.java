public class Book extends LibraryItem {
    private int numberOfPages;
    private String publisher;

    // Constructor
    public Book(String title, String author, int itemID, int numberOfPages, String publisher) {
        super(title, author, itemID);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    // Overridden method to display book details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
    }
}

