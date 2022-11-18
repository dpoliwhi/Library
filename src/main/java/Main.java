import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        /*create new books*/
//        Book one = new Book("Старик и море", "Хумингуэй");
//        Book two = new Book("Фиеста", "Хумингуэй");
//        Book three = new Book("Скотный двор", "Д. Оруэл");
//        Book four = new Book("Шантарам", "П.Д. Робертс");
//        Book five = new Book("Тревожные люди", "Ф. Бакман");
//        Book six = new Book("Вторая жизнь Уве", "Ф. Бакман");
//
//        /*create the Library*/
//        Library library = new Library();
//        /*add books in the Library*/
//        library.addBook(one);
//        library.addBook(two);
//        library.addBook(three);
//        library.addBook(four);
//        library.addBook(five);
//        library.addBook(six);
//
//        /*show all books in the Library (just names)*/
//        System.out.println("\n#Test_1#");
//        ArrayList<Book> allBooks = library.getAllBooks();
//        System.out.println("Список книг в библиотеке (названия)");
//        for (Book allBook : allBooks) {
//            System.out.println(allBook.getName());
//        }
//        /*show count of books in the Library*/
//        System.out.println("\n#Test_2#");
//        System.out.println("Колличество книг в библиотеке: " + library.getCountOfAllBooks());
//
//        /*try to add the book library contains*/
//        System.out.println("\n#Test_3#");
//        library.addBook(four);
//        System.out.println("Колличество книг в библиотеке после попытки добавления: " + library.getCountOfAllBooks());
//
//        /*try to find the book*/
//        System.out.println("\n#Test_4#");
//        Book found = library.findBook("Скотный двор");
//        if (found != null) {
//            System.out.println("Название найденой книги: " + found.getName());
//            System.out.println("Автор найденой книги: " + found.getAuthor());
//        } else {
//            System.out.println("Книга не найдена");
//        }
//
//        /*try to find another the book*/
//        System.out.println("\n#Test_5#");
//        String nameToFind = "1984";
//        found = library.findBook(nameToFind);
//        if (found != null) {
//            System.out.println("Название найденой книги: " + found.getName());
//            System.out.println("Автор найденой книги: " + found.getAuthor());
//        } else {
//            System.out.println("Книга с названием " + nameToFind + " не найдена");
//        }
//
//        /*try to delete the book*/
//        System.out.println("\n#Test_6#");
//        library.deleteBook("Фиеста");
//        System.out.println("Колличество книг в библиотеке после удаления: " + library.getCountOfAllBooks());
//
//        /*show all books of the author*/
//        System.out.println("\n#Test_7#");
//        String author = "Ф. Бакман";
//        ArrayList<Book> booksByAuthor = library.getBooksByAuthor(author);
//        System.out.println("Книги автора " + author + ":");
//        for (Book allBook : booksByAuthor) {
//            System.out.println(allBook.getName());
//        }
//
//        System.out.println("\n---------------------");
//        System.out.println("Работа с посетителями");
//        Visitor visitor1 = new Visitor("Егор");
//        Visitor visitor2 = new Visitor("Антон");
//        Visitor visitor3 = new Visitor("Никита");
//
//        /*try to borrow the book that is not in the library*/
//        System.out.println("\n#Test_8#");
//        library.borrowBook(visitor1, "Тень горы");
//
//        /*try to borrow an existing book*/
//        System.out.println("\n#Test_9#");
//        if (library.borrowBook(visitor1, "Шантарам")) {
//            System.out.println("Книга одолжена успешно");
//        }
//
//        /*show available and borrowed books*/
//        System.out.println("\n#Test_10#");
//        System.out.println("Доступные книги:");
//        ArrayList<Book> availableBooks = library.getAvailableBooks();
//        for (Book allBook : availableBooks) {
//            System.out.println(allBook.getName());
//        }
//        System.out.println();
//        System.out.println("Одолженные книги:");
//        ArrayList<Book> borrowedBooks = library.getBorrowedBooks();
//        for (Book allBook : borrowedBooks) {
//            System.out.println(allBook.getName());
//        }
//
//        /*try to borrow the same book*/
//        System.out.println("\n#Test_11#");
//        library.borrowBook(visitor2, "Шантарам");
//
//        /*try to borrow the book and then borrow another book*/
//        System.out.println("\n#Test_12#");
//        library.borrowBook(visitor2, "Тревожные люди");
//        library.borrowBook(visitor2, "Вторая жизнь Уве");
//
//        /*return book*/
//        System.out.println("\n#Test_13#");
//        if (library.returnBook(visitor1, "Шантарам")) {
//            System.out.println("Книга сдана успешно");
//        }
//
//        /*show available and borrowed books after return*/
//        System.out.println("\n#Test_14#");
//        System.out.println("Доступные книги:");
//        availableBooks = library.getAvailableBooks();
//        for (Book allBook : availableBooks) {
//            System.out.println(allBook.getName());
//        }
//        System.out.println();
//        System.out.println("Одолженные книги:");
//        borrowedBooks = library.getBorrowedBooks();
//        for (Book allBook : borrowedBooks) {
//            System.out.println(allBook.getName());
//        }
//
//        /*try to return another book by visitor*/
//        System.out.println("\n#Test_15#");
//        library.returnBook(visitor2, "Старик и море");
//
//        /*try to return the book by another user*/
//        System.out.println("\n#Test_16#");
//        library.returnBook(visitor3, "Тревожные люди");
    }
}
