package project113;

public class Single extends Room{

	private int nOfBeds;

	public Single(int rNo, int fNo, boolean view, int chIn, int chOut, int nOfBeds) {
		super(rNo, fNo, view, chIn, chOut);
		this.nOfBeds = nOfBeds;
	}

	public Single(Single s) {
		super(s.RoomNo , s.floorNo ,s.view,s.checkIn,s.checkOut);
		nOfBeds = s.nOfBeds;
	}
	@Override
	public double calculatePrice() {
		double p = 350 * nOfBeds ;
		if(view == true)
			p += 150;
		return p;
		
	}

	@Override
	public String toString() {
		return super.toString() + "\n nOfBeds: " + nOfBeds ;
	}
	
	
	
	
	
}
