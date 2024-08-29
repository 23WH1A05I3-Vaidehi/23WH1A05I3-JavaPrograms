package Java_Programs;

import java.util.*;

class Persons {
	Scanner sc = new Scanner(System.in);
    public void getFirstName() {
   	   
   	    
	    System.out.println("Enter first name:");
	    String f = sc.nextLine();
	    System.out.println(f);
		 
   	   }
    public void getLastName() {
      	 
		 System.out.println("Enter last	 name:");
		 String l = sc.nextLine();
		 
   	   }
    class Employee extends Persons{
   	 public void getEmployeeId() {
   		 
   		System.out.println("Enter ID:");
		int i  = sc.nextInt();
   	
       	}
   	public void getLastName() {
     	 
		 System.out.println("Enter lastname:");
		 String l = sc.nextLine();
		 System.out.println(l);
		 System.out.println("Enter designation:");
		 String d = sc.nextLine();
		 
		 System.out.println(d);
		 
  	   }
   	 
    }


	public static void main(String[] args) {
	    Persons p1 = new Persons();
		Employee e1 = p1.new Employee();
		p1.getFirstName();
		e1.getLastName();

	}

}
