
public class Pharmacist {
	private int id;
	private String fristName;
	private String lastName;
	private String telephoneNumber;
	private String email;

	public Pharmacist(int id, String fristName, String lastName, String telephoneNumber, String email) {
		this.id = id;
		this.fristName = fristName;
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
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
