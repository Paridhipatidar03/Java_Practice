import java.util.*;

class ItemDetail {
    String name;
    int price;
    boolean available;
    int stocks;

    public ItemDetail(String name, int price, boolean available, int stocks) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.stocks = stocks;
    }

    public String toString() {
        return "ItemDetail [name=" + name + ", price=" + price + ", available=" + available + ", stocks=" + stocks + "]";
    }
}

public class LL_ShopingCart {
    public static void main(String[] args) {
        // Create a LinkedList to store ItemDetail objects
        LinkedList<ItemDetail> cart = new LinkedList<>();
        
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Show menu and prompt user for selection
        while(true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Items to Cart");
            System.out.println("2. View Items in Cart");
            System.out.println("3. Remove First Item from Cart");
            System.out.println("4. Search Item in Cart");
            System.out.println("5. View Final Cart");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: ");
            
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    // Add Items to Cart
                    sc.nextLine();  // Consume the newline left by nextInt()
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter item price: ");
                    int price = sc.nextInt();
                    
                    System.out.print("Is the item available? (true/false): ");
                    boolean available = sc.nextBoolean();
                    
                    System.out.print("Enter the number of stocks: ");
                    int stocks = sc.nextInt();
                    
                    // Add the item to the cart
                    cart.add(new ItemDetail(name, price, available, stocks));
                    System.out.println("Item added to the cart.");
                    break;

                case 2:
                    // View Items in Cart
                    System.out.println("Items in the shopping cart:");
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        for (ItemDetail item : cart) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3:
                    // Remove First Item from Cart
                    if (!cart.isEmpty()) {
                        cart.removeFirst();
                        System.out.println("First item removed from the cart.");
                    } else {
                        System.out.println("Cart is empty! Cannot remove items.");
                    }
                    break;

                case 4:
                    // Search Item in Cart
                    sc.nextLine();  // Consume the newline left by nextInt()
                    System.out.print("Enter item name to search: ");
                    String searchItem = sc.nextLine();
                    boolean itemFound = false;
                    for (ItemDetail item : cart) {
                        if (item.name.equalsIgnoreCase(searchItem)) {
                            System.out.println("Found item: " + item);
                            itemFound = true;
                            break;
                        }
                    }
                    if (!itemFound) {
                        System.out.println("Item not found in the cart.");
                    }
                    break;

                case 5:
                    // View Final Cart
                    System.out.println("\nFinal shopping cart:");
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        for (ItemDetail item : cart) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting program. Thank you for using the shopping cart system!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
