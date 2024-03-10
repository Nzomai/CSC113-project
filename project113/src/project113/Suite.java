package project113;

public class Suite extends Room{

	private char type;

	public Suite(int rNo, int fNo) {
		super(rNo, fNo);
	}

	public Suite(int rNo, int fNo, boolean view, int chIn, int chOut, char type) {
		super(rNo, fNo);
		this.type = type;
	}

	

	public Suite(Suite suite) {
    super (suite.RoomNo , suite.floorNo);
    type = suite.type;
    
	
	}

	@Override
	public double calculatePrice() {
		double p = 0 ;
		switch(type) {
		case 'S' : case 's':  //Superior Suite
			p = Price + 2000;
			break;
		case 'J' : case 'j':  //Junior Suite
			p = Price + 1500;
			break;
		case 'D' : case 'd':  //Deluxe Suite
			p = Price + 1000;
			break;
		}
		if(view) {
			p += 500;
		}
		return p;
	}

	@Override
	public String toString() {
		return super.toString() + "\n type: " + type ;
	}





}
