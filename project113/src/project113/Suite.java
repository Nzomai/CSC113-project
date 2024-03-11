package project113;

public class Suite extends Room{

	private char type;

	public Suite(int rNo, int fNo , boolean view , double p ,char t) {
		super(rNo, fNo , view , p );
		this.type = t ;
	}


	

	public Suite(Suite s) {
		
    super (s.RoomNo , s.floorNo , s.view , s.Price);
    type = s.type;
    
	}
	

	@Override
	public double calculatePrice() {
		
		switch(type) {
		case 'S' : case 's':  //Superior Suite
			Price = Price + 1000;
			break;
		case 'J' : case 'j':  //Junior Suite
			Price = Price + 700;
			break;
		case 'D' : case 'd':  //Deluxe Suite
			Price = Price + 500;
			break;
		}
		if(view) {
			Price += 300;
		}
		return Price;
	}

	@Override
	public String toString() {
		return super.toString() + "\n type: " + type ;
	}





}
