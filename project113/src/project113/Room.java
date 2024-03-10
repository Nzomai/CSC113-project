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



	@Override
	public String toString() {
		String s = "Room Number: " + RoomNo +"\n Floor Number: " + floorNo ;
		if(view) {
			s += "\n with view";
		} else {
			s += "whithout view";
		}
		s += "\n View: " + view ;
		return s;
	}

	public int getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}

	public boolean getAvailable() {
		return Available;
	}

	public void setAvailable(boolean available) {
		Available = available;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}




}



