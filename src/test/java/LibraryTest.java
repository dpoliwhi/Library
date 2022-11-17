import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    /*create new books*/
    private final Book one = new Book("Старик и море", "Хумингуэй");
    private final Book two = new Book("Фиеста", "Хумингуэй");
    private final Book three = new Book("Скотный двор", "Д. Оруэл");
    private final Book four = new Book("Шантарам", "П.Д. Робертс");
    private final Book five = new Book("Тревожные люди", "Ф. Бакман");
    private final Book six = new Book("Вторая жизнь Уве", "Ф. Бакман");
    private final Library library = new Library();

    Visitor visitor1 = new Visitor("Егор");
    Visitor visitor2 = new Visitor("Антон");
    Visitor visitor3 = new Visitor("Никита");

    public void create() {
        /*add books in the Library*/
        library.addBook(one);
        library.addBook(two);
        library.addBook(three);
        library.addBook(four);
        library.addBook(five);
        library.addBook(six);
    }

    @org.junit.jupiter.api.Test
    void addBook() {
        create();
        assertEquals(6, library.getCountOfAllBooks());
        /*try to add the book library contains*/
        assertFalse(library.addBook(four));
        assertEquals(6, library.getCountOfAllBooks());
    }

    @org.junit.jupiter.api.Test
    void deleteBook() {
        create();
        library.deleteBook("Старик и море");
        assertEquals(5, library.getCountOfAllBooks());
        /*try to delete the book library not contains*/
        assertFalse(library.deleteBook("Крестный отец"));
        assertEquals(5, library.getCountOfAllBooks());
    }

    @org.junit.jupiter.api.Test
    void findBook() {
        create();
        assertEquals(library.findBook("Скотный двор"), three);
        /*try to find another the book*/
        assertNull(library.findBook("1984"));
    }

    @org.junit.jupiter.api.Test
    void getBooksByAuthor() {

        String author = "Ф. Бакман";
        ArrayList<Book> booksByAuthor = library.getBooksByAuthor(author);
        for (Book book : booksByAuthor) {
            assertEquals(book.getAuthor(), "Ф. Бакман");
        }
    }

    @org.junit.jupiter.api.Test
    void borrowBook() {
        create();
        /*try to borrow the book that is not in the library*/
        library.borrowBook(visitor1, "Тень горы");
        assertNull(visitor1.getBorrowedBook());
        /*try to borrow an existing book*/
        library.borrowBook(visitor1, "Шантарам");
        assertEquals(visitor1.getBorrowedBook().getAuthor(), "П.Д. Робертс");
        assertTrue(four.isBorrowed());
        /*try to borrow the same book*/
        assertFalse(library.borrowBook(visitor2, "Шантарам"));
        /*try to borrow the book and then borrow another book*/
        library.borrowBook(visitor2, "Тревожные люди");
        assertFalse(library.borrowBook(visitor2, "Вторая жизнь Уве"));
    }

    @org.junit.jupiter.api.Test
    void returnBook() {
        create();
        library.borrowBook(visitor1, "Тревожные люди");
        library.borrowBook(visitor2, "Вторая жизнь Уве");
        library.borrowBook(visitor3, "Фиеста");
        assertFalse(library.returnBook(visitor2, "Фиеста"));
        library.returnBook(visitor2, "Вторая жизнь Уве");
        assertEquals(library.getBorrowedBooks().size(), 2);
    }

    @org.junit.jupiter.api.Test
    void getVisitors() {
        create();
        library.borrowBook(visitor1, "Фиеста");
        library.borrowBook(visitor2, "Шантарам");
        library.borrowBook(visitor3, "Фиеста");
        assertEquals(library.getVisitors().size(), 2);
    }

    @org.junit.jupiter.api.Test
    void getBorrowedBooks() {
        create();
        library.borrowBook(visitor1, "Фиеста");
        library.borrowBook(visitor2, "Шантарам");
        assertEquals(library.getBorrowedBooks().size(), 2);
    }

    @org.junit.jupiter.api.Test
    void getAvailableBooks() {
        create();
        library.borrowBook(visitor1, "Фиеста");
        library.borrowBook(visitor2, "Шантарам");
        assertEquals(library.getAvailableBooks().size(), 4);
    }
}