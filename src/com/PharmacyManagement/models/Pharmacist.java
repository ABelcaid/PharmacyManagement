package com.PharmacyManagement.models;

import java.util.ArrayList;

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

	public Pharmacist() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return " id :" + id + "\n fristName :" + fristName + "\n lastName :" + lastName + "\n telephoneNumber :"
				+ telephoneNumber + "\n email :" + email;
	}

	// All methods

	public String addPharmacist(ArrayList<Pharmacist> pharmacistList, Pharmacist objPharmacist) {
		try {
			pharmacistList.add(objPharmacist);
			return "Pharmacist Added";

		} catch (Exception ex) {
			return ex.getMessage();

		}
	}

	public String editPharmacist(ArrayList<Pharmacist> pharmacistList, Pharmacist objPharmacist, int index) {
		try {

			pharmacistList.set(index, objPharmacist);
			return "Pharmacist Edited";

		} catch (Exception ex) {
			return ex.getMessage();

		}
	}

	public String removePharmacist(ArrayList<Pharmacist> pharmacistList, Pharmacist objPharmacist, int index) {
		try {

			pharmacistList.remove(index);
			return "Pharmacist removeed";

		} catch (Exception ex) {
			return ex.getMessage();

		}
	}

	public String allPharmacists(ArrayList<Pharmacist> pharmacistList) {
		try {

			String pharmacists = "";
			for (Pharmacist pharmacist : pharmacistList) {
				pharmacists += pharmacist + toString();
			}
			return pharmacists;
		} catch (Exception ex) {
			return ex.getMessage();

		}

	}

}