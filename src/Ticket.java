import java.util.Date;
import java.util.ArrayList;
public class Ticket 
{
	private String password;
	private Show Show;
	private String printdate;
	private String tickettype;
	private String appetizer;
	private String maindiss;
	private String dessert;
	private String drink;
	
	Ticket(String password, Show Show, String string, String tickettype, String appetizer, String maindiss, String dessert, String drink)
	{
		this.setPassword(password);
		this.setShow(Show);
		this.setPrintDate(string);
		this.setTicketType(tickettype);
		this.setAppetizer(appetizer);
		this.setMainDiss(maindiss);
		this.setDessert(dessert);
		this.setDrink(drink);
	}


	private void setPassword(String password)
	{
		this.password=password;	
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	private void setShow(Show Show) 
	{
		this.Show=Show;
	}
	
	public Show Show()
	{
		return this.Show;
	}

	private void setPrintDate(String printdate)
	{
		this.printdate=printdate;
	}

	public String getPrintDate()
	{
		return this.printdate;
	}

	private void setTicketType(String tickettype)
	{
		this.tickettype=tickettype;
	}
	
	public String getTicketType()
	{
		return this.tickettype;
	}

	void setAppetizer(String appetizer) 
	{
		this.appetizer=appetizer;
	}
	
	public String getAppetizer()
	{
		return this.appetizer;
	}

	void setMainDiss(String maindiss) 
	{
		this.maindiss=maindiss;
	}

	public String getMainDiss()
	{
		return this.maindiss;
	}

	void setDessert(String dessert) 
	{
		this.dessert=dessert;
	}

	public String getDessert()
	{
		return this.dessert;
	}

	void setDrink(String drink) 
	{	
		this.drink=drink;
	}

	public String getDrink()
	{
		return this.drink;
	}
	
	
	
}
