/**
 * Patient.java
 * CMSC203 - Assignment 2
 *
 * Stores patient information, including personal details,
 * address, phone number, and emergency contact information.
 *
 * Programmer: Elijah Peaks
 * Platform: Eclipse IDE
 */
public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhone;

	/**
	 * Creates a Patient object with no initial information.
	 */
	public Patient() {

	}

	/**
	 * Creates a Patient object using the first, middle, and last name.
	 */
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	/**
	 * Creates a Patient object with all patient information.
	 */
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city,
			String state, String zipCode, String phoneNumber, String emergencyContactName,
			String emergencyContactPhone) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhone = emergencyContactPhone;
	}

	/**
	 * Returns the patient's first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the patient's first name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the patient's middle name.
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Sets the patient's middle name.
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/**
	 * Returns the patient's last name.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the patient's last name.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Returns the patient's street address.
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	
	/**
	 * Sets the patient's street address.
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	/**
	 * Returns the patient's city.
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the patient's city.
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Returns the patient's state.
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the patient's state.
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Returns the patient's ZIP code.
	 */
	public String getZipCode() {
		return zipCode;
	}
	
	/**
	 * Sets the patient's ZIP code.
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	/**
	 * Returns the patient's phone number.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the patient's phone number.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Returns the patient's emergency contact name.
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	
	/**
	 * Sets the patient's emergency contact name.
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	
	/**
	 * Returns the patient's emergency contact phone number.
	 */
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}
	
	/**
	 * Sets the patient's emergency contact phone number.
	 */
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}
	
	/**
	 * Returns the patient's full name.
	 */
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	/**
	 * Returns the patient's full address.
	 */
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	
	/**
	 * Returns the emergency contact information.
	 */
	public String buildEmergencyContact() {
		return emergencyContactName + " " + emergencyContactPhone;
	}
	
	/**
	 * Returns all patient information as a String.
	 */
	public String toString() {
		return "Name: " + buildFullName()
		+ "\nAddress: " + buildAddress()
		+ "\nPhone Number: " + phoneNumber
		+ "\nEmergency Contact: " + buildEmergencyContact()
		+ "\nPhone Valid: " + isValidPhoneNumber()
		+ "\nEmergency Phone Valid: " + isValidEmergencyPhoneNumber();
		
	}
	
	/**
	 * Checks if the patient's phone number is valid.
	 */
	public boolean isValidPhoneNumber() {
		return phoneNumber != null &&
				phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
		
	}
	
	/**
	 * Checks if the emergency contact phone number is valid.
	 */
	public boolean isValidEmergencyPhoneNumber() {
		return emergencyContactPhone != null&&
				emergencyContactPhone.matches("\\d{3}-\\d{3}-\\d{4}");
	}
	
	/**
	 * Updates the patient's address.
	 */
	public void updateAddress(String street, String city,
			                  String state, String zip) {
		this.streetAddress = street;
		this.city = city;
		this.state = state;
		this.zipCode = zip;
	}
	
	/**
	 * Returns the patient's contact information.
	 */
	public String getContactSummary() {
		return "Patient: " + buildFullName()
		        + "\nPhone: " + phoneNumber
		        + "\nEmergency Contact: " + buildEmergencyContact();
	}
	
	/**
	 * Returns the patient's last, first, and middle name.
	 */
	public String getLastFirstMiddle() {
		return lastName + ", " + firstName + " " + middleName;
	}
	
	/**
	 * Checks if the patient lives in the given city and state.
	 */
	public boolean hasSameCityState(String city, String state) {
		return this.city.equalsIgnoreCase(city)
				&& this.state.equalsIgnoreCase(state);
	}
}
