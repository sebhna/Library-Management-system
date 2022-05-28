package LMSystem;

//import static LMSystem.Manager.bf;
//import static LMSystem.Manager.librarian;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class Librarian {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    static List<Librarian> librarian = new ArrayList<Librarian>();
    static List<BookIssue> bookIssue = new ArrayList<BookIssue>();
    static List<Student> student = new ArrayList<Student>();
    static List<Book> books = new ArrayList<Book>();

    private static final AtomicInteger Lcount = new AtomicInteger(0);
    private int LibrarianId;
    private String LibrarianName;
    private String LibrarianFName;
    private String LibrarianUsername;
    private String LibrarianPassword;
    private float LibrarianHours;
    private float LibrarianlSalbyHour;
    private float LibrarianExtras;
    private String LibrarianEmail;
    private String LibrarianTel;

    /**
     * Librarian constructor without parameters
     */
    public Librarian() {
        super();
        LibrarianId = Lcount.incrementAndGet();
    }

    /**
     * Librarian constructor with parameters
     * @param LibrarianName
     * @param LibrarianFName
     * @param LibrarianSalbyHour
     * @param LibrarianHours
     * @param LibrarianExtras
     * @param LibrarianEmail
     * @param LibrarianTel
     */
    public Librarian(String LibrarianName, String LibrarianFName, String LibrarianUsername, String LibrarianPassword, float LibrarianSalbyHour, float LibrarianHours, float LibrarianExtras, String LibrarianEmail, String LibrarianTel) {

        super();
        LibrarianId = Lcount.incrementAndGet();
        this.LibrarianName = LibrarianName;
        this.LibrarianFName = LibrarianFName;
        this.LibrarianUsername = LibrarianUsername;
        this.LibrarianPassword = LibrarianPassword;
        this.LibrarianlSalbyHour = LibrarianSalbyHour;
        this.LibrarianHours=LibrarianHours;
        this.LibrarianExtras=LibrarianExtras;
        this.LibrarianEmail = LibrarianEmail;
        this.LibrarianTel = LibrarianTel;

    }

    /**
     * get function for LibrarianId
     * @return LibrarianId
     */
    public int getLibrarianId() {
        return LibrarianId;
    }

    /**
     * get function for LibrarianName
     * @return LibrarianName
     */
    public String getLibrarianName() {
        return LibrarianName;
    }

    /**
     * set function for LibrarianName
     * @param LibrarianName
     */
    public void setLibrarianName(String LibrarianName) {
        this.LibrarianName = LibrarianName;
    }

    /**
     * get function for Librarian Father's Name
     * @return LibrarianFName
     */
    public String getLibrarianFName() {
        return LibrarianFName;
    }

    /**
     * set function for Librarian Father's Name
     * @param LibrarianFName
     */
    public void setLibrarianFName(String LibrarianFName) {
        this.LibrarianFName = LibrarianFName;
    }

    /**
     * get function for LibrarianUsername
     * @return LibrarianUsername
     */
    public String getLibrarianUsername() {
        return LibrarianUsername;
    }

    /**
     * get function for LibrarianPassword
     * @return LibrarianPassword
     */
    public String getLibrarianPassword() {
        return LibrarianPassword;
    }

    /**
     * get function for LibrarianExtras
     * @return LibrarianExtras
     */
    public float getLibrarianExtas() {
        return LibrarianExtras;
    }

    /**
     * set function for Librarian Extras
     * @param LibrarianExtras
     */
    public void setLibrarianExtas(float LibrarianExtras) {
        this.LibrarianExtras = LibrarianExtras;
    }

    /**
     * get function for LibrarianSalary per Hour
     * @return LibrarianSalbyHour
     */
    public float getLibrarianSallbyHour() {
        return LibrarianlSalbyHour;
    }

    /**
     * set function for Librarian LibrarianSalary per Hour
     * @param LibrarianSalbyHour
     */
    public void setLibrarianlSalbyHour(float LibrarianlSalbyHour) {
        this.LibrarianlSalbyHour = LibrarianlSalbyHour;
    }

    /**
     * get function for LibrarianWorkHours
     * @return LibrarianHours
     */
    public float getLibrarianHours() {
        return LibrarianHours;
    }

    /**
     * set function for LibrarianWorkHours
     * @param LibrarianHours
     */
    public void setLibrarianHours(float LibrarianHours) {
        this.LibrarianHours = LibrarianHours;
    }

    /**
     * get function for LibrarianEmail
     * @return LibrarianEmail
     */
    public String getLibrarianEmail() {
        return LibrarianEmail;
    }

    /**
     * set function for LibrarianEmail
     * @param LibrarianEmail
     */
    public void setLibrarianEmail(String LibrarianEmail) {
        this.LibrarianEmail = LibrarianEmail;
    }

    /**
     * get function for LibrarianTel
     * @return LibrarianTel
     */
    public String getLibrarianTel() {
        return LibrarianTel;
    }

    /**
     * set function for LibrarianTel
     * @param LibrarianTel
     */
    public void setLibrarianTel(String LibrarianTel) {
        this.LibrarianTel = LibrarianTel;
    }

    @Override
    /**
     * toString function for Librarians
     * @return String
     */
    public String toString() {
        return "Librarian Id- " + LibrarianId + ", Full Name- " + LibrarianName + ", Father's Name- " + LibrarianFName + ", Username- " + LibrarianUsername + ", Password- " + LibrarianPassword +", Salary per Hour- " + LibrarianlSalbyHour + ", Work Hours- " + LibrarianHours + ", Extras- " + LibrarianExtras +", Email- " + LibrarianEmail +", Telephone Num- " + LibrarianTel ;
    }

    /**
     * Add a book
     * @throws IOException
     */
    public void addBook() throws IOException {

        int i, flag = 0;

        System.out.print("Enter book name: ");
        String name = bf.readLine();
        System.out.print("Enter book ISBN: ");
        String ISBN = bf.readLine();
        System.out.print("Enter book category: ");
        String category = bf.readLine();
        System.out.print("Enter book author: ");
        String author = bf.readLine();
        System.out.print("Enter book publisher: ");
        String publisher = bf.readLine();

        if (books.isEmpty()) { // check if the book List is empty or not
            Book bk = new Book(name, ISBN, category, author, publisher);
            books.add(bk);
            System.out.println("\nBook Added Successfully");
            flag = 2;
        } else {
            for (i = 0; i < books.size(); i++) { // check if given ISBN is already present or not
                if (ISBN.equals(books.get(i).getBookISBN())) { // if present then don't add and give an error message
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            System.out.println("\nBook ID already Present");

        } else {
            if (flag == 0) {
                Book bk = new Book(name, ISBN, category, author, publisher);
                books.add(bk);
                System.out.println("\nBook Added Successfully");
            }
        }
        System.out.println("\n");

    }

    /**
     * Update a book
     * @throws IOException
     */
    public void updateBook() throws IOException {

        int i, flag = 0, j = 0;
        System.out.print("Enter Book ISBN to Update: ");
        String ISBN = bf.readLine();
        System.out.print("Enter Updated Book Publisher: ");
        String bookPublisher = bf.readLine();
        for (i = 0; i < books.size(); i++) {
            if (ISBN.equals(books.get(i).getBookISBN())) {
                flag = 1;
                j = i;
            }
        }

        if (flag == 1) {
            books.get(j).setBookPublisher(bookPublisher);;
            System.out.println("\nPublisher Updated Successfully. Display to check");
        } else {
            System.out.println("\nBook not found");
        }
        System.out.println("\n");

    }

    /**
     * Delete a book
     * @throws IOException
     * @throws NumberFormatException
     */
    public void deleteBook() throws NumberFormatException, IOException {

        int i, flag = 0, j = 0;
        System.out.print("Enter Book Id to delete: ");
        int id = Integer.parseInt(bf.readLine());
        for (i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == id) {
                flag = 1;
                j = i;
            }
        }
        if (flag == 1) {
            books.remove(j);
            System.out.println("\nBook Removed Suucessfully. Display to check");
        } else {
            System.out.println("\nBook not found");
        }
        System.out.println("\n");

    }

    /**
     * Display all books,by category or by author
     * @throws NumberFormatException
     * @throws java.io.IOException
     */
    public void displayBook() throws NumberFormatException, IOException {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.printf("\nDisplay: \n\n1. All. \n2. By author. \n3. By category. \n");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println("\n");
                    System.out.println("Book List: ");
                    for (Book b : books) {
                        System.out.println(b);
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("\n");

                    System.out.print("Enter Author: ");
                    String author = bf.readLine();

                    System.out.println("Book List: ");
                    for (Book b : books) {
                        if (b.getBookAuthor().equals(author))
                            System.out.println(b);
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("\n");

                    System.out.print("Enter Category: ");
                    String category = bf.readLine();

                    System.out.println("Book List: ");
                    for (Book b : books) {
                        if (b.getBookCategory().equals(category))
                            System.out.println(b);
                    }
                    System.out.println("\n");
                    break;
            }

        }
    }


    /**
     * Add a student
     * @throws IOException
     */
    public void addStudent() throws IOException{

        int i, flag = 0;
        System.out.print("Enter Student Full Name: ");
        String studentName = bf.readLine();
        System.out.print("Enter Student Father's Name: ");
        String studentFName = bf.readLine();
        System.out.print("Enter Student Telephone Number: ");
        String studentTel = bf.readLine();
        System.out.print("Enter Student e-mail: ");
        String studentEmail = bf.readLine();

        if (student.isEmpty()) { // check if the student Array List is empty or not
            Student st = new Student(studentName, studentName, studentTel, studentEmail);
            student.add(st);
            System.out.println("\nStudent Added Successfully. Display to check");
            flag = 2;
        } else {
            for (i = 0; i < student.size(); i++) { // check if already present or not
                if (studentName.equals(student.get(i).getStudentName()) && studentFName.equals(student.get(i).getStudentFName())) { // if present then don't add and give an error msg
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("\nStudent already Present");

        } else {
            if (flag == 0) {
                Student st = new Student(studentName, studentFName, studentTel, studentEmail);
                student.add(st);
                System.out.println("\nStudent Added Successfully. Display to check");
            }
        }

        System.out.println("\n");
    }

    /**
     * Update a student
     * @throws IOException
     * @throws NumberFormatException
     */
    public void updateStudent() throws NumberFormatException, IOException {

        try (Scanner scanner = new Scanner(System.in)) {

            int i, flag = 0, j = 0;
            System.out.print("Enter Student id to Update: ");
            int id = Integer.parseInt(bf.readLine());

            System.out.printf("\nUpdate: \n\n1. Telephone number. \n2. Email. \n");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:

                    System.out.print("Enter Updated Student Telephone Number: ");
                    String studentTel = bf.readLine() ;
                    for (i = 0; i < student.size(); i++) {
                        if (student.get(i).getStudentId() == id) {
                            flag = 1;
                            j = i;

                        }
                    }

                    if (flag == 1) {
                        student.get(j).setStudentTel(studentTel);
                        System.out.println("\n Student Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nStudent not found");
                    }
                    System.out.println("\n");
                    break;

                case 2:

                    System.out.print("Enter Updated Student E-mail: ");
                    String studentEmail = bf.readLine() ;
                    for (i = 0; i < student.size(); i++) {
                        if (student.get(i).getStudentId() == id) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {
                        student.get(j).setStudentEmail(studentEmail);
                        System.out.println("\nStudent Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nStudent not found");
                    }
                    System.out.println("\n");
                    break;

            }
        }
    }

    /**
     * Display all students
     */
    public void displayStudent() {

        System.out.println("\n");
        System.out.println("Student List: ");
        for (Student s : student) {
            System.out.println(s);
        }
        System.out.println("\n");

    }


    /**
     * Issue book to student
     * @throws IOException
     * @throws NumberFormatException
     */
    public void addBookIssue() throws NumberFormatException, IOException  {

        System.out.print("Enter Book id to issue: ");
        int i, flag1 = 0, flag2 = 0;
        int bid = Integer.parseInt(bf.readLine());
        System.out.print("Enter Student id to issue: ");
        int sid = Integer.parseInt(bf.readLine());
        System.out.print("Enter borrow date: ");
        String bDate = bf.readLine();
        System.out.print("Enter return date: ");
        String rDate = bf.readLine();
        int ret=0;   //no returned
        float fine=0; //no fine

        for (i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bid) {
                flag1 = 1;
            }
        }

        for (i = 0; i < student.size(); i++) {
            if (student.get(i).getStudentId() == sid) {
                flag2 = 1;
            }
        }

        if (flag1 == 1 && flag2 == 1) {
            BookIssue bk = new BookIssue(bid, sid, bDate, rDate, ret, fine);
            bookIssue.add(bk);
            System.out.println("\nBook Issued Successfully. Display to Check");
        } else {
            System.out.println("\nBook ID or Student ID not found");
        }

        System.out.println("\n");

    }

    /**
     * Update Issue book
     * @throws IOException
     * @throws NumberFormatException
     */
    public void updateBookIssue() throws NumberFormatException, IOException {

        try (Scanner scanner = new Scanner(System.in)) {

            int i, flag = 0, j = 0;// id krathshs
            System.out.print("Enter Book id to Update: ");
            int id = Integer.parseInt(bf.readLine()) ;

            System.out.printf("\nUpdate: \n\n1. Situation \n2. Fine \n");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:

                    for (i = 0; i < bookIssue.size(); i++) {
                        if (bookIssue.get(i).getBookId() == id ) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {
                        bookIssue.get(j).setRet(1);
                        System.out.println("\nNew Situation - Returned.");
                        System.out.println("\nSituation Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nBook not found");
                    }
                    System.out.println("\n");
                    break;

                case 2:

                    System.out.print("Enter Updated Fine: ");
                    float fine = Float.parseFloat(bf.readLine());
                    for (i = 0; i < bookIssue.size(); i++) {
                        if (bookIssue.get(i).getBookId() == id ) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {

                        float tFine= bookIssue.get(j).getFine()+fine;
                        bookIssue.get(j).setFine(tFine);
                        System.out.println("\nFine Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nBook not found");
                    }
                    System.out.println("\n");
                    break;

            }
        }
    }

    /**
     * Delete a book issue
     * @throws IOException
     * @throws NumberFormatException
     */
    public void deleteBookIssue() throws NumberFormatException, IOException {

        int i, flag = 0, j = 0;
        System.out.print("Enter BookIssue Id to delete: ");
        int id = Integer.parseInt(bf.readLine());
        for (i = 0; i < bookIssue.size(); i++) {
            if (bookIssue.get(i).getBookIssueId() == id) {
                flag = 1;
                j = i;
            }
        }
        if (flag == 1) {
            books.remove(j);
            System.out.println("\nBookIssue Removed Suucessfully. Display to check");
        } else {
            System.out.println("\nBookIssue not found");
        }
        System.out.println("\n");

    }

    /**
     * Display all no returned issued books and then all the issued books
     */
    public void displayBookIssue() {

        System.out.println("\n");
        System.out.println("Book Issue List - No returned Books: ");
        for (BookIssue bi : bookIssue) {
            if (bi.getRet()==0)
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
     * Search student by id and display list of books issued to student or
     * Search book by id and display list of student books has issued
     * @throws IOException
     * @throws NumberFormatException
     */
    public void searchBookStudent() throws NumberFormatException, IOException {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.printf("\nSearch: \n\n1. Student by id. \n2. Book by id. \n");
            int choice = scanner.nextInt();
            int i,id, flag = 0;

            switch (choice){

                case 1:
                    System.out.print("Enter Student id to search for issue: ");

                    id = Integer.parseInt(bf.readLine());
                    for (i = 0; i < bookIssue.size(); i++) {
                        if (bookIssue.get(i).getStudentId() == id) {
                            System.out.println(bookIssue.get(i));
                            flag = 1;
                        }
                    }

                    if (flag == 0) {
                        System.out.println("\nStudent ID not found");
                    }

                    System.out.println("\n");
                    break;

                case 2:

                    System.out.print("Enter Book id to search for issue: ");

                    id = Integer.parseInt(bf.readLine());
                    for (i = 0; i < bookIssue.size(); i++) {
                        if (bookIssue.get(i).getBookId() == id) {
                            System.out.println(bookIssue.get(i));
                            flag = 1;
                        }
                    }

                    if (flag == 0) {
                        System.out.println("Book ID not found");
                    }
                    System.out.println("\n");
                    break;

            }
        }
    }

    /**
     * Calculate LibrarianSalary
     * @param LibrarianSalbyHour
     * @param LibrarianHours
     * @param Extras
     * @return LibrarianSalary
     */
    public float calculateLibrarianSalary(float LibrarianSalbyHour, float LibrarianHours, float Extras) {

        return LibrarianSalbyHour * LibrarianHours +Extras;
    }




    /**
     * Check for valid password-user ID to log in
     * @param id
     * @param p
     * @return true/false
     */
    public boolean login(String id,String p){


        boolean islog = false;
        if (id.equals("Librarian") && p.equals("1111")) {islog = true;}
        return islog;

			/* boolean islog = false;

            for (int i = 0; i < librarian.size(); i++) {
                var librarianId2 = librarian.get(i).getLibrarianId();
				if (id.equals(librarianId2) && p.equals(librarian.get(i).getLibrarianPass())) {
                    islog = true;
                }
            }

            return islog;*/


    }

}