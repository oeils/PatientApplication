import java.util.Scanner;

/**
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: Collects patient information and displays medical
 * procedures, charges, and a summary.
 * Due: 10/09/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Elijah Peaks
 */
public class PatientDriverApp {

    /**
     * Gets patient information from the user.
     */
    public static Patient inputPatient(Scanner keyboard) {
        System.out.print("Enter first name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = keyboard.nextLine();

        System.out.print("Enter last name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Enter street address: ");
        String street = keyboard.nextLine();

        System.out.print("Enter city: ");
        String city = keyboard.nextLine();

        System.out.print("Enter state: ");
        String state = keyboard.nextLine();

        System.out.print("Enter ZIP code: ");
        String zip = keyboard.nextLine();

        System.out.print("Enter phone number (###-###-####): ");
        String phone = keyboard.nextLine();

        System.out.print("Enter emergency contact name: ");
        String emergencyName = keyboard.nextLine();

        System.out.print("Enter emergency contact phone (###-###-####): ");
        String emergencyPhone = keyboard.nextLine();

        return new Patient(firstName, middleName, lastName,
                street, city, state, zip, phone,
                emergencyName, emergencyPhone);
    }

    /**
     * Creates the first medical procedure.
     */
    public static Procedure createProcedure1() {
        Procedure procedure = new Procedure();
        procedure.setProcedureName("Physical Exam");
        procedure.setProcedureDate("07/20/2026");
        procedure.setPractitionerName("Dr. Irvine");
        procedure.setCharges(250.00);
        return procedure;
    }

    /**
     * Creates the second medical procedure.
     */
    public static Procedure createProcedure2() {
        Procedure procedure = new Procedure("X-ray", "07/20/2026");
        procedure.setPractitionerName("Dr. Jamison");
        procedure.setCharges(550.43);
        return procedure;
    }

    /**
     * Creates the third medical procedure.
     */
    public static Procedure createProcedure3() {
        return new Procedure("Blood Test", "07/20/2026",
                "Dr. Smith", 1400.75);
    }

    /**
     * Displays all patient information.
     */
    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient Information");
        System.out.println("-----------------------------");
        System.out.println(patient);
    }

    /**
     * Displays one procedure.
     */
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    /**
     * Displays the three procedures in a table.
     */
    public static void displayProcedureTable(
            Procedure p1, Procedure p2, Procedure p3) {

        System.out.println("\nProcedure Information");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-16s %-12s %-15s %12s %-8s%n",
                "Procedure", "Date", "Practitioner", "Charge", "Category");
        System.out.println("---------------------------------------------------------------");

        displayProcedureRow(p1);
        displayProcedureRow(p2);
        displayProcedureRow(p3);
    }

    /**
     * Displays one row of the procedure table.
     */
    public static void displayProcedureRow(Procedure procedure) {
        System.out.printf("%-16s %-12s %-15s %12s %-8s%n",
                procedure.getProcedureName(),
                procedure.getProcedureDate(),
                procedure.getPractitionerName(),
                procedure.getFormattedCharge(),
                procedure.getChargeCategory());
    }

    /**
     * Calculates the total procedure charges.
     */
    public static double calculateTotalCharges(
            Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }

    /**
     * Calculates the average procedure charge.
     */
    public static double calculateAverageCharge(
            Procedure p1, Procedure p2, Procedure p3) {
        return calculateTotalCharges(p1, p2, p3) / 3;
    }

    /**
     * Finds the procedure with the highest charge.
     */
    public static Procedure findHighestChargeProcedure(
            Procedure p1, Procedure p2, Procedure p3) {

        Procedure highest = p1;

        if (p2.getCharges() > highest.getCharges()) {
            highest = p2;
        }

        if (p3.getCharges() > highest.getCharges()) {
            highest = p3;
        }

        return highest;
    }

    /**
     * Counts procedures costing at least $1000.
     */
    public static int countExpensiveProcedures(
            Procedure p1, Procedure p2, Procedure p3) {

        int count = 0;

        if (p1.isExpensiveProcedure()) {
            count++;
        }

        if (p2.isExpensiveProcedure()) {
            count++;
        }

        if (p3.isExpensiveProcedure()) {
            count++;
        }

        return count;
    }

    /**
     * Displays the final summary of charges.
     */
    public static void displaySummary(
            Procedure p1, Procedure p2, Procedure p3) {

        double total = calculateTotalCharges(p1, p2, p3);
        double average = calculateAverageCharge(p1, p2, p3);
        Procedure highest = findHighestChargeProcedure(p1, p2, p3);
        int expensive = countExpensiveProcedures(p1, p2, p3);

        System.out.println("\nProcedure Summary");
        System.out.println("-----------------------------");
        System.out.printf("Total Charges: $%,.2f%n", total);
        System.out.printf("Average Charge: $%,.2f%n", average);
        System.out.println("Highest Charge: "
                + highest.getProcedureName() + " ("
                + highest.getFormattedCharge() + ")");
        System.out.println("Expensive Procedures: " + expensive);
    }

    /**
     * Runs the patient application.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Patient patient = inputPatient(keyboard);

        Procedure p1 = createProcedure1();
        Procedure p2 = createProcedure2();
        Procedure p3 = createProcedure3();

        displayPatient(patient);
        displayProcedure(p1);
        displayProcedureTable(p1, p2, p3);
        displaySummary(p1, p2, p3);

        System.out.println("\nThe program was developed by a Student: "
                + "Elijah Peaks 10/09/26");

        keyboard.close();
    }
}
