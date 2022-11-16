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

    public void create() {
        /*add books in the Library*/
        library.addBook(one);
        library.addBook(two);
        library.addBook(three);
        library.addBook(four);
        library.addBook(five);
        library.addBook(six);
    }
//    /*create new books*/
//    Book one = new Book("Старик и море", "Хумингуэй");
//    Book two = new Book("Фиеста", "Хумингуэй");
//    Book three = new Book("Скотный двор", "Д. Оруэл");
//    Book four = new Book("Шантарам", "П.Д. Робертс");
//    Book five = new Book("Тревожные люди", "Ф. Бакман");
//    Book six = new Book("Вторая жизнь Уве", "Ф. Бакман");
//    Library library = new Library();
//    /*add books in the Library*/

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
    }

    @org.junit.jupiter.api.Test
    void getCountOfAllBooks() {
    }

    @org.junit.jupiter.api.Test
    void getAllBooks() {
    }

    @org.junit.jupiter.api.Test
    void borrowBook() {
    }

    @org.junit.jupiter.api.Test
    void returnBook() {
    }

    @org.junit.jupiter.api.Test
    void getVisitors() {
    }

    @org.junit.jupiter.api.Test
    void getBorrowedBooks() {
    }

    @org.junit.jupiter.api.Test
    void getAvailableBooks() {
    }
}