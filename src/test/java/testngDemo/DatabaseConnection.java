package testngDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseConnection
{
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		WebDriver driver=new ChromeDriver();
		String dburl="jdbc:mysql://localhost:5566";
		String username="root";
		String password="root";
		String query="Select username from login";
		Class.forName("com.mysql.jdbc.driver");
		Connection con=DriverManager.getConnection(dburl,username,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		rs.next();
		{
			String name=rs.getString("name");
			String rollno=rs.getString("rollno");
			String sal=rs.getString("sal");
			System.out.println(name);
			System.out.println(rollno);
			System.out.println(sal);
			con.close();
			
		}
	}

}
