import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    /*create new books*/
    Book one = new Book("Старик и море", "Хумингуэй");
    Book two = new Book("Фиеста", "Хумингуэй");
    Book three = new Book("Скотный двор", "Д. Оруэл");
    Book four = new Book("Шантарам", "П.Д. Робертс");
    Book five = new Book("Тревожные люди", "Ф. Бакман");
    Book six = new Book("Вторая жизнь Уве", "Ф. Бакман");
    Library library = new Library();


    @org.junit.jupiter.api.Test
    void addBook() {
        /*add books in the Library*/
        library.addBook(one);
        library.addBook(two);
        library.addBook(three);
        library.addBook(four);
        library.addBook(five);
        library.addBook(six);
        assertEquals(6, library.getAllBooks().size());
    }

    @org.junit.jupiter.api.Test
    void deleteBook() {
        library.addBook(one);
        library.addBook(two);
        library.deleteBook("Старик и море");
        assertEquals(1, library.getAllBooks().size());
    }

    @org.junit.jupiter.api.Test
    void findBook() {
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