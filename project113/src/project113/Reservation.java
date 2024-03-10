package project113;

public class Reservation {

	private int ReservNo ;
	private int checkIn ;
	private int checkOut ;
	private Room customerRoom ; 


	public Reservation(int ResNo, int chIn, int chOut , Room cRoom) {

		ReservNo = ResNo;
		this.checkIn = chIn ;
		this.checkOut = chOut ;
		this.customerRoom = cRoom ;
	}
	
	public int duration() {
		
		return  checkOut - checkIn ;
	}

		@Override
	public String toString() {

		return  "Reservation number = " + this.ReservNo + " , Check in Day: " + this.checkIn +  " , Check out Day: " +  "  , Number of days: " + duration() ;
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

	




}
