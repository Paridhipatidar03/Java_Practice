import java.util.*;
class Book {
    String title, author;
    int id;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author;
    }
}


public class ArrayList_BookManage {
    public static void main(String[] args) {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("\n1. Add Book  2. View Books  3. Search Book  4. Exit");
        int choice = sc.nextInt();
        sc.nextLine();  // Consume newline

        if (choice == 1) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();
            books.add(new Book(id, title, author));
        } else if (choice == 2) {
            for (Book b : books) {
                System.out.println(b);
            }
        } else if (choice == 3) {
            System.out.print("Enter Book Title to Search: ");
            String searchTitle = sc.nextLine();
            boolean found = false;
            for (Book b : books) {
                if (b.title.equalsIgnoreCase(searchTitle)) {
                    System.out.println("Book Found: " + b);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Book Not Found!");
            }
        } else {
            break;
        }
    }
    sc.close();
}   
}
