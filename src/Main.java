import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
		ArrayList<Pharmacist> pharmacistList = new ArrayList<Pharmacist>();
		

		boolean var = true;
		// Display the title of the chosen module
		while (var) {
			System.out.println("*********************Pharmacy Management App*********************");
			System.out.println("Main Menu");

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
<<<<<<< HEAD
					System.out.println("5\t show a medicines");
=======
					System.out.println("5\t Exit medicine menu");
>>>>>>> 6d31a29b383da281066bf50ae7cfee53268e5c16

					System.out.println("\n Please enter your choice:");

					// Get user's choice
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Add a medicine Id \n");
						int medicineId = scanner.nextInt();
						System.out.println("Add a medicine Name \n");
						String medicineName = scanner.next();
						System.out.println("Add a medicine Description \n");
						String medicineDescription = scanner.next();
						System.out.println("Add a medicine Price \n");
						float medicinePrice = scanner.nextFloat();

						Medicine medicine = new Medicine(medicineId, medicineName, medicineDescription, medicinePrice);
						medicineList.add(medicine);// adding Medicine class object
						System.out.println("added successfully");

						break;
					case 2:
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%7s %7s %10s %10s %10s", "Id in table", "Id", " Name", " Description",
								" Price");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < medicineList.size(); i++) {
							System.out.format("%10s %10s %10s %10s %10s", i + 1, medicineList.get(i).getMedicineId(),
									medicineList.get(i).getMedicineName(), medicineList.get(i).getMedicineDescription(),
									medicineList.get(i).getMedicinePrice());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select ID to  modif");

						int idSelected = scanner.nextInt() - 1;

						for (int i = 0; i < medicineList.size(); i++) {
							if (i == idSelected) {

								System.out.println("ID");
								int newID = scanner.nextInt();
								medicineList.get(i).setMedicineId(newID);

								System.out.println("Name");
								String newName = scanner.next();
								medicineList.get(i).setMedicineName(newName);
						

								System.out.println("medicine Description");
								String newDescription = scanner.next();
								medicineList.get(i).setMedicineDescription(newDescription);
								

								System.out.println("Price");
								int newPrice = scanner.nextInt();
								medicineList.get(i).setMedicinePrice(newPrice);
								

								System.out.println("Edited successfully :");

							} else {
								System.out.println("id does not exist in the table");

							}

						}

						break;
					case 3:
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%7s %7s %10s %10s %10s", "Id in table", "Id", " Name", " Description",
								" Price");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < medicineList.size(); i++) {
							System.out.format("%10s %10s %10s %10s %10s", i + 1, medicineList.get(i).getMedicineId(),
									medicineList.get(i).getMedicineName(), medicineList.get(i).getMedicineDescription(),
									medicineList.get(i).getMedicinePrice());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("\n Insert the id u want to remove");

						medicineList.remove(scanner.nextInt() - 1);

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
						System.out.println("Exit ....");

						var1 = false;
						var = true;
						break;
					case 5:
						System.out.println(medicineList);
						break;
					default:
						System.out.println("Invalid choice");
					}// end of switch
				}
				break;
			case 2 : 
				boolean var2 = true;
				while (var2) {

					// Display the menu
					System.out.println("1\t Add a Phrmacist");
					System.out.println("2\t Modify a Phrmacist");
					System.out.println("3\t Remove a Phrmacist");
					System.out.println("4\t Find a Phrmacist");
					System.out.println("5\t show a Phrmacists");

					System.out.println("\n Please enter your choice:");

					// Get user's choice
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Add a Phrmacist Id \n");
						int pharmacistId = scanner.nextInt();
						System.out.println("Add a Phrmacist first name \n");
						String firstName = scanner.next();
						System.out.println("Add a Phrmacist last name \n");
						String lastName = scanner.next();
						System.out.println("Add a Phrmacist phone number  \n");
						String phone = scanner.next();
						System.out.println("Add a Phrmacist Email  \n");
						String Email = scanner.next();
						Pharmacist Pharmacist = new Pharmacist(pharmacistId, firstName, lastName, phone,Email);
						pharmacistList.add(Pharmacist);// adding Medicine class object
						System.out.println("added successfully");

						break;
					case 2:
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%7s %7s %10s %10s %10s %10s", "Id in table", "Id", " first Name", " last name",
								" phone ", "email");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < pharmacistList.size(); i++) {
							System.out.format("%10s %10s %10s %10s %10s %10s", i + 1, pharmacistList.get(i).getId(),
									pharmacistList.get(i).getFristName(), pharmacistList.get(i).getLastName(),
									pharmacistList.get(i).getTelephoneNumber(), pharmacistList.get(i).getEmail());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select ID to  modif");

						int idSelected = scanner.nextInt() - 1;

						for (int i = 0; i < pharmacistList.size(); i++) {
							if (i == idSelected) {

								System.out.println("ID");
								int newID = scanner.nextInt();
								pharmacistList.get(i).setId(newID); 

								System.out.println("pharmacist  first Name");
								String newFirstName = scanner.next();
								pharmacistList.get(i).setFristName(newFirstName);;
						

								System.out.println("pharmacist last name");
								String newLastNme = scanner.next();
								pharmacistList.get(i).setLastName(newLastNme);
								

								System.out.println("pharmacist phone number");
								String newPhone = scanner.next();
								pharmacistList.get(i).setTelephoneNumber(newPhone);
								
								System.out.println("pharmacist email");
								String newEmail = scanner.next();
								pharmacistList.get(i).setEmail(newEmail);

								System.out.println("Edited successfully :");

							} else {
								System.out.println("id does not exist in the table");

							}

						}

						break;
					case 3:
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%7s %7s %10s %10s %10s %10s", "Id in table", "Id", " first Name", " last name",
								" phone ", "email");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < pharmacistList.size(); i++) {
							System.out.format("%10s %10s %10s %10s %10s %10s", i + 1, pharmacistList.get(i).getId(),
									pharmacistList.get(i).getFristName(), pharmacistList.get(i).getLastName(),
									pharmacistList.get(i).getTelephoneNumber(), pharmacistList.get(i).getEmail());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("\n Insert the id u want to remove");
						pharmacistList.remove(scanner.nextInt() - 1);

						System.out.println("Removed successfully");

						break;
					case 4:
						System.out.println("Find a pharmacist");
						break;
					case 5:
						// pharmacistList
						//.stream().sorted()
						//.collect(Collectors.toList());
						//System.out.println(pharmacistList);
						 pharmacistList.forEach(System.out::println);
						

						break;
					default:
						System.out.println("Invalid choice");
					}// end of switch
				}
				break;

			default:

				System.out.println("invalid!!!!!!!!!!!");
				break;
			}
		}

	}

<<<<<<< HEAD

}
=======
}
>>>>>>> 6d31a29b383da281066bf50ae7cfee53268e5c16
