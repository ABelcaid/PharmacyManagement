package com.PharmacyManagement.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.PharmacyManagement.models.Customer;
import com.PharmacyManagement.models.Medicine;
import com.PharmacyManagement.models.Pharmacist;

public class Main {

	public static Comparator<Pharmacist> NameComparator = new Comparator<Pharmacist>() {

		public int compare(Pharmacist c1, Pharmacist c2) {
			String customerName1 = c1.getFristName().toUpperCase();
			String customerName2 = c2.getFristName().toUpperCase();

			// ascending order
			return customerName1.compareTo(customerName2);

		}
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
		ArrayList<Pharmacist> pharmacistList = new ArrayList<Pharmacist>();
		ArrayList<Pharmacist> customerList = new ArrayList<Pharmacist>();

		boolean var = true;
		// Display the title of the chosen module
		while (var) {
			System.out.println("+-------------------------+ :");
			System.out.println("| You Welcome in Our Application|");
			System.out.println("+-------------------------+ :");
			System.out.println("1\t  Medicine management");
			System.out.println("2\t  Phrmacist management");
			System.out.println("3\t  Customer management");
			System.out.println("4\t  Exit");

			System.out.println("Choix :");
			int choix = scanner.nextInt();
			switch (choix) {
			case 1:
				boolean var1 = true;
				while (var1) {

					// Display the menu
					System.out.println("1\t Add a medicine");
					System.out.println("2\t Modify a medicine");
					System.out.println("3\t Remove a medicine");
					System.out.println("4\t Find a medicine");
					System.out.println("5\t Show all medicines");
					System.out.println("6\t Exit ");

					System.out.println("\n Please enter your choice:");

					// Get user's choice
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						int medicineId = medicineList.size() + 1;
						System.out.println("Add a medicine Name \n");
						String medicineName = scanner.next();
						System.out.println("Add a medicine Description \n");
						String medicineDescription = scanner.next();
						System.out.println("Add a medicine Price \n");
						float medicinePrice = scanner.nextFloat();

						Medicine medicine = new Medicine(medicineId, medicineName, medicineDescription, medicinePrice);
						medicine.addMedicine(medicineList, medicine);
						System.out.println("added successfully");

						break;
					case 2:

						System.out.println("Give me the id to edit");

						int idSelected = scanner.nextInt() - 1;

						for (int i = 0; i < medicineList.size(); i++) {
							if (i == idSelected) {

								int newID = idSelected + 1;

								System.out.println("Name");
								String newName = scanner.next();

								System.out.println("medicine Description");
								String newDescription = scanner.next();

								System.out.println("Price");
								int newPrice = scanner.nextInt();

								Medicine editedMedicine = new Medicine(newID, newName, newDescription, newPrice);
								editedMedicine.editMedicine(medicineList, editedMedicine, idSelected);
								System.out.println("Edited successfully :");

							} else {
								System.out.println("id does not exist in the table");

							}

						}

						break;
					case 3:

						System.out.println("\n Give me the id to remove");

//						medicineList.remove();
						int index = scanner.nextInt() - 1;
						Medicine removedMedicine = new Medicine();
						removedMedicine.removeMedicine(medicineList, removedMedicine, index);
						System.out.println("Removed successfully");

						break;
					case 4:
						System.out.println("Find a medicine");
						String searchedMedicine = scanner.next();

						for (Medicine m : medicineList) {
							if (m.getMedicineName().equals(searchedMedicine)) {
								System.out.println(m.toString());
							}
						}

						break;
					case 5:
						Medicine allMedicine = new Medicine();
						allMedicine.allMedicines(medicineList);

						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("  %10s %10s %10s %10s", "Id", "  Name", " lDescription", " Price ");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (Medicine medicine2 : medicineList) {
							System.out.format("  %10s %10s %10s %10s", medicine2.getMedicineId(),
									medicine2.getMedicineName(), medicine2.getMedicineDescription(),
									medicine2.getMedicinePrice());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");
						break;
					case 6:
						System.out.println("Exit ....");

						var1 = false;
						var = true;
						break;

					default:
						System.out.println("Invalid choice");
					}// end of switch
				}
				break;
			case 2:
				boolean var2 = true;
				while (var2) {

					// Display the menu
					System.out.println("1\t Add a Phrmacist");
					System.out.println("2\t Modify a Phrmacist");
					System.out.println("3\t Remove a Phrmacist");
					System.out.println("4\t Find a Phrmacist");
					System.out.println("5\t show all Phrmacists");
					System.out.println("6\t  Exit");

					System.out.println("\n Please enter your choice:");

					// Get user's choice
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:

						int pharmacistId = pharmacistList.size() + 1;
						System.out.println("Add a Phrmacist first name \n");
						String firstName = scanner.next();
						System.out.println("Add a Phrmacist last name \n");
						String lastName = scanner.next();
						System.out.println("Add a Phrmacist phone number  \n");
						String phone = scanner.next();
						System.out.println("Add a Phrmacist Email  \n");
						String Email = scanner.next();

						Pharmacist pharmacist = new Pharmacist(pharmacistId, firstName, lastName, phone, Email);
						pharmacist.addPharmacist(pharmacistList, pharmacist);
						System.out.println("added successfully");

						break;
					case 2:

						System.out.println("Give me the id to edit");

						int idSelected = scanner.nextInt() - 1;
						System.out.println(idSelected);
						for (int i = 0; i < pharmacistList.size(); i++) {

							if (i == idSelected) {

								int newID = idSelected + 1;

								System.out.println("pharmacist  first Name");
								String newFirstName = scanner.next();

								System.out.println("pharmacist last name");
								String newLastNme = scanner.next();

								System.out.println("pharmacist phone number");
								String newPhone = scanner.next();

								System.out.println("pharmacist email");
								String newEmail = scanner.next();

								Pharmacist editedPharmacist = new Pharmacist(newID, newFirstName, newLastNme, newPhone,
										newEmail);
								editedPharmacist.editPharmacist(pharmacistList, editedPharmacist, idSelected);
								System.out.println("Edited successfully :");

							} else {
								System.out.println("id does not exist in the table");

							}

						}

						break;
					case 3:

						System.out.println("\n Give me the id to remove");
						int idToRemove = scanner.nextInt() - 1;
						Pharmacist removeedPharmacist = new Pharmacist();
						removeedPharmacist.removePharmacist(pharmacistList, removeedPharmacist, idToRemove);
						System.out.println("Removed successfully");

						break;
					case 4:
						System.out.println("Find a pharmacist");
						String searchedPharmacist = scanner.next();

						for (Pharmacist phar : pharmacistList) {
							if (phar.getFristName().equals(searchedPharmacist)) {
								System.out.println(phar.toString());
							}
						}
						break;
					case 5:
						Pharmacist allPharmacists = new Pharmacist();
						allPharmacists.allPharmacists(pharmacistList);

						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf(" %10s %10s %10s %10s %10s", "Id in table", "Id", " first Name", " last name",
								" phone ", "email");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (Pharmacist pharmacist2 : pharmacistList) {
							System.out.format(" %10s %10s %10s %10s %10s", pharmacist2.getId(),
									pharmacist2.getFristName(), pharmacist2.getLastName(),
									pharmacist2.getTelephoneNumber(), pharmacist2.getEmail());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");
						break;

					case 6:
						System.out.println("Exit ....");

						var2 = false;
						var = true;
						break;
					default:
						System.out.println("Invalid choice");
					}// end of switch
				}
				break;
			case 3:
				boolean var3 = true;
				while (var3) {

					// Display the menu
					System.out.println("1\t Add a Customer");
					System.out.println("2\t Modify a Customer");
					System.out.println("3\t Remove a Customer");
					System.out.println("4\t Find a Customer");
					System.out.println("5\t Show all Customers");
					System.out.println("6\t Sort customers");
					System.out.println("7\t Exit");

					System.out.println("\n Please enter your choice:");

					// Get user's choice
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:

						int customerId = customerList.size() + 1;
						System.out.println("Add a Customer first name \n");
						String firstName = scanner.next();
						System.out.println("Add a Customer last name \n");
						String lastName = scanner.next();
						System.out.println("Add a Customer phone number  \n");
						String phone = scanner.next();
						System.out.println("Add a Customer Email  \n");
						String Email = scanner.next();
						System.out.println("Add a Customer badge  \n");
						int badge = scanner.nextInt();
						Customer customer = new Customer(customerId, firstName, lastName, phone, Email, badge);
						customer.addCustomer(customerList, customer);
						System.out.println("added successfully");

						break;
					case 2:

						System.out.println("Give me the id to edit");

						int idSelected = scanner.nextInt() - 1;

						for (int i = 0; i < customerList.size(); i++) {
							if (i == idSelected) {

								int newID = idSelected + 1;

								System.out.println("Customer  first Name");
								String newFirstName = scanner.next();

								System.out.println("Customer last name");
								String newLastNme = scanner.next();

								System.out.println("Customer phone number");
								String newPhone = scanner.next();

								System.out.println("Customer email");
								String newEmail = scanner.next();

								System.out.println("Customer badge");
								int newbadge = scanner.nextInt();

								Customer editedCustomer = new Customer(newID, newFirstName, newLastNme, newPhone,
										newEmail, newbadge);
								editedCustomer.editCustomer(customerList, editedCustomer, idSelected);
								System.out.println("Edited successfully :");

								if (newbadge >= 3) {
									System.out.println(" \n the customer has become loyal \n");
								}

							} else {
								System.out.println("id does not exist in the table");

							}

						}

						break;
					case 3:

						System.out.println("\n Insert the id u want to remove");
						int rIndex = scanner.nextInt() - 1;
						Customer removeCustomer = new Customer();
						removeCustomer.editCustomer(customerList, removeCustomer, rIndex);
						System.out.println("Removed successfully");

						break;
					case 4:
						System.out.println("Find a Customer");
						String searchedcustomer = scanner.next();

						for (Pharmacist Cus : customerList) {
							if (Cus.getFristName().equals(searchedcustomer)) {
								System.out.println(Cus.toString());
							}
						}
						break;
					case 5:
						Customer customers = new Customer();
						customers.allCustomers(customerList);

						for (Pharmacist customer2 : customerList) {
							System.out.println(customer2.toString());
						}

						break;

					case 6:
						Collections.sort(customerList, NameComparator);
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("  %10s %10s %10s %10s %10s", "Id", " first Name", " last name", " phone ",
								"email");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");
						for (int i = 0; i < customerList.size(); i++) {
							System.out.format(" %10s %10s %10s %10s %10s", customerList.get(i).getId(),
									customerList.get(i).getFristName(), customerList.get(i).getLastName(),
									customerList.get(i).getTelephoneNumber(), customerList.get(i).getEmail());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");
						break;
					case 7:
						System.out.println("Exit ....");

						var3 = false;
						var = true;
						break;
					default:
						System.out.println("Invalid choice");
					}// end of switch
				}
				break;
			case 4:
				System.out.println("********************* Exit *********************");
				System.exit(0);
				break;
			default:

				System.out.println("Input error");
				break;
			}
		}

	}

}