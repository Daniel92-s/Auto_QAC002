package homeworks.Library;

public class Library {
    public static void main(String[] args) {
        // Create Author objects
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com");
        Author author2 = new Author("George Orwell", "george.orwell@example.com");
        Author author3 = new Author("J.R.R. Tolkien", "tolkien@example.com");

        // Create Book objects
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", 1997, author1, 39.99);
        Book book2 = new Book("1984", 1949, author2, 49.99);
        Book book3 = new Book("The Lord of the Rings", 1954, author3, 59.99);

        // Print the details of each book
        System.out.printf("“%s (%.2f RON), by %s> published in %d”\n",
                book1.getName(), book1.getPrice(), book1.getAuthor().getName(), book1.getYear());

        System.out.printf("“%s (%.2f RON), by %s> published in %d”\n",
                book2.getName(), book2.getPrice(), book2.getAuthor().getName(), book2.getYear());

        System.out.printf("“%s (%.2f RON), by %s> published in %d”\n",
                book3.getName(),book3.getPrice(), book3.getAuthor().getName(), book3.getYear());
    }
}