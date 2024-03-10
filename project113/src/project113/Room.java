package project113;

public abstract class Room {
	
	protected int RoomNo;
	protected int floorNo;
	protected boolean Available;
	protected double Price;
	protected boolean view;
	
	public Room(int rNo, int fNo) {
		RoomNo = rNo;
		floorNo = fNo;
		Available = true;
		Price = 450 ;
	}
	
	public abstract double calculatePrice();
	
	
	
	public String toString() {
		String s = "Room Number: " + RoomNo +"\n Floor Number: " + floorNo ;
		if(view)
			s += "\n with view";
		else
			s += "whithout view";
		return s;
	}
	
	
	

}



