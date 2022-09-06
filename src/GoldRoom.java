import java.util.ArrayList;
public class GoldRoom extends Room
{

	private Menu Menu;
	GoldRoom(String password, String description, int rows, int columns, Menu Menu)
	{
		super(password, description, rows, columns);
		this.setMenu(Menu);
	}
	
	public void setMenu(Menu Menu)
	{
		this.Menu=Menu;
	}
	public Menu getMenu()
	{
		return this.Menu;
	}
	
	public String toString()
	{
		return "Type: Gold Room" + "\n" + super.toString() + Menu.toString();
	}
}
