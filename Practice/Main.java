package Practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentActions studAction = new StudentActions();
        Scanner scanner = new Scanner(System.in);
        boolean isAppOpen = true;

        while (isAppOpen) {

            System.out.println(
                    "\nSelect from below \n 1.Register Students\n 2.Find by ID \n 3.Delete by ID \n 4.Fetch All \n 5.Exist the Application");

            // option = scanner.nextInt();
            // if (scanner.hasNextInt()) {
            // option = scanner.nextInt();
            // }

            int option = scanner.nextInt();
            switch (option) {

                case 1:
                    studAction.registerStudents();
                    break;
                case 2:
                    studAction.findByID();
                    break;
                case 3:
                    studAction.deleteByID();
                    break;
                case 4:
                    studAction.fetchAllStudDetails();
                    break;
                case 5:
                    isAppOpen = false;
                    System.out.println("Application Closed...!\n");
                    break;
                default:
                    System.out.println("Invalid Option...!\n");
                    break;
            }
        }
        scanner.close();
    }
}
