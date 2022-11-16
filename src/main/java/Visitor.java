public class Visitor {
    private String name;

    private Book borrowedBook;

    public Visitor(String name) {
        this.name = name;
        borrowedBook = null;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void returnBook() {
        borrowedBook = null;
    }
}

