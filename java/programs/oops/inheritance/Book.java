package programs.oops.inheritance;

public class Book extends Product {
    // Getters and Setters for author and numPages
    private final String author = "xyz";
    private final int numPages = 10;

    @Override // Explicitly mark this as overriding
    public void displayDetails() {
        super.displayDetails(); // Call parent class displayDetails
        System.out.println("Author: " + author + ", Pages: " + numPages);
    }
}
