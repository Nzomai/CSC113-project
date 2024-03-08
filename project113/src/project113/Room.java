package project113;


public abstract class Room {
	
	protected int RoomNo;
	protected int floorNo;
	protected boolean Available;
	protected boolean view;
	protected int checkIn;
	protected int checkOut;
	
	public Room(int rNo, int fNo, boolean view, int chIn, int chOut) {
		RoomNo = rNo;
		floorNo = fNo;
		this.view = view;
		checkIn = chIn;
		checkOut = chOut;
	}
	
	public abstract double calculatePrice();
	
	public int duration() {
		return checkOut - checkIn;
	}
	
	public String toString() {
		String s = "Room Number: " + RoomNo +"\n Floor Number: " + floorNo ;
		s += "\n View: " + view + "\n Number of Days: " + duration();
		return s;
	}
	
	
	

}



