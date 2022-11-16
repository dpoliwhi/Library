public class Book {
    private String name;
    private String author;

    private boolean isBorrowed;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        isBorrowed = false;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void borrowThisBook() {
        isBorrowed = true;
    }

    public void returnThisBook() {
        isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}

