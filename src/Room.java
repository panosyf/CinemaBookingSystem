import java.util.ArrayList;
public abstract class Room 
{
	private String password;
	private String description;
	private int rows;
	private int columns;
	
	Room(String password, String description, int rows, int columns)
	{
		this.setPassword(password);
		this.setDescription(description);
		this.setRows(rows);
		this.setColumns(columns);
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public void setDescription(String description) 
	{
		this.description=description;
	}
	public String getDescription()
	{
		return this.description;
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
	
	
	public String toString()
	{
		String ret = new String("Description: " + description + "\n" + "Rows: " + rows + "\n" + "Columns: " + columns + "\n");
		return ret;
	}
}
