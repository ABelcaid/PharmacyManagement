package Pharmacy;

public class Pharmacist {
	private int id;
	private String firstName;
	private String lastName;
	private int telephoneNumber;
	private String email;

	public Pharmacist(int id, String fristName, String lastName, int telephoneNumber, String email) {
		this.id = id;
		this.firstName = fristName;
		this.lastName = lastName;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristName() {
		return firstName;
	}

	public void setFristName(String fristName) {
		this.firstName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pharmacist [id="+ id + "\", firstName=" + firstName + "\", lastName=" + lastName + "\", telephoneNumber=" + telephoneNumber + "\" email="+ email +"]";
	}

}
