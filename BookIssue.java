package LMSystem;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class BookIssue {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static List<BookIssue> bookIssue = new ArrayList<BookIssue>();

    private static final AtomicInteger BIcount = new AtomicInteger(0);
    private int bookIssueId;
    private int bookId;
    private int studentId;
    private String bDate;
    private String rDate;
    private int ret;
    private float fine;

    /**
     * Book Issue constructor without parameters
     */
    public BookIssue() {
        super();
        bookIssueId = BIcount.incrementAndGet();
        ret=0;
        fine=0;
    }

    /**
     * Book Issue constructor with parameters
     * @param bookId
     * @param studentId
     * @param bDate
     * @param rDate
     * @param ret
     */
    public BookIssue(int bookId, int studentId, String bDate, String rDate, int ret, float fine) {

        super();
        bookIssueId = BIcount.incrementAndGet();
        this.bookId = bookId;
        this.studentId = studentId;
        this.bDate=bDate;
        this.rDate=rDate;
        this.ret=ret;
        this.fine=fine;

    }

    /**
     * get function for BookIssueId
     * @return bookIssueId
     */
    public int getBookIssueId() {
        return bookIssueId;
    }

    /**
     * get function for BookId
     * @return bookId
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * set function for BookId
     * @param bookId
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * get function for StudentId
     * @return steudentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * set function for studentId
     * @param studentId
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * get function for borrowDate
     * @return bDate
     */
    public String getbDate() {
        return bDate;
    }

    /**
     * set function for borrowDate
     * @param bDate
     */
    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    /**
     * get function for returnDate
     * @return rDate
     */
    public String getrDate() {
        return rDate;
    }

    /**
     * set function for returnDate
     * @param bDate
     */
    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    /**
     * get function for return
     * @return rDate
     */
    public int getRet() {
        return ret;
    }

    /**
     * set function for return
     * @param ret
     */
    public void setRet(int ret ) {
        this.ret = ret;
    }

    /**
     * get function for fine
     * @return fine
     */
    public float getFine() {
        return fine;
    }

    /**
     * set function for fine
     * @param fine
     */
    public void setFine(float fine ) {
        this.fine = fine;
    }
    @Override
    /**
     * toString function for student and issued book
     * @return String
     */
    public String toString() {

        String str;
        if(ret == 1) {
            str= "BookIsuue Id- " + bookIssueId +"Book Id- " + bookId + ", Student Id- " + studentId + ", Borrow Date- " + bDate + ", Return Date- " + rDate + ", Situation - Returned " ;
        }
        else
            str= "BookIssue Id- " + bookIssueId +"Book Id- " + bookId + ", Student Id- " + studentId + ", Borrow Date- " + bDate + ", Return Date- " + rDate + ", Situation - Not Returned " + ", Exra Fine- " + fine ;

        return str;
    }

}