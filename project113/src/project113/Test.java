package project113;

import java.util.Scanner ;
public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		Hotel h = new Hotel( "Hilton" ," Riyadh" , 50 ) ;
		
		// adding rooms to list of rooms in hotel:
		
		// First floor rooms:
		h.addRoom( new Regular( 1 , 1 , true , 300 , 2 ) )  ;
		h.addRoom( new Regular( 2 , 1 , true , 300 , 3 ) )  ;
		h.addRoom( new Regular( 3 , 1 , false , 300 , 2 ) )  ;
		h.addRoom( new Suite( 4 , 1 , true , 600 , 'S' ) )  ;
		h.addRoom( new Suite( 5 , 1 , true , 600 , 'j' ) )  ;
		h.addRoom( new Suite( 6 , 1 , false , 600 , 'd' ) )  ;
		
		// Second floor rooms:
		h.addRoom( new Regular( 7 , 2 , true , 300 , 2 ) )  ;
		h.addRoom( new Regular( 8 , 2 , true , 300 , 1 ) )  ;
		h.addRoom( new Regular( 9 , 2 , false , 300 , 3 ) )  ;
		h.addRoom( new Suite( 10 , 2 , true , 600 , 'd' ) )  ;
		h.addRoom( new Suite( 11 , 2 , false , 600 , 's' ) )  ;
		h.addRoom( new Suite( 12 , 2 , false , 600 , 'j' ) )  ;
		
		 System.out.println(" Welcome to  " + h.gethName() + " Hotel") ;
		
		 
		 System.out.println(" Enter your Name:") ;
		  String n = input.nextLine();
		  
		  
		  
		  System.out.println(" Enter your Id:") ;
		  int id = input.nextInt(); 
		  
		  System.out.println(" Enter your Phone Number:") ;
		  String pn = input.next();
		   
		  Customer c = new Customer(id , n , pn) ;
		
		
		 int choice ;
		 do {
			 System.out.println(" Please choose an option: ") ;
			 System.out.println(" 1- place new reservation ") ;
			 System.out.println(" 2- cancel reservation ") ;
			 System.out.println(" 3- display current reservation details ") ;
			 System.out.println(" 4- exit the system ") ;
			  choice = input.nextInt() ;
			  
			  switch (choice) {
			  
			  case 1 :
				  // displaying available rooms :
				  System.out.println(" Available Suites : ") ;
				  
				  Suite [] avSuite = h.DisplayAvailableSuite() ;
				  if ( avSuite != null) 
				  {
					  for (int i = 0 ; i < avSuite.length ; i++)
						  if (avSuite[i] != null)
						  {
						  System.out.println ( avSuite[i].toString() ) ;
					      System.out.println ("======================" ) ;
						  }
				  }
				  
                  System.out.println(" Available Regular Rooms : ") ;
				  
				  Regular [] avRegular = h.DisplayAvailableRgular() ;
				  if ( avRegular != null) 
				  {
					  for (int i = 0 ; i < avRegular.length ; i++)
						  if (avRegular[i] != null)
						  {
						  System.out.println ( avRegular[i].toString() ) ;
						  System.out.println ("======================" ) ;
						  }
				  }
				
				  System.out.println(" Please choose room number : ") ;
				  int rnum = input.nextInt() ;
				  
				  System.out.println(" Please enter Check in day : ") ;
				  int inDay = input.nextInt() ;
				  
				  System.out.println(" Please enter Check out day : ") ;
				  int outDay = input.nextInt() ;

				  
				  Reservation r1 = new Reservation( inDay , outDay , h.SearchRoom(rnum) , c) ;
				  h.AddReservation(r1) ;
				  
				  
				  break ;
				  
			  case 2:
				  
				  System.out.println(" Please choose room number to cancel reservation : ") ;
				  int roomNo = input.nextInt() ;
				  
				  if ( h.CancelReservation(roomNo)) 
					  System.out.println(" Canceled Successfuly ") ;
				  else
					  System.out.println(" Can not be canceled ") ;
				  
				  break ; 
				  
			  case 3 :
				  Reservation[] rList = h.LisOfReservations ;
				  rList[h.getnOfReservations() - 1].toString() ;
				  
			  break ;	 
			  
			  case 4 :
				  System.out.println(" Good Bye ") ;
				break ; 
			  }
		 } while ( choice != 4) ;
				  
			
				  



				  
			  }
			 
	 
				 
			 
			 
		 }


