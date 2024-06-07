package labcodeinspection;

import java.util.Scanner;


public class EmailApp {
	
	private EmailApp() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
	
	/**
     * The main method to run the program. It prompts the user to enter their first name,
     * last name, and department choice, then generates and displays their email and password.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		int depChoice = sc.nextInt();
		sc.close();

		Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
