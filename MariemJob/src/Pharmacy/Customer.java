package Pharmacy;

public class Customer extends Pharmacist {
	private int badge;

	public Customer(int id, String fristName, String lastName, int telephoneNumber, String email, int badge) {
		super(id, fristName, lastName, telephoneNumber, email);
		this.badge = badge;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

}
