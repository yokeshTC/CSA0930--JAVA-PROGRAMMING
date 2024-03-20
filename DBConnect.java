import java.sql.*;

class DBConnect
{
	Statement s;
	Connection c;
	DBConnect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost/mnm","root","root"); 
			s=c.createStatement();
			
			s.execute("INSERT into Program(name,lastname,city) VALUES ('Yokesh','TC','Vellore')");
			System.out.println("Table created");
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String args[])
	{
		DBConnect x=new DBConnect();
	}
}
