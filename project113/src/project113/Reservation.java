package project113;

public class Reservation {
	
	private int ReservNo ;
	private boolean payment ; 
	Room [] roomList ;
	int nOfr ;
	
	public Reservation(int RNo, boolean p, int size) {
		
		ReservNo = RNo;
		this.payment = p;
		this.roomList = new Room[size] ;
		nOfr = 0 ;
	}
	
	public boolean addRoom(Room r) {
		if (r.Available == true) {
			if(nOfr < roomList.length)
				roomList[nOfr++ ] =  r ;
			    r.Available = false ;
				return true ;
				 
		}
		else 
			return false ;
		
	}
	
	public boolean cancelReservation(int RoomNo) {
		
		for(int i = 0 ; i < this.nOfr ; i++)
			if (roomList[i].getRoomNo() == RoomNo )
			{
				roomList[i] = roomList[nOfr-1] ;
				nOfr-- ;
				roomList[i] = null ;
				roomList[i].setAvailable(true);
			return true ;
			}
		
		return false ;
		
	}
	
	public String toString() {
		
		String str = "" ;
		for(int i = 0 ; i < this.nOfr ; i++)
			str+= roomList[i].toString() ;
		
		return  "Reservation number = " + this.ReservNo + "Number of Rooms: " + this.nOfr + " \n Room information: \n"  + str;
	}

	public int getReservNo() {
		return ReservNo;
	}

	public void setReservNo(int reservNo) {
		ReservNo = reservNo;
	}

	public boolean isPayment() {
		return payment;
	}

	public void setPayment(boolean payment) {
		this.payment = payment;
	}

	public Room[] getRoomList() {
		return roomList;
	}

	public void setRoomList(Room[] roomList) {
		this.roomList = roomList;
	}

	public int getnOfr() {
		return nOfr;
	}

	public void setnOfr(int nOfr) {
		this.nOfr = nOfr;
	}
	
	
	
	

}
