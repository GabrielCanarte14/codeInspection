package labcodeinspection;

import java.util.Locale;

/**
 * This class represents an Email with a first name and a last name.
 */
public class Email {

    private final String m_firstName;
    private final String m_lastName;
    private String department;
    private String email;
    private String password;
    private final int defaultPasswordLength = 8;

    /**
     * Constructs a new Email with the specified first name and last name.
     *
     * @param firstName the first name of the email owner
     * @param lastName  the last name of the email owner
     */
    public Email(String firstName, String lastName) {
        this.m_firstName = firstName;
        this.m_lastName = lastName;
    }

    /**
     * This method displays the information of the email owner including first name,
     * last name, department, email, and password.
     */
    public void showInfo() {
        System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
        System.out.println("DEPARTMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
    }

    /**
     * Sets the department of the email owner based on the given department choice.
     *
     * @param depChoice an integer representing the department choice:
     *                  1 for Sales, 2 for Development, 3 for Accounting.
     *                  If an invalid choice is given, the department is set to "undefined".
     */
    public void setDepartment(int depChoice) {
        switch (depChoice) {
            case 1:
                this.department = "sales";
                break;
            case 2:
                this.department = "dev";
                break;
            case 3:
                this.department = "acct";
                break;
            default:
                this.department = "undefined";
                break;
        }
    }

    /**
     * Generates an email address and a random password for the email owner.
     * The email is created using the first name, last name, and department.
     * The password is generated with a default length.
     */
    public void generateEmail() {
        this.password = this.randomPassword(this.defaultPasswordLength);
        this.email = this.m_firstName.toLowerCase(Locale.ROOT) + "." + this.m_lastName.toLowerCase(Locale.ROOT) + "@" + this.department + ".espol.edu.ec";
    }

    /**
     * Generates a random password with the specified length.
     *
     * @param length the length of the password to be generated
     * @return the generated password
     */
    private String randomPassword(int length) {
        String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * set.length());
            password[i] = set.charAt(rand);
        }
        return new String(password);
    }
}
