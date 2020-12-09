package com.PharmacyManagement.models;

import java.util.ArrayList;

public class Customer extends Pharmacist {
	private int badge;

	public Customer(int id, String fristName, String lastName, String telephoneNumber, String email, int badge) {
		super(id, fristName, lastName, telephoneNumber, email);
		this.badge = badge;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	@Override
	public String toString() {
		return super.toString() + "\n badge :" + badge;
//		return "Customer [badge=" + badge + ", toString()=" + super.toString() + "]";
	}

	public String addCustomer(ArrayList<Pharmacist> pharmacistList, Customer objCustomer) {
		try {
			return super.addPharmacist(pharmacistList, objCustomer);

		} catch (Exception ex) {
			return ex.getMessage();

		}
	}

	public String editCustomer(ArrayList<Pharmacist> pharmacistList, Customer objCustomer, int index) {
		try {
			return super.editPharmacist(pharmacistList, objCustomer, index);

		} catch (Exception ex) {
			return ex.getMessage();
		}

	}

	public String removePharmacist(ArrayList<Pharmacist> pharmacistList, Customer objCustomer, int index) {
		try {
			return super.removePharmacist(pharmacistList, objCustomer, index);

		} catch (Exception ex) {
			return ex.getMessage();
		}
	}

	public String allCustomers(ArrayList<Pharmacist> pharmacistList) {
		try {
			return super.allPharmacists(pharmacistList);

		} catch (Exception ex) {
			return ex.getMessage();
		}

	}

}