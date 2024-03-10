package project113;

public class Regular extends Room{

	private int nOfBeds;

	public Regular(int rNo, int fNo) {
		super(rNo, fNo);
	}

	public Regular(int rNo, int fNo, boolean view, int nOfBeds) {
		super(rNo, fNo);
		this.view = view;
		this.nOfBeds = nOfBeds;
	}
	@Override
	public double calculatePrice() {
		double p = (50 * nOfBeds) + Price; //it depends on number of beds he wants in a room
		if(view) {
			p += 150;
		}
		return p;

	}

	@Override
	public String toString() {
		return super.toString() + "\n nOfBeds: " + nOfBeds ;
	}





}
