public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Java Programming", "James Gosling", 101, 450, "TechBooks");
        Journal journal1 = new Journal("AI Research", "John McCarthy", 201, 12, "01-01-2023");
        library.addItem(book1);
        library.addItem(journal1);
        System.out.println("\nLibrary Collection:");
        library.displayAllItems();

        // Removing an item and displaying the collection again
        library.removeItem(101);
        System.out.println("\nUpdated Library Collection:");
        library.displayAllItems();
    }
}
