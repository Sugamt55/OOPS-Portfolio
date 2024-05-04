package Week5_6;

public class BookShelf {
    public static void main(String[] args) {
    	
        // Instantiate and update several Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);

        // Print initial values
        System.out.println("Initial Book 1:\n" + book1);
        System.out.println("\nInitial Book 2:\n" + book2);

        // Update book information
        book1.setTitle("The Great Gatsby");
        book1.setAuthor("F. Scott Fitzgerald");
        book1.setPublisher("Charles Scribner's Sons");
        book1.setCopyrightDate(1925);

        // Print updated values
        System.out.println("\nUpdated Book 1:\n" + book1);
        System.out.println("\nBook 2 remains unchanged:\n" + book2);
    }
}