package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	String columnValue = null;
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	
	//if you have more than one username and password use:
	//List<String> dataList = new ArrayList<String>;
	
	public String getData(String columnName) throws SQLException {
		
		try {
			//setting property for MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://localhost:3306/techfios1";
			String sqlUsername = "root";
			String sqlPassword = "root";
			
			String query = "Select * from users";
			
			//create connect to local database
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			
			//empowering the connection reference variable to execute query
			statement = connection.createStatement();

			//deliver the query
			rs = statement.executeQuery(query);
			
			while(rs.next()) {
				
				columnValue = rs.getString(columnName);
			return columnValue;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if(rs != null) {
				rs.close();
			}
			if(connection != null) {
				connection.close();
			}
			
		}
		return columnValue;
		
	}

}
