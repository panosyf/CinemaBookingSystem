import java.util.ArrayList;
public class Menu 
{
	private String password;
	ArrayList Appetizers = new ArrayList();
	ArrayList MainDishes = new ArrayList();
	ArrayList Desserts = new ArrayList();
	ArrayList Drinks = new ArrayList();
	
	Menu(String password, ArrayList Appetizers, ArrayList Maindishes, ArrayList Desserts, ArrayList Drinks)
	{
		this.setPassword(password);
		this.setAppetizers(Appetizers);
		this.setMainDishes(MainDishes);
		this.setDesserts(Desserts);
		this.setDrinks(Drinks);
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public void setAppetizers(ArrayList Appetizer)
	{
		this.Appetizers=Appetizer;
	}
	public ArrayList getAppetizers()
	{
		return this.Appetizers;
	}
	
	public void setMainDishes(ArrayList MainDishes)
	{
		this.MainDishes=MainDishes;
	}
	public ArrayList getMainDishes()
	{
		return this.MainDishes;
	}
	
	public void setDesserts(ArrayList Desserts)
	{
		this.Desserts=Desserts;
	}
	public ArrayList getDesserts()
	{
		return this.Desserts;
	}
	
	public void setDrinks(ArrayList Drinks)
	{
		this.Drinks=Drinks;
	}
	public ArrayList getDrinks()
	{
		return this.Drinks;
	}
	
	
	public String toString()
	{
		return "Menu" + "\n" + "Appetizers: " + Appetizers + "\n" + "Main Dishes: " + MainDishes + "\n" + "Desserts: " + Desserts + "\n" + "Drinks: " + Drinks + "\n";
		
	}
}
