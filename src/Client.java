import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
public class Client 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int choice,choice2,i,j,k;
		boolean x;
		String password,appetizer,maindiss,dessert,drink;
		
		String description;
		int rows,columns;
		String title,actors;
		int productiondate;
		double duration;
		int posMenu,posMovie,posRoom,posShow;
	
		
		
		ArrayList Menu = new ArrayList();
		ArrayList<Room> Room = new ArrayList<Room>();
		ArrayList Movie = new ArrayList();
		ArrayList Show = new ArrayList();
		ArrayList Ticket = new ArrayList();
		
		
		String menu = new String("[1] Insert Menu\n"
				+ "[2] Insert Room (Standard or Gold)\n"
				+ "[3] Insert Movie\n[4] Insert Show\n"
				+ "[5] Book Ticket\n"
				+ "[6] Cancel Ticket\n"
				+ "[7] Order Menu Items (Available only in Gold Rooms)\n"
				+ "[8] Room Capacity for a certain Show\n"
				+ "[0] Exit\n\n");
		
		do{
			System.out.println(menu);
			System.out.printf("Your answer: ");
			choice = input.nextInt();
			System.out.println();
		
			if(choice==1)
			{
				System.out.printf("\nGive Password: ");
				password = input.next();
				
				ArrayList Appetizers = new ArrayList();
				ArrayList MainDishes = new ArrayList();
				ArrayList Desserts = new ArrayList();
				ArrayList Drinks = new ArrayList();
				
				
				do{
					
					System.out.printf("Give Appetizer, type 'end' to stop: ");
					appetizer = input.next();
					
					if(!(appetizer.equals("end")))
					{
						Appetizers.add(appetizer);
					}
					
				}while(!(appetizer.equals("end")));
				
				
				do{
					
					System.out.printf("Give Main Diss, type 'end' to stop: ");
					maindiss = input.next();
					
					if(!(maindiss.equals("end")))
					{
						MainDishes.add(maindiss);
					}
					
				}while(!(maindiss.equals("end")));
				
				
				do{
					
					System.out.printf("Give Dessert, type 'end' to stop: ");
					dessert = input.next();
					
					if(!(dessert.equals("end")))
					{
						Desserts.add(dessert);
					}
					
				}while(!(dessert.equals("end")));
				
				
				do{
					
					System.out.printf("Give Drink, type 'end' to stop: ");
					drink = input.next();
					
					if(!(drink.equals("end")))
					{
						Drinks.add(drink);
					}
					
				}while(!(drink.equals("end")));
				System.out.println("\n");
			
				Menu newMenu = new Menu(password,Appetizers,MainDishes,Desserts,Drinks);

				x = true;
				for(i=0; i<Menu.size(); i++)
				{
					if(newMenu.getPassword().equals((((Menu)Menu.get(i))).getPassword()))
					{
						x = false;
					}
				}
				
				if(x==true)
				{
					Menu.add(newMenu);
				}
				else
				{
					System.out.println("\nSame Password\n");
				}
				
			}
			else if(choice==2)
			{
				System.out.printf("\nChoose '1' for Standard Room or '2' for Gold Room: ");
				choice2 = input.nextInt();
				if(choice2==1)
				{
					System.out.printf("Give Password: ");
					password = input.next();
					System.out.printf("Give Room Description: ");
					description = input.next();
					System.out.printf("Give Number of rows: ");
					rows = input.nextInt();
					System.out.printf("Give Number of Columns: ");
					columns = input.nextInt();
					System.out.println("\n");
					
					StandardRoom newRoom = new StandardRoom(password,description,rows,columns);
					
					x = true;
					for(i=0; i<Room.size(); i++)
					{
						if(Room.get(i) instanceof StandardRoom)
						{
							if(newRoom.getPassword().equals((((StandardRoom)Room.get(i))).getPassword()))
							{
								x = false;
							}
						}	
					}		
							
					if(x==true)
					{
						Room.add(newRoom);
					}
					else
					{
						System.out.println("\nSame Password\n");
					}
					
				}
				else if(choice2==2)
				{
					System.out.printf("Give Password: ");
					password = input.next();
					System.out.printf("Give Room Description: ");
					description = input.next();
					System.out.printf("Give Number of rows: ");
					rows = input.nextInt();
					System.out.printf("Give Number of Columns: ");
					columns = input.nextInt();
					System.out.println("\n");
					
					System.out.println("Please choose the number of the Menu that you prefer:\n");
					
					for(i=0; i<Menu.size(); i++)
					{
						System.out.println("No: " + i);
						System.out.println((((Menu) Menu.get(i))).toString());
						System.out.println("\n");
					}
					
					System.out.printf("Menu Number: ");
					posMenu = input.nextInt();
					
					GoldRoom newRoom = new GoldRoom(password,description,rows,columns,(Menu)Menu.get(posMenu));
					x = true;
					for(i=0; i<Room.size(); i++)
					{
						if(Room.get(i) instanceof GoldRoom)
						{
							if(newRoom.getPassword().equals((((GoldRoom)Room.get(i))).getPassword()))
							{
								x = false;
							}
						}	
					}		
							
					if(x==true)
					{
						Room.add(newRoom);
					}
					else
					{
						System.out.println("\nSame Password\n");
					}
					
				}
				
			}
			else if(choice==3)
			{
				System.out.printf("Give Password: ");
				password = input.next();
				System.out.printf("Give Movie Title: ");
				title = input.next();
				System.out.printf("Give Production Date: ");
				productiondate = input.nextInt();
				
				ArrayList Actors = new ArrayList();
				do{
					
					System.out.printf("Give Actors Name, type 'end' to stop: ");
					actors = input.next();
					
					if(!(actors.equals("end")))
					{
						Actors.add(actors);
					}
					
				}while(!(actors.equals("end")));
				
				
				System.out.printf("Give Movie Duration: ");
				duration = input.nextDouble();
				System.out.println("\n");
				
				Movie newMovie = new Movie(password,title,productiondate,Actors,duration);
				
				x = true;
				for(i=0; i<Movie.size(); i++)
				{
					if(newMovie.getTitle().equals((((Movie)Movie.get(i))).getTitle()) && 
							newMovie.getProductionDate()==((((Movie)Movie.get(i))).getProductionDate()))
					{
						{
							x = false;
						}
					}	
				}		
						
				if(x==true)
				{
					Movie.add(newMovie);
				}
				else
				{
					System.out.println("\nSame Password\n");
				}
				
			}
			else if(choice==4)
			{
				System.out.println("Please choose the number of the Movie below:\n\n");
				
				for(i=0; i<Movie.size(); i++)
				{
					System.out.println("No: " + i);
					System.out.println((((Movie) Movie.get(i))).toString());
					System.out.println("\n");
	
				}
				
				System.out.printf("Movie Number: ");
				posMovie = input.nextInt();
				System.out.printf("Premiere Year: ");
				int year = input.nextInt();
				System.out.printf("Premiere Month: ");
				int month = input.nextInt();
				    month= month - 1;
				System.out.printf("Premiere Day: ");
				int day = input.nextInt();
				System.out.printf("Premiere Hour: ");
				int hour = input.nextInt();
				System.out.printf("Premiere Minute: ");
				int minute = input.nextInt();
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm");
				Calendar calendar = new GregorianCalendar(year,month,day,hour,minute);

				System.out.println("\n");
				System.out.println("Please choose the Room number below:\n");
				
				for(i=0; i<Room.size(); i++)
				{
					if(Room.get(i) instanceof StandardRoom)
					{
						System.out.println("No: " + i);
						System.out.println((((StandardRoom) Room.get(i))).toString());
						System.out.println("\n");
					}
					
					if(Room.get(i) instanceof GoldRoom)
					{
						System.out.printf("No: %d\n",i);
						System.out.println((((GoldRoom) Room.get(i))).toString());
						System.out.println("\n");
					}
					
				}
				
				
				
				System.out.printf("Room Number: ");
				posRoom = input.nextInt();
				System.out.println("\n");
				
				String[][] Seats = new String[(((Room) Room.get(posRoom))).getRows()][(((Room) Room.get(posRoom))).getColumns()];
				int totalseats = ((((Room) Room.get(posRoom))).getRows())*((((Room) Room.get(posRoom))).getColumns());
				int occseats = 0;
				
				Show newShow = new Show((Movie)Movie.get(posMovie) , sdf.format(calendar.getTime()), (Room)Room.get(posRoom), Seats, totalseats, occseats);
				
				x = true;
				for(i=0; i<Show.size(); i++)
				{
					if(newShow.getCalendar().equals((((Show)Show.get(i))).getCalendar()) && 
							newShow.getMovie().equals((((Show)Show.get(i))).getMovie()))
					{
						{
							x = false;
						}
					}	
				}		
						
				if(x==true)
				{
					Show.add(newShow);
				}
				else
				{
					System.out.println("\nSame Password\n");
				}
				
			}
			else if(choice==5)
			{
				System.out.printf("Give Password: ");
				password = input.next();
				
				System.out.println("\n");
				System.out.println("Please choose the Show number below:\n");
				
				for(k=0; k<Show.size(); k++)
				{
					System.out.println("No: " + k);
					System.out.println((((Show) Show.get(k))).toString());
					
					System.out.println("\n");
				}
				
				System.out.printf("Show Number: ");
				posShow = input.nextInt();
				
				System.out.println("Give Number of Seat[Row][Column]");
				
				System.out.printf("Row Number: ");
				int row = input.nextInt();
				
				System.out.printf("Column Number: ");
				int column = input.nextInt();
				
			    Date date = new Date();
				
				System.out.printf("Give Ticket Type('Normal' or 'Student'): ");
				String tickettype = input.next();
				
				if(tickettype.equals("Normal"))
				{
					int price = 7;
				}
				else
				{
					int price = 3;
				}
				
				appetizer = "None";
				maindiss = "None";
				dessert = "None";
				drink = "None";
					
				Ticket newTicket = new Ticket(password, (Show)Show.get(posShow), date.toString(), tickettype, appetizer, maindiss, dessert, drink);

				//Ελεγχος για εισαγωγή πίνακα Ticket//
	
				Ticket.add(newTicket);
				
			}
			else if(choice==6)
			{
				System.out.printf("Give Password: ");
				password = input.next();
				for(i=0; i<Ticket.size(); i++)
				{
					if(password.equals((((Ticket) Ticket.get(i))).getPassword()))
					{
						Ticket.remove(i);
					}
				}
			}
			else if(choice==7)
			{
				System.out.printf("Give Password: ");
				password = input.next();
				System.out.printf("Give '1' for 'Standard Room' or  '2' for Gold Room': ");
				int roomtype = input.nextInt();
				if(roomtype==2)
				{
					for(i=0; i<Ticket.size(); i++)
					{
						if(password.equals((((Ticket) Ticket.get(i))).getPassword()))
						{
							System.out.println((((Ticket) Ticket.get(i))).Show());
							System.out.println("\nChoose an Appetizer from the above: ");
							appetizer = input.next();
							System.out.println("Choose a Main Diss from the above: ");
							maindiss = input.next();
							System.out.println("Choose an Dessert from the above: ");
							dessert = input.next();
							System.out.println("Choose an Drink from the above: ");
							drink = input.next();
							
							(((Ticket) Ticket.get(i))).setAppetizer(appetizer);
							(((Ticket) Ticket.get(i))).setMainDiss(maindiss);
							(((Ticket) Ticket.get(i))).setDessert(dessert);
							(((Ticket) Ticket.get(i))).setDrink(drink);
						}
					}
				}
				else
				{
					System.out.println("Menu not available in this Room Type");
				}
			}
			else if(choice==8)
			{
		
			}
			
			
		}while(choice!=0);	
	
	}

}
