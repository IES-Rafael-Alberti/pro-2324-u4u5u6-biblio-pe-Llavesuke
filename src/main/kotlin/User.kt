package org.pebiblioteca

import java.util.UUID

/**
 * People borrowing books from the library
 *
 * @property UUID The identifier of the user
 * @property Name The name of the user
 * @property borrowedList The list of books that the user borrow
 */
class User(private val ID: UUID, private val name: String) {
    private val borrowedList = mutableListOf<Book>()

    /**
     * Borrow a book from the library
     *
     * @param book The book that is borrowing
     *
     */
    fun borrowBook(book: Book){
        borrowedList.add(book)
    }

    /**
     * Return a book to the library
     *
     * @param book The book is returning
     *
     */
    fun returnBook(book: Book){
        borrowedList.remove(book)
    }

    /**
     * Check the books that the user has
     */
    fun checkBooks(){
        Utils.showList(borrowedList)
    }

    /**
     * Return the user borrowed list
     *
     * @return The user borrowed list
     */
    fun getBorrowedList(): List<Book>{
        return borrowedList
    }

    /**
     * Return the user name
     *
     * @return The user name
     */
    fun getUserName(): String{
        return this.name
    }

    override fun toString(): String {
        return "USER ID: ${this.ID}\n -Name: ${this.name}"
    }
}