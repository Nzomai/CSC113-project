package project113;

public class Hotel {
private String hName;
private String Adress;
private int nOfRooms;
public Room [] LisOfRooms;



public Hotel(String hName, String adress) {
	this.hName = hName;
	Adress = adress;
	nOfRooms = 0;
	LisOfRooms = new Room [100];
	}
	
	public Suite[] DisplayAvailableSuite() {
		Suite SuiteList [] = new Suite [nOfRooms];
		 int s = 0;
		 for (int i = 0 ; i<nOfRooms ; i++)
			 if (LisOfRooms [i] instanceof Suite) {
				 SuiteList [s] = new Suite ((Suite) LisOfRooms [i]);
				 s++;
			 }
	if (s == 0)
		return null;
		else			
		 return SuiteList;
		 
		
	}
	
	
	public Single[] DisplayAvailableSingle() {
		Single SingleList [] = new Single [nOfRooms];
		 int a = 0;
		 for (int i = 0 ; i<nOfRooms ; i++)
			 if (LisOfRooms [i] instanceof Single) {
				 SingleList [a] = new Single ((Single) LisOfRooms [i]);
				 a++;
			 }
	if (a == 0)
		return null;
		else			
		 return SingleList;
		 
		
	}
	
	public boolean addRoom (Room R) {
		if (this.nOfRooms<LisOfRooms.length )
		{
		if (R instanceof Suite)
			LisOfRooms [nOfRooms++] = new Suite ((Suite) R);
		else
			if (R instanceof Single)
				LisOfRooms [nOfRooms++] = new Single ((Single) R);
			return true;
		}
		return false;
	}	
			
			
			
	public boolean findAvailableRoom (int NRoom) {
		for (int i = 0 ; i<nOfRooms ; i++)
			if (LisOfRooms [i].getRoomNo() == NRoom && LisOfRooms[i].isAvailable() )
				return true;
		return false;
		
		
		
		
	}
	
	public String toString () {
		
		String str = "Hotel Name is = " + this.hName + "Number of Rooms =" +this.nOfRooms +"Adress = "+this.Adress +"\n";
		str+= "============================\n";
		for (int i = 0 ; i<nOfRooms ; i++) 
			str += LisOfRooms [i].toString() + "\n";
			
			return str;
		}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public int getnOfRooms() {
		return nOfRooms;
	}

	public void setnOfRooms(int nOfRooms) {
		this.nOfRooms = nOfRooms;
	}

	public Room[] getLisOfRooms() {
		return LisOfRooms;
	}

	public void setLisOfRooms(Room[] lisOfRooms) {
		LisOfRooms = lisOfRooms;
	}
	}
		
	

