package project113;

public class Customer {
	
	private int cID ;
	private String name ;
	private String phoneNo ;
	
	public Customer (int id , String n , String phNo) {

		cID = id ;
		name = n ;
		phoneNo = phNo ;
	}
	
	public void display() {
		
		System.out.println(" Customer Name: " + name + ", ID IS: "+ cID + ", Phone Number: "+ phoneNo + "\n");
	}
	
}
