import java.util.ArrayList;
public class StandardRoom extends Room
{

	StandardRoom(String password, String description, int rows, int columns)
	{
		super(password, description, rows, columns);
	}
	
	public String toString()
	{
		return "Type: Standard Room" + "\n" + super.toString();
	}
}
