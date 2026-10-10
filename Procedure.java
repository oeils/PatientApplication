/**
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: Stores information about a medical procedure,
 * including its name, date, practitioner, and charges.
 * Due: 10/09/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Elijah Peaks
 */
public class Procedure {

    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    /**
     * Creates a Procedure with no initial information.
     */
    public Procedure() {
    }

    /**
     * Creates a Procedure using its name and date.
     */
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    /**
     * Creates a Procedure with all information.
     */
    public Procedure(String procedureName, String procedureDate,
                     String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    /**
     * Returns the procedure name.
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * Sets the procedure name.
     */
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    /**
     * Returns the procedure date.
     */
    public String getProcedureDate() {
        return procedureDate;
    }

    /**
     * Sets the procedure date.
     */
    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    /**
     * Returns the practitioner's name.
     */
    public String getPractitionerName() {
        return practitionerName;
    }

    /**
     * Sets the practitioner's name.
     */
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    /**
     * Returns the procedure charges.
     */
    public double getCharges() {
        return charges;
    }

    /**
     * Sets the procedure charges.
     */
    public void setCharges(double charges) {
        this.charges = charges;
    }

    /**
     * Returns all procedure information.
     */
    public String toString() {
        return "Procedure: " + procedureName
                + "\nDate: " + procedureDate
                + "\nPractitioner: " + practitionerName
                + "\nCharge: " + getFormattedCharge();
    }

    /**
     * Checks if the procedure costs at least $1000.
     */
    public boolean isExpensiveProcedure() {
        return charges >= 1000;
    }

    /**
     * Applies a percentage discount to the charges.
     */
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            charges = charges - (charges * percent / 100);
        }
    }

    /**
     * Returns the procedure's charge category.
     */
    public String getChargeCategory() {
        if (charges < 500) {
            return "Low";
        } else if (charges < 1000) {
            return "Medium";
        } else {
            return "High";
        }
    }

    /**
     * Checks if the procedure was performed by the given practitioner.
     */
    public boolean isPerformedBy(String practitionerName) {
        return this.practitionerName != null
                && this.practitionerName.equalsIgnoreCase(practitionerName);
    }

    /**
     * Returns the charges formatted as currency.
     */
    public String getFormattedCharge() {
        return String.format("$%,.2f", charges);
    }
}

