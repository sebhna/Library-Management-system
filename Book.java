package LMSystem;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class Book {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static List<Book> books = new ArrayList<Book>();

    private static final AtomicInteger Bcount = new AtomicInteger(0);
    private int bookId;
    private String bookName;
    private String bookISBN;
    private String bookCategory;
    private String bookAuthor;
    private String bookPublisher;

    /**
     * Book constructor without parameters
     */
    public Book() {
        super();
        bookId = Bcount.incrementAndGet();
    }

    /**
     * Book constructor with parameters
     * @param bookName
     * @param bookISBN
     * @param bookCategory
     * @param bookAuthor
     * @param bookPublisher
     */
    public Book(String bookName, String bookISBN, String bookCategory, String bookAuthor, String bookPublisher) {

        super();
        bookId = Bcount.incrementAndGet();
        this.bookName = bookName;
        this.bookISBN = bookISBN;
        this.bookCategory = bookCategory;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;

    }

    /**
     * get function for BookId
     * @return bookId
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * get function for BookName
     * @return bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * set function for BookName
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * get function for BookISBN
     * @return bookISBN
     */
    public String getBookISBN() {
        return bookISBN;
    }

    /**
     * set function for BookISBN
     * @param bookISBN
     */
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    /**
     * get function for BookCategory
     * @return bookCategory
     */
    public String getBookCategory() {
        return bookCategory;
    }

    /**
     * set function for BookCategory
     * @param bookCategory
     */
    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    /**
     * get function for BookAuthor
     * @return bookAuthor
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * set function for BookAuthor
     * @param bookAuthor
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * get function for BookPublisher
     * @return bookPublisher
     */
    public String getBookPublisher() {
        return bookPublisher;
    }

    /**
     * set function for BookPublisher
     * @param bookPublisher
     */
    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    /**
     * toString function for books
     * @return String
     */
    public String toString() {
        return "Book Id- " + bookId + ", Book Name- " + bookName + ", Book ISBN- " + bookISBN +", Book Category- " + bookCategory + ", Book Author- " + bookAuthor + ", Book Publisher- " + bookPublisher;
    }

}