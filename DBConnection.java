import java.sql.*;
import java.util.Properties;
import java.io.*;

class DBConnection {
	//public static final String URL = "jdbc:mysql://localhost:3306/sms";
	//public static final String USERNAME = "root";
	//public static final String PASSWORD = "kaif1234";
	//public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	
	//Below command should be executed before running the program for setting the classpath
	//set classpath=.;D:\java_stuff\code\jars\mysql-connector-j-8.1.0.jar
	
    public static void main(String args[]) throws Exception {
		
		//Step-1
        Properties p = new Properties();
        //System.out.println(p);

        //Step-2
        //FileReader reader = new FileReader("databaseConfig.properties");
        FileInputStream reader = new FileInputStream("databaseConfig.properties");

        //Step-3
        p.load(reader);
        //System.out.println(p);

        String driver = p.getProperty("DRIVER_CLASS_NAME");
        String url = p.getProperty("URL");
		String username = p.getProperty("USERNAME");
		String password = p.getProperty("PASSWORD");
		
        try {
			//step-1
            Class.forName(driver);
			System.out.println("Driver loaded...");
			
			//step-2
            Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection stablished...");
            
			//step-3  
            Statement stmt = con.createStatement();
			System.out.println("Statement prepared...");
			
			//step-4
            ResultSet rs = stmt.executeQuery("select * from student");
			System.out.println("Query executed...");
            
			while (rs.next())
                System.out.println("ID: " + rs.getInt(1) 
			                     + ", Address: " + rs.getString(2) 
								 + ", Name: " + rs.getString(3) 
								 + ", Roll Number: " + rs.getInt(4));
            
			//Clossing connection after using it
			//con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
			if(con != null) {
				con.close();
			}
		}
    }
}