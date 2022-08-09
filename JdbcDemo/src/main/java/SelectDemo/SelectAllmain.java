package SelectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllmain {

	public static void main(String[] args) {
		try {
			//load the database driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Get Connection with the database
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/online_booking?useSSL=false", "root", "Rushi@12");
			/* IMP** TCP/IP connection : connection oriented protocol it means ones 
			connection between application & DB established, the connection 
			is going to remain open	and DB is accessible continuously 
			so how busy your connection going to affect the DB performance 
			IMP** So, we Need to close the connection after the use */ 
			
			//Create Statement to execute query
			Statement stmt = con.createStatement();
			
			//Execute the query and Store result of the query into ResultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
			
			//Process data from the ResultSet
			if(rs.isBeforeFirst()) {
				
				while(rs.next()) {
					System.out.println(rs.getInt("Customer_ID") + " : " + rs.getString(2) + 
							" : " + rs.getString(3) + " : " + rs.getLong(4));
				}
			}
			else
				System.out.println("No customer available");
			
			//Close the database Connection
			con.close();
		}
		catch(SQLException | ClassNotFoundException exc) {
			exc.printStackTrace();
		}

	}

}
