package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws Exception 
	{
		Properties prop=loadPropertiesFile();
		String d=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String user=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		
		Class.forName(d);
		Connection con=null;
 	con=DriverManager.getConnection(url,user,pass);
		return con;
		
	}
	public static Properties loadPropertiesFile() throws Exception
	{
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
		
	}
	
}
