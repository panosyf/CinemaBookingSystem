import java.util.ArrayList;
public class Movie 
{
	private String password;
	private String title;
	private int productiondate;
	private double duration;
	ArrayList Actors = new ArrayList();
	
	Movie(String password, String title, int productiondate, ArrayList Actors, double duration)
	{
		this.setPassword(password);
		this.setTitle(title);
		this.setProductionDate(productiondate);
		this.setActors(Actors);
		this.setDuration(duration);
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return this.title;
	}
	
	public void setProductionDate(int productiondate)
	{
		this.productiondate=productiondate;
	}
	public int getProductionDate()
	{
		return this.productiondate;
	}
	
	public void setActors(ArrayList Actors)
	{
		this.Actors=Actors;
	}
	public ArrayList getActors()
	{
		return this.Actors;
	}
	
	public void setDuration(double duration)
	{
		this.duration=duration;
	}
	public double getDuration()
	{
		return this.duration;
	}
	
	
	public String toString()
	{
		return "Title: " + title + "\n" + "Production Date: " + productiondate + "\n" + "Actors: " + Actors + "\n" + "Duration: " + duration + "\n";
		
	}
}
