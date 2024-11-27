import java.util.ArrayList;
public class Library {
    private ArrayList<LibraryItem> items;

    // Constructor
    public Library() {
        items = new ArrayList<>();
    }

    // Method to add an item to the collection
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    // Method to remove an item from the collection
    public void removeItem(int itemID) {
        items.removeIf(item -> item.getItemID() == itemID);
        System.out.println("Item with ID " + itemID + " removed from the collection.");
    }

    // Method to display details of all items in the collection
    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println("--------------------");
        }
    }
}

