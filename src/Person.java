
public class Person {
	private int id;
	private String fristName;
	private String lastName;
	private int telephoneNumber;
	private String email;

	public Person(int id, String fristName, String lastName, int telephoneNumber, String email) {
		super();
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

}
