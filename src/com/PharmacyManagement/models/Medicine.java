package com.PharmacyManagement.models;

import java.util.ArrayList;

public class Medicine {
	private int medicineId;
	private String medicineName;
	private String medicineDescription;
	private float medicinePrice;

	public Medicine(int medicineId, String medicineName, String medicineDescription, float medicinePrice) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineDescription = medicineDescription;
		this.medicinePrice = medicinePrice;
	}

	public Medicine() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "medicine id:" + medicineId + "\n medicine name:" + medicineName + "\n medicine description:"
				+ medicineDescription + "\n medicine price:" + medicinePrice + "\n ";
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineDescription() {
		return medicineDescription;
	}

	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}

	public float getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(float medicinePrice) {
		this.medicinePrice = medicinePrice;
	}
	// All methods

	public String addMedicine(ArrayList<Medicine> medicineList, Medicine objMedicine) {
		try {
			medicineList.add(objMedicine);
			return "Medicine Added";

		} catch (Exception ex) {
			return ex.getMessage();

		}
	}

	public String editMedicine(ArrayList<Medicine> medicineList, Medicine objMedicine, int index) {
		try {

			medicineList.set(index, objMedicine);
			return "Medicine Edited";

		} catch (Exception ex) {
			return ex.getMessage();

		}
	}

	public String removeMedicine(ArrayList<Medicine> medicineList, Medicine objMedicine, int index) {
		try {

			medicineList.remove(index);
			return "Medicine Removed";

		} catch (Exception ex) {
			return ex.getMessage();

		}
	}

	public String allMedicines(ArrayList<Medicine> medicineList) {
		try {

			String medicines = "";
			for (Medicine medicine : medicineList) {
				medicines += medicine + toString();
			}
			return medicines;
		} catch (Exception ex) {
			return ex.getMessage();

		}

	}
}
