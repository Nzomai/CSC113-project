package project113;

public class Reservation {

	private int ReservNo ;
	private int checkIn ;
	private int checkOut ;
	private Room customerRoom ;
	private Customer c ;


	public Reservation( int chIn , int chOut , Room cRoom , Customer c) {

		ReservNo = generateResNumber();
		this.checkIn = chIn ;
		this.checkOut = chOut ;
		this.customerRoom = cRoom ;
		customerRoom.setAvailable(false);
		this.c = c ;
	}
	
    public int generateResNumber() {
		
		int r = 110 ;
		return r  + 1;
	}
	
	public int duration() {
		
		return  checkOut - checkIn ;
	}
	
	public double totalPrice() {      // calculate reservation's price 
		
		return customerRoom.calculatePrice() * this.duration() ; 
		
	}

	
	
		@Override
	public String toString() {

		return  "Reservation Info: \n" +  c.toString() + "Reservation number = " + this.ReservNo + " \n Check in Day: " + this.checkIn +  " ,   Check out Day: " + checkOut + "\n Number of days: " + duration() + " \n Reservation Cost:  " + this.totalPrice() ;
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
			return c;
		}

		public void setC(Customer c) {
			this.c = c;
		}

	




}
