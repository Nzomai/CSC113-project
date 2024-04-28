package project113;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner ;
public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		Hotel h = new Hotel( "Hilton" ," Riyadh" , 50 ) ;
		
		// adding rooms to list of rooms in hotel:

		// Adding Suite:
		h.addRoom( new Suite( 1 , 1 , true , 600 , 'd' ) )  ;
		h.addRoom( new Suite( 2 , 1 , false , 600 , 's' ) )  ;
		h.addRoom( new Suite( 3 , 1 , false , 600 , 'j' ) )  ;
		h.addRoom( new Suite( 1 , 1 , true , 600 , 'D' ) )  ;
		h.addRoom( new Suite( 2 , 1 , false , 600 , 'S' ) )  ;
		h.addRoom( new Suite( 3 , 1 , false , 600 , 'J' ) )  ;
		h.addRoom( new Suite( 4 , 1 , true , 600 , 'S' ) )  ;
		h.addRoom( new Suite( 5 , 1 , true , 600 , 'j' ) )  ;
		h.addRoom( new Suite( 6 , 1 , false , 600 , 'd' ) )  ;
		h.addRoom( new Suite( 5 , 1 , true , 600 , 'J' ) )  ;
		h.addRoom( new Suite( 6 , 1 , false , 600 , 'D' ) )  ;

		//Adding Regular:
		h.addRoom( new Regular( 7 , 2 , true , 300 , 2 ) )  ;
		h.addRoom( new Regular( 8 , 2 , true , 300 , 1 ) )  ;
		h.addRoom( new Regular( 9 , 2 , false , 300 , 3 ) )  ;
		h.addRoom( new Regular( 10 , 2 , true , 300 , 2 ) )  ;
		h.addRoom( new Regular( 11 , 2 , true , 300 , 3 ) )  ;
		h.addRoom( new Regular( 12 , 2 , false , 300 , 2 ) )  ;
		

		 System.out.println("*********** Welcome to  " + h.gethName() + " Hotel ***********") ;

		 int choice ;
		  choice = 0 ;
		 do {
			 System.out.println(" Please choose an option: ") ;
			 System.out.println(" 1- View Available Rooms ") ;
			 System.out.println(" 2- place new reservation ") ;
			 System.out.println(" 3- Find specific Reservation information ") ;
			 System.out.println(" 4- cancel reservation ") ;
			 System.out.println(" 5- exit the system ") ;
			 boolean enter = true;

			  while(enter) {
			  try {
			  choice = input.nextInt() ;
			  enter = false;
			  }catch(InputMismatchException e) { //unchecked exception
				  String str = input.next();
				  System.out.println(e.toString()+ " invalid input , try again");
			  }	}	

			  switch (choice) {

			  case 1 : 				  // displaying available rooms :
				  System.out.println("Available Rooms: \n");
				  System.out.println("************************");
                   System.out.println(" Available Suites : ") ;
 				  System.out.println("************************");
				  
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
				  System.out.println("************************");
                  System.out.println(" Available Regular Rooms : ") ;
				  System.out.println("************************");
				  
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
				break;
			  case 2 :
				  input.nextLine();

				 
				  System.out.println(" Enter your Name:") ;
				  String n = input.nextLine();
				  				  

				  System.out.println(" Enter your Id:") ;
				  int id = input.nextInt(); 

				  System.out.println(" Enter your Phone Number:") ;
				  String pn = input.next();

				  Customer c = new Customer(id , n , pn) ;
				  				 

				  System.out.println(" Please choose room number : ") ;
				  int rnum = input.nextInt() ;

				  System.out.println(" Please enter Check in day : ") ;
				  int inDay = input.nextInt() ;

				  System.out.println(" Please enter Check out day : ") ;
				  int outDay = input.nextInt() ;


				  Reservation r1 = new Reservation( inDay , outDay , h.SearchRoom(rnum) , c) ;
				
				  if(h.addReservation(r1)) 
					  System.out.println("Reservation have been placed successfully");
				  else
					  System.out.println("Can’t place reservation");




				  break ;
			  case 3:

					 System.out.println("Enter phone Number ") ;
					 String phNo = input.next();
					 Reservation Re1 = h.findReservation(phNo);

					 if(Re1 != null)
							System.out.println( Re1.toString());
					 else
						 System.out.println("There is no reservation with this phone Number ");


					break;
			  case 4:

				  try {
				  System.out.println(" Please enter room number to cancel reservation : ") ;
				  int roomNo = input.nextInt() ;

				  if ( h.CancelReservation(roomNo)) 
					  System.out.println(" Canceled Successfuly ") ;
				  else
					  System.out.println(" Can not be canceled ") ;
				  if ( ! h.CancelReservation(roomNo)) {
					  throw new ResrvationNotFound();} //checked exception (user defined exception)
				  else {
					  System.out.println("cancelled successfully");
				  }
				  }
				  catch(ResrvationNotFound r)
				  {
				  System.out.println(r.toString());
				  }




				  break ; 

			  case 5 :
				  System.out.println(" Good Bye ") ;
				break ;
				default:
					System.out.println("invalid input , Try again ");
			  }
		 } while ( choice != 5) ;
				  
		// calling saveHotel() method to write in file
		 h.saveHotel("myHotel.ser");
				  
				  
			  }
	
			 
	  
			 
		 }
