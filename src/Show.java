import java.util.ArrayList;
public class Show 
{

	private Movie Movie;
	private String Calendar;
	private Room Room;
    private String[][] Seats;
	private int rows;
	private int columns;
	private int totalseats;
	private int occseats;
	
	Show(Movie Movie, String Calendar, Room Room, String[][] Seats,int totalseats,int occseats)
	{
		this.setMovie(Movie);
		this.setCalendar(Calendar);
		this.setRoom(Room);
		this.setRows(rows);
		this.setColumns(columns);
		this.setSeat(Seats);
		this.setTotalSeats(totalseats);
		this.setOccSeats(occseats);
	}

	private void setMovie(Movie Movie)
	{
		this.Movie=Movie;
	}
	public Movie getMovie()
	{
		return this.Movie;
	}
	
	private void setCalendar(String Calendar)
	{
		this.Calendar=Calendar;
	}
	public String getCalendar()
	{
		return this.Calendar;
	}
	
	private void setRoom(Room Room) 
	{
		this.Room=Room;
	}
	
	public Room getRoom()
	{
		return this.Room;
	}
	
	private void setSeat(String[][] Seats) 
	{
		this.Seats=Seats;
	}
	
	public String[][] getSeats()
	{
		return this.Seats;
	}

	public void setRows(int rows)
	{
		this.rows=rows;
	}
	public int getRows()
	{
		return this.rows;
	}
	
	public void setColumns(int columns)
	{
		this.columns=columns;
	}
	public int getColumns()
	{
		return this.columns;
	}
	
	public void setTotalSeats(int totalseats)
	{
		this.totalseats=totalseats;
	}
	public int getTotalSeats()
	{
		return this.totalseats;
	}
	
	public void setOccSeats(int occseats)
	{
		this.occseats=occseats;
	}
	public int getOccSeats()
	{
		return this.occseats;
	}

	
	public String toString()
	{
		return "Movie: " + Movie.toString() + "\n" + "Premiere Date: " + Calendar + "\n" + "Cinema Room: " + Room.toString() + "\n" +
				"Total Seats: "+ totalseats +"\n" + "Occupied Seats: " + occseats + "\n";

	}
}
