package project113;

public class Suite extends Room{
	
	private char type;

	public Suite(int rNo, int fNo, boolean view, int chIn, int chOut, char type) {
		super(rNo, fNo, view, chIn, chOut);
		this.type = type;
	}
	
	public Suite(Suite s) {
		super(s.RoomNo , s.floorNo , s.view , s.checkIn , s.checkOut);
		type = s.type;
	}

	@Override
	public double calculatePrice() {
		double p = 0 ;
		switch(type) {
		case 'S' : case 's':
			p = 6500 * duration();
			break;
		case 'J' : case 'j':
			p = 4500 * duration();
			break;
		case 'D' : case 'd':
			p = 3000 * duration();
			break;
		}
		if(view == true)
			p += 500;
		return p;
	}

	@Override
	public String toString() {
		return super.toString() + "\n type: " + type ;
	}
	
	
	
	

}
