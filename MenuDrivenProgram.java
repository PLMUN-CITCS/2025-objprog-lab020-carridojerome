import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop until the user chooses to exit
        while (true) {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Greet User");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            // Handle the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Hello! Welcome!");
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is an Even number.");
                    } else {
                        System.out.println(number + " is an Odd number.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
            System.out.println(); // Print a blank line for better readability
        }
    }
}