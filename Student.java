package LMSystem;

import static LMSystem.Librarian.bookIssue;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class Student {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static List<Student> student = new ArrayList<Student>();

    private static final AtomicInteger Scount = new AtomicInteger(0);
    private final int studentId;
    private String studentName;
    private String studentFName;
    private String studentTel;
    private String studentEmail;

    /**
     * Student constructor without parameters
     */
    public Student() {
        super();
        studentId = Scount.incrementAndGet();
    }

    /**
     * Student constructor with parameters
     * @param studentName
     * @param studentFName
     * @param studentTel
     * @param studentEmail
     */
    public Student(String studentName, String studentFName, String studentTel, String studentEmail) {

        super();
        studentId = Scount.incrementAndGet();
        this.studentName = studentName;
        this.studentFName = studentFName;
        this.studentTel = studentTel;
        this.studentEmail = studentEmail;

    }

    /**
     * get function for StudentId
     * @return studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * get function for StudentName
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * set function for studentName
     * @param studentName
     */
    public void setName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * get function for StudentFName
     * @return studentFName
     */
    public String getStudentFName() {
        return studentFName;
    }

    /**
     * set function for studentFName
     * @param studentFName
     */
    public void setFName(String studentFName) {
        this.studentFName = studentFName;
    }

    /**
     * get function for StudentTelephone
     * @return studentTel
     */
    public String getStudentTel() {
        return studentTel;
    }

    /**
     * set function for studentTelephone
     * @param studentTel
     */
    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel;
    }

    /**
     * get function for StudentEmail
     * @return studentEmail
     */
    public String getStudentEmail() {
        return studentEmail;
    }

    /**
     * set function for studentEmail
     * @param studentEmail
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    /**
     * toString function for student
     * @return String
     */
    public String toString() {
        return "Student Id- " + studentId + ", Student Full Name- " + studentName + ", Student Father's Name- " + studentFName +  "Student Telephone- " + studentTel + ", Student Email- " + studentEmail;
    }

    /**
     * Display all no returned issued books and then all the issued books
     */
    public void history() {

        System.out.println("\n");
        System.out.println("Book Issue List History: ");
        for (BookIssue bi : bookIssue) {
            if (bi.getStudentId()== studentId )
                System.out.println(bi);
        }
        System.out.println("\n -----------------------------");

        System.out.println("\n");
        System.out.println("Book Issue List: ");
        for (BookIssue bi : bookIssue) {
            System.out.println(bi);
        }
        System.out.println("\n");


    }

    /**
     * Display all issued books with fines and calculate the total
     */
    public void fines() {

        float fines=0;
        System.out.println("\n");
        System.out.println("Book Issue List with fines: ");
        for (BookIssue bi : bookIssue) {
            if (bi.getStudentId()== studentId ){
                System.out.println(bi);
                fines = fines + bi.getFine();
            }
        }
        System.out.println("\nTotal fines: " + fines);
        System.out.println("\n");

    }

    /**
     * Check for valid password-user ID to log in
     * @param id
     * @param p
     * @return true/false
     */
    public boolean login(String id,String p){

        boolean islog = false;
        if (id.equals("Student") && p.equals("1100")) {islog = true;}
        return islog;

    }

}