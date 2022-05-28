package LMSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static List<Librarian> librarian = new ArrayList<Librarian>();
    static List<Student> student = new ArrayList<Student>();

    public static String ManagerID = "Manager";
    public static String ManagerPassword = "0000";

    public static void main(String args[]) throws NumberFormatException, IOException {

        System.out.println("\t\tLibrary Managment System\n");
        System.out.println("_____________________________________________________");

        try (Scanner sc = new Scanner(System.in)) {

            boolean Try = false;

            do{

                System.out.printf("Log In As: \n\n1. Manager  \n2. Librarian \n3. Student \n4. Press any key to Exit.\n");
                System.out.println("-----------------------------------------------------");
                String ch = sc.next();
                int resCh;
                String id;
                String password;

                switch (ch){

                    case "1":

                        Manager manager = new Manager();

                        System.out.println("\n\t\t - MANAGER - \n");
                        System.out.println("-----------------------------------------------------");
                        System.out.print("Enter your id : ");
                        id = sc.next();

                        System.out.print("\nEnter your password : ");
                        password=sc.next();

                        if (id.equals(ManagerID) && password.equals(ManagerPassword)){

                            Try = false;
                            System.out.println("\n-- Welcome --\n");
                            boolean cont = true;

                            do{

                                System.out.println("1. Add librarian ");
                                System.out.println("2. Update librarian ");
                                System.out.println("3. Delete librarian ");
                                System.out.println("4. Search & Display librarians ");
                                System.out.println("5. Calculate expenses for sallaries ");
                                System.out.println("7. Log out ");

                                resCh = Integer.parseInt(bf.readLine());

                                switch (resCh) {

                                    case 1:
                                        manager.addLibrarian();
                                        break;
                                    case 2:
                                        manager.updateLibrarian();
                                        break;
                                    case 3:
                                        manager.deleteLibrarian();
                                        break;
                                    case 4:
                                        manager.searchanddisplayLibrarians();
                                        break;
                                    case 5:
                                        manager.calculateExpenses();
                                        break;
                                    case 6:
                                        Try = true;
                                        cont = false;
                                }

                            }while(cont);

                        }
                        else{

                            System.out.println("\nInvalid input. Please try again. \n");
                            Try = true;

                        }

                        break;

                    case "2":

                        Librarian librarian = new Librarian();

                        System.out.println("\t\t - Librarian -");
                        System.out.println("-----------------------------------------------------");
                        System.out.print("Enter your id : ");
                        id = sc.next();

                        System.out.print("\nEnter your password : ");
                        password = sc.next();

                        if (librarian.login(id, password)){

                            Try = false;
                            System.out.println("\n-- Welcome --\n");
                            boolean cont = true;

                            do{

                                System.out.println("1. Add book ");
                                System.out.println("2. Update book ");
                                System.out.println("3. Delete book ");
                                System.out.println("4. Display books ");
                                System.out.println("------------------------------");
                                System.out.println("5. Add student ");
                                System.out.println("6. Update student ");
                                System.out.println("7. Display students ");

                                System.out.println("------------------------------");
                                System.out.println("8. Issue book");
                                System.out.println("9. Update issued book ");
                                System.out.println("10. Delete issued book" );
                                System.out.println("11. Display all issued books" );

                                System.out.println("------------------------------");
                                System.out.println("12. Search book/student ");

                                System.out.println("13. Log out ");

                                resCh = Integer.parseInt(bf.readLine());

                                switch (resCh) {

                                    case 1:
                                        librarian.addBook();
                                        break;
                                    case 2:
                                        librarian.updateBook();
                                        break;
                                    case 3:
                                        librarian.deleteBook();
                                        break;
                                    case 4:
                                        librarian.displayBook();
                                        break;
                                    case 5:
                                        librarian.addStudent();
                                        break;
                                    case 6:
                                        librarian.updateStudent();
                                        break;
                                    case 7:
                                        librarian.displayStudent();
                                        break;
                                    case 8:
                                        librarian.addBookIssue();
                                        break;
                                    case 9:
                                        librarian.updateBookIssue();
                                        break;
                                    case 10:
                                        librarian.deleteBookIssue();
                                        break;
                                    case 11:
                                        librarian.displayBookIssue();
                                        break;
                                    case 12:
                                        librarian.searchBookStudent();
                                        break;
                                    case 13:
                                        Try = true;
                                        cont = false;
                                }

                            }while (cont);
                        }
                        else{

                            System.out.println("\nInvalid input. Please try again. \n");
                            Try = true;
                        }

                        break;


                    case "3":

                        Student student = new Student();

                        System.out.println("\n\t\t - STUDENT - \n");
                        System.out.println("-----------------------------------------------------");
                        System.out.print("Enter your id : ");
                        id = sc.next();

                        System.out.print("\nEnter your password : ");
                        password=sc.next();

                        if (student.login(id, password)){

                            Try = false;
                            System.out.println("\n-- Welcome --\n");
                            boolean cont = true;

                            do{

                                System.out.println("1. History ");
                                System.out.println("2. Fines ");
                                System.out.println("3. Log out ");

                                resCh = Integer.parseInt(bf.readLine());

                                switch (resCh) {

                                    case 1:
                                        student.history();
                                        break;
                                    case 2:
                                        student.fines();
                                        break;
                                    case 3:
                                        Try = true;
                                        cont = false;
                                }

                            }while(cont);

                        }
                        else{

                            System.out.println("\nInvalid input. Please try again. \n");
                            Try = true;

                        }

                        break;

                    default :
                        Try = false;
                }

            }while (Try);
        }

        System.out.println("\n\t\t End Of Program ");
        System.out.println("_____________________________________________________");
    }
}
