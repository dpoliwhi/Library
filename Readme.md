
<p align="center">
<img src="resources/Main.jpg" alt="drawing"/>
</p>

# Simple Library
### Implementation of library with books and visitors and their interaction

The app allows you to perform different operations with books and clients

____
### Main features:

- **add book:** you can add new book in the library.<br>
If library contains this book already - the book will not be added


- **delete book:** you can delete book by name. <br>
If library isn't contains this book - method return false


- **find book:** method find by name and return the Book object or return null


- **get all books:** you can get the list of all books in the library


- **get books by author:** you can get the list of books found by author


- **create visitors:** you can create clients of library which have fields like name and borrowed book


- **borrow book:** one visitor can borrow one book if library contain it.<br>
Visitor can't borrow book if he has one already or if library don't have this book (by name).<br>
Visitor can't borrow book with is already borrowed by another client.


- **return book:** visitor can return just his book, not such another.<br>
Visitor can't return a book for someone.


- **get visitors:** return list of all clients which borrow some book


- **get borrowed books:** return list of all borrowed books


- **get available books:** return list of available books which is not borrowed by someone
