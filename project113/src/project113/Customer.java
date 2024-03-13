package project113;

public class Customer {

	private int cID ;
	private String name ;
	private String phoneNo ;

	public Customer (int id , String n , String phNo ) {

		cID = id ;
		name = n ;
		phoneNo = phNo ;
	}

	public String toString() {

		return " Customer Name: " + name + ", ID: "+ cID + ", Phone Number: "+ phoneNo + "\n";
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	
	
}


