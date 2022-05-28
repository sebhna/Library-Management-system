package LMSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static List<Manager> manager = new ArrayList<Manager>();
    static List<Librarian> librarian = new ArrayList<Librarian>();
    public static String ManagerID = "Manager";
    public static String ManagerPassword = "0000";

    /**
     * Manager constructor without parameters
     */
    public Manager() {

    }


    /**
     * Add a librarian
     * @throws IOException
     */
    public void addLibrarian() throws IOException  {

        int i, flag = 0;

        System.out.print("Enter Librarian Full Name: ");
        String LibrarianName = bf.readLine();
        System.out.print("Enter Librarian Father's Name: ");
        String LibrarianFName = bf.readLine();
        System.out.print("Enter Librarian Userame: ");
        String LibrarianUsername = bf.readLine();
        System.out.print("Enter Librarian Password: ");
        String LibrarianPassword = bf.readLine();
        System.out.print("Enter Librarian Salary per Hour: ");
        float LibrarianSalbyHour = Float.parseFloat(bf.readLine());
        System.out.print("Enter Librarian Work Hours: ");
        float LibrarianHours = Float.parseFloat(bf.readLine());
        System.out.print("Enter Librarian Extras: ");
        float LibrarianExtras = Float.parseFloat(bf.readLine());
        System.out.print("Enter Librarian Email: ");
        String LibrarianEmail = bf.readLine();
        System.out.print("Enter Librarian Tel: ");
        String LibrarianTel = bf.readLine();

        if (librarian.isEmpty()) { 	// check if the librarian Array List is empty or not
            Librarian lb = new Librarian(LibrarianName, LibrarianFName, LibrarianUsername, LibrarianPassword, LibrarianSalbyHour, LibrarianHours, LibrarianExtras, LibrarianEmail, LibrarianTel);
            librarian.add(lb);
            System.out.println("\nLibrarian Added Successfully. Display to check");
            flag = 2;
        } else {
            for (i = 0; i < librarian.size(); i++) { // check if given id is already present or not
                if (LibrarianName.equals(librarian.get(i).getLibrarianName()) && LibrarianFName.equals(librarian.get(i).getLibrarianFName())) { // if present then don't add and give an error msg
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("\nLibrarian already Present");

        } else {
            if (flag == 0) {
                Librarian lb = new Librarian(LibrarianName, LibrarianFName, LibrarianUsername, LibrarianPassword, LibrarianSalbyHour, LibrarianHours, LibrarianExtras, LibrarianEmail,  LibrarianTel);
                librarian.add(lb);
                System.out.println("\nLibrarian Added Successfully. Display to check");
            }
        }

        System.out.println("\n");

    }

    /**
     * Update a librarian
     * @throws IOException
     * @throws NumberFormatException
     */
    public void updateLibrarian() throws NumberFormatException, IOException {

        try (Scanner scanner = new Scanner(System.in)) {

            int i, flag = 0, j = 0;
            System.out.print("Enter Librarian id to Update: ");
            int id = Integer.parseInt(bf.readLine());

            System.out.printf("\nUpdate: \n\n1. Salary per Hour \n2. Work Hours \n3. Extras \n4. E-mail \n5. Telephone Number.\n");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:

                    System.out.print("Enter Updated Librarian Salary per Hour: ");
                    float LibrarianlSalbyHour = Float.parseFloat(bf.readLine()) ;
                    for (i = 0; i < librarian.size(); i++) {
                        if (librarian.get(i).getLibrarianId() == id) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {
                        librarian.get(j).setLibrarianlSalbyHour(LibrarianlSalbyHour);
                        System.out.println("\nLibrarian Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nLibrarian not found");
                    }
                    System.out.println("\n");
                    break;

                case 2:

                    System.out.print("Enter Updated Librarian Salary Work Hours: ");
                    float LibrarianHours = Float.parseFloat(bf.readLine()) ;
                    for (i = 0; i < librarian.size(); i++) {
                        if (librarian.get(i).getLibrarianId() == id) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {
                        librarian.get(j).setLibrarianHours(LibrarianHours);
                        System.out.println("\nLibrarian Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nLibrarian not found");
                    }
                    System.out.println("\n");
                    break;

                case 3:

                    System.out.print("Enter Updated Librarian Extras: ");
                    float LibrarianExtras = Float.parseFloat(bf.readLine()) ;
                    for (i = 0; i < librarian.size(); i++) {
                        if (librarian.get(i).getLibrarianId() == id) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {
                        librarian.get(j).setLibrarianExtas(LibrarianExtras);
                        System.out.println("\nLibrarian Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nLibrarian not found");
                    }
                    System.out.println("\n");
                    break;

                case 4:

                    System.out.print("Enter Updated Librarian E-mail: ");
                    String librarianEmail = bf.readLine() ;
                    for (i = 0; i < librarian.size(); i++) {
                        if (librarian.get(i).getLibrarianId() == id) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {
                        librarian.get(j).setLibrarianEmail(librarianEmail);
                        System.out.println("\n Librarian Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nLibrarian not found");
                    }
                    System.out.println("\n");
                    break;

                case 5:

                    System.out.print("Enter Updated Librarian Telephone Number: ");
                    String librarianTel = bf.readLine() ;
                    for (i = 0; i < librarian.size(); i++) {
                        if (librarian.get(i).getLibrarianId() == id) {
                            flag = 1;
                            j = i;
                        }
                    }

                    if (flag == 1) {
                        librarian.get(j).setLibrarianTel(librarianTel);
                        System.out.println("\n Librarian Updated Successfully. Display to check");
                    } else {
                        System.out.println("\nLibrarian not found");
                    }
                    System.out.println("\n");
                    break;

            }
        }
    }


    /**
     * Delete a librarian
     * @throws IOException
     * @throws NumberFormatException
     */
    public void deleteLibrarian() throws NumberFormatException, IOException {

        int i, flag = 0, j = 0;

        System.out.print("Enter Librarian Id to delete: ");
        int id = Integer.parseInt(bf.readLine());

        for (i = 0; i < librarian.size(); i++) {
            if (librarian.get(i).getLibrarianId() == id) {
                flag = 1;
                j = i;
            }
        }
        if (flag == 1) {
            librarian.remove(j);
            System.out.println("\nLibrarian deleted Suucessfully. Display to check");
        } else {
            System.out.println("\nLibrarian not found");
        }

        System.out.println("\n");

    }

    /**
     * Search Librarian by id and display information or Display all librarians
     * @throws IOException
     * @throws NumberFormatException
     */
    public void searchanddisplayLibrarians() throws NumberFormatException, IOException  {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.printf("\nDisplay: \n\n1. Search by id. \n2. Display all.\n");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.print("Enter Librarian id to see information: ");
                    int i, flag = 0;
                    int id = Integer.parseInt(bf.readLine());
                    for (i = 0; i < librarian.size(); i++) {
                        if (librarian.get(i).getLibrarianId() == id) {
                            System.out.println(librarian.get(i));
                            flag = 1;
                        }
                    }

                    if (flag == 0) {
                        System.out.println("\nLibrarian ID not found");
                    }

                    System.out.println("\n");
                    break;

                case 2:

                    System.out.println("\n");
                    System.out.println("Librarians List: ");
                    for (Librarian li : librarian) {
                        System.out.println(li);
                    }
                    System.out.println("\n");
                    break;

            }
        }
    }

    /**
     * Calculate total Salary Expenses
     */
    public void calculateExpenses() {

        float sum=0;
        System.out.println("\n");
        System.out.println("Librarians List: ");
        for (Librarian li : librarian) {
            float sal=li.calculateLibrarianSalary(li.getLibrarianSallbyHour(), li.getLibrarianHours(), li.getLibrarianExtas());
            System.out.println("ID: " + li.getLibrarianId() + "   Salary :" + sal);
            sum=sum + sal;
        }
        System.out.println("\nTotal Expenses: " + sum);
        System.out.println("\n");

    }

}
