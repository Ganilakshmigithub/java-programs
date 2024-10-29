package Spring.Core.Catalog;

import org.springframework.stereotype.Component;

@Component
public class Books {
    public void addBook(String title) {
        System.out.println("Adding book: " + title);
    }

    public void removeBook(String title) {
        System.out.println("Removing book: " + title);
    }

    public void listBooks() {
        System.out.println("Listing all books.");
    }
}
