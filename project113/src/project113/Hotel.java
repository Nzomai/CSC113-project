package project113;

public class Hotel {
private String hName;
private String Adress;
private int nOfRooms;
private int nOfReservations;

public Room [] LisOfRooms;
public Reservation [] LisOfReservations;



public Hotel(String hName, String adress) {
this.hName = hName;
Adress = adress;
nOfRooms = 0;
nOfReservations =0;
LisOfRooms = new Room [30];
LisOfReservations = new Reservation [30];
}


public Suite[] DisplayAvailableSuite() {
Suite SuiteList [] = new Suite [nOfRooms];
int s = 0;
for (int i = 0 ; i<nOfRooms ; i++) 
	if (LisOfRooms [i] instanceof Suite && LisOfRooms [i].getAvailable() ) {
	SuiteList [s] = new Suite ((Suite) LisOfRooms [i]);
	s++;
	}

if (s == 0) 
	return null;
 else 
	return SuiteList;
}



public Regular[] DisplayAvailableSingle() {
	Regular RegleList [] = new Regular [nOfRooms];
int a = 0;
for (int i = 0 ; i<nOfRooms ; i++) 
	if (LisOfRooms [i] instanceof Regular && LisOfRooms [i].getAvailable() ) {
		RegleList [a] = new Regular ((Regular) LisOfRooms [i]);
	a++; 
	}
	

if (a == 0) 
	return null;
 
	return RegleList;
}





public boolean addRoom (Room R) {
if (this.nOfRooms<LisOfRooms.length )
{
if (R instanceof Suite) {
	LisOfRooms [nOfRooms++] = new Suite (R.getRoomNo() , R.getFloorNo());
} else
if (R instanceof Regular) {
	LisOfRooms [nOfRooms++] = new Regular (R.getRoomNo() , R.getFloorNo());
}
return true;
}
return false;
}


public int SearchRoom (int NRoom) {
	for (int i = 0 ; i<nOfRooms ; i++)
		if (LisOfRooms[i].getRoomNo() == NRoom  )
			return LisOfRooms[i].getFloorNo();
	return 0;
}

public boolean CancelReservation(int RNo) {

for(int i = 0 ; i < this.nOfReservations ; i++) {
	if (LisOfReservations[i].getReservNo() == RNo )
	{
		for(int j = 0 ; j < nOfReservations -1 ; j++)
		LisOfReservations[j] = LisOfReservations[j+1] ;
		nOfReservations-- ;
		LisOfReservations[nOfReservations] = null ;
		LisOfReservations[i].getCustomerRoom().setAvailable(true);
	return true ;
	}
}

return false ;

}






@Override
public String toString () {
String str = "Hotel Name is = " + this.hName + "Number of Rooms =" +this.nOfRooms +"Adress = "+this.Adress +"\n";
str+= "============================\n";
for (int i = 0 ; i<nOfRooms ; i++) {
	str += LisOfRooms [i].toString() + "\n";
}
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



