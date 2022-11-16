import java.util.ArrayList;
import java.util.SortedMap;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private int countOfBooks = 0;

    /*list of visitors who now owe a book*/
    private ArrayList<Visitor> visitors = new ArrayList<>();

    private boolean checkBooksEqual(Book one, Book two) {
        return one.getName().equals(two.getName()) && one.getAuthor().equals(two.getAuthor());
    }

    public boolean addBook(Book newBook) {
        for (Book book : books) {
            if (checkBooksEqual(book, newBook)) {
                return false;
            }
        }
        books.add(newBook);
        countOfBooks++;
        return true;
    }

    public boolean deleteBook(String nameToDelete) {
        int indexToDel = -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(nameToDelete)) {
                indexToDel = i;
                break;
            }
        }
        if (indexToDel == -1) {
            System.out.println("Книга с названием \"" + nameToDelete + "\" не найдена");
            return false;
        } else if (books.get(indexToDel).isBorrowed()) {
            System.out.println("Книга сейчас одолжена");
            return false;
        } else {
            books.remove(indexToDel);
            countOfBooks--;
            return true;
        }
    }

    public Book findBook(String nameToFind) {
        for (Book book : books) {
            if (book.getName().equals(nameToFind)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> getBooksByAuthor(String authorToFind) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(authorToFind)) {
                result.add(book);
            }
        }
        return result;
    }

    public int getCountOfAllBooks() {
        return countOfBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public boolean borrowBook(Visitor visitor, String name) {
        if (visitor.getBorrowedBook() == null) {
            Book bookToBorrow = findBook(name);
            if (bookToBorrow == null) {
                System.out.println("В библиотеке нет книги с названием \"" + name + "\"");
                return false;
            } else if (bookToBorrow.isBorrowed()) {
                System.out.println("Книга сейчас одолжена");
                return false;
            } else {
                bookToBorrow.borrowThisBook();
                visitor.setBorrowedBook(bookToBorrow);
                visitors.add(visitor);
                return true;
            }
        } else {
            System.out.println("У вас уже одолжена книга, сдайте сначала ее");
            return false;
        }
    }

    private int findVisitor(Visitor visitorToFind) {
        for (int i = 0; i < visitors.size(); i++) {
            if (visitors.get(i).equals(visitorToFind)) {
                return i;
            }
        }
        return -1;
    }

    public boolean returnBook(Visitor visitor, String name) {
        /*firstly compare current visitor with list in a library*/
        int indexOfVisitor = findVisitor(visitor);
        if (indexOfVisitor != -1) {
            /*then compare the book from visitors list with the returned book*/
            Visitor visitorFromList = visitors.get(indexOfVisitor);
            Book borrowedBook = visitorFromList.getBorrowedBook();
            if (borrowedBook.getName().equals(name)) {
                borrowedBook.returnThisBook();
                visitor.returnBook();
                visitors.remove(indexOfVisitor);
                return true;
            } else {
                System.out.println("Вы сдаете не ту книгу, которую брали");
                return false;
            }
        } else {
            System.out.println("Вы не посетитель этой библиотеки");
            return false;
        }
    }
    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public ArrayList<Book> getBorrowedBooks() {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isBorrowed()) {
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (!book.isBorrowed()) {
                result.add(book);
            }
        }
        return result;
    }
}
