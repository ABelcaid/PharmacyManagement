package Pharmacy;
import java.util.ArrayList;

import java.util.Scanner;



public class Main {
	
	public static int menu () {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("+-------------------------+ :");
        System.out.println("| You Welcome in Our Application|");
        System.out.println("+-------------------------+ :");
        System.out.println("1 - Pharmacist Management ");
        System.out.println("4 - Quit");

        selection = input.nextInt();
        return selection;    
    }
	
	
    public static int submenu() {

    int selection;
    Scanner input = new Scanner(System.in);

    /***************************************************/

    System.out.println("Choose :");
    System.out.println("-------------------------\n");
    System.out.println("1 - Create ");
    System.out.println("2 - Update");
    System.out.println("3 - Delete");
    System.out.println("4 - Read All");
    System.out.println("5 - Search");
    System.out.println("6 - Back");

    selection = input.nextInt();
    return selection;    
}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Pharmacist> pharmacists = new ArrayList<Pharmacist>();
		
		  int out = 0;
		  int back = 0;
		  do {
	    switch (menu()) {
	    
      case 1:
      	 do
      	 { switch (submenu()) {
      	
           case 1:   
        	   
        	     int idPhamrcist;
        	     String firstName;
        	     String lastName;
        	     int telephoneNumber;
        	     String email;
        	     
        	     idPhamrcist= pharmacists.size()+1;
            	 System.out.println("First name :");
            	 firstName = input.next();
            	 System.out.println("Last name :");
            	 lastName = input.next();
            	 System.out.println("telephone Number :");
            	 telephoneNumber = input.nextInt();
            	 System.out.println("Email :");
            	 email = input.next();
            	 
            	 Pharmacist pharmacist = new Pharmacist(idPhamrcist,firstName,lastName,telephoneNumber,email); 
            	 
            	 pharmacist.setId(idPhamrcist);
            	 pharmacist.setFristName(firstName);
            	 pharmacist.setLastName(lastName);
            	 pharmacist.setTelephoneNumber(telephoneNumber);
            	 pharmacist.setEmail(email);
            	 pharmacists.add(pharmacist);
            	 System.out.println("Successfully added !");
            	 
               break;
           case 2:
        	
        	   System.out.println(" Enter the identification number  : ");
        	   idPhamrcist = input.nextInt();
        		 System.out.println("Fisrt name :");
        		 firstName = input.next();
        		 System.out.println("last name :");
        		 lastName = input.next();
        		 System.out.println("Email :");
        		 email = input.next();
        		 System.out.println("telephoneNumber :");
        		 telephoneNumber = input.nextInt();
        		 Pharmacist pharmacist1 = new Pharmacist(idPhamrcist,firstName,lastName,telephoneNumber,email);
        		 pharmacist1.setId(idPhamrcist);
            	 pharmacist1.setFristName(firstName);
            	 pharmacist1.setLastName(lastName);
            	 pharmacist1.setTelephoneNumber(telephoneNumber);
            	 pharmacist1.setEmail(email);
        		 pharmacists.set(idPhamrcist-1, pharmacist1);
        		 
          	    System.out.println("Successfully modified !");
               break;
           case 3:
        	   int idR;
        	   System.out.println("  Enter the identification number  : ");
        	   idR = input.nextInt();
        	   if(pharmacists.size() == 0) {
        		   System.out.println("Sorry , the pharmacist list is empty");
        	   }
        	   else {
        		   
        		   pharmacists.remove(idR-1);
            	   System.out.println("the pharmacist is removed");
        		   
        	   }
        	   
          	 
              break;
           case 4:
        	   if(pharmacists.size() == 0) {
        		   System.out.println("there is no pharmcists");
        	   }
        	   else {
        		   System.out.println(pharmacists);
        	   }
        	   
            	
                break;
           case 5:
        	   int index;
        	   System.out.println("Give me the id to search");
        	   index = input.nextInt();
        	   System.out.println(pharmacists.get(index - 1));
        	   
        	   
            	
                break;
           case 6:
           	back = 1;
           	
               break;
           default:
               System.out.println(" Input error !!");
               
       };
      	 } while (back == 0);
         
          break;
     
      case 2:
      	System.exit(0);
      	
          break;
      default:
          System.out.println(" Input error");
  }
	    
		  } while (out == 0);
		

    }
}