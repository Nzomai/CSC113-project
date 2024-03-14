package project113;

public class Reservation {

	private int ReservNo ;
	private int checkIn ;
	private int checkOut ;
	private Room customerRoom ;
	private Customer customer ;
	private static int num = 111 ;


	public Reservation( int chIn , int chOut , Room cRoom , Customer c) {
		ReservNo = num++;
		this.checkIn = chIn ;
		this.checkOut = chOut ;
		this.customerRoom = cRoom ;
		customerRoom.setAvailable(false);
		this.customer = c ;

	}
	
    
	public int duration() {
		
		return  checkOut - checkIn ;
	}
	
	public double totalPrice() {  // calculate reservation's price 
		double t = customerRoom.calculatePrice();
		if(duration() == 1 )
			return  t ; 
		else {
			t =  t * this.duration();
			return t ;
		}
			
		
	}

	
	
		@Override
	public String toString() {

		return  "Reservation Info: \n" +  customer.toString() + "Reservation number = " + this.ReservNo + " \n Check in Day: " + this.checkIn +  " ,   Check out Day: " + checkOut + "\n Number of days: " + duration() +" \n " + customerRoom.toString() +" \n Reservation Cost:  " + this.totalPrice() ;
	}

		public int getReservNo() {
			return ReservNo;
		}

		public int getCheckIn() {
			return checkIn;
		}

		public int getCheckOut() {
			return checkOut;
		}

		public Room getCustomerRoom() {
			return customerRoom;
		}

		public Customer getC() {
			return customer;
		}


	




}
