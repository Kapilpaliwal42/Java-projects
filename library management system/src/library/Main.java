package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database.initialize();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Add User");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Book Author: ");
                    String author = scanner.nextLine();
                    BookDAO.addBook(title, author);
                    break;
                case 2:
                    for (Book book : BookDAO.getAllBooks()) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    System.out.print("User Name: ");
                    String name = scanner.nextLine();
                    UserDAO.addUser(name);
                    break;
                case 4:
                    System.out.println("Exiting. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
