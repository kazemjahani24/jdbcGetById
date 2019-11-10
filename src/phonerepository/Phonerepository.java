package phonerepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import dbutil.Dbutil;
import phone.Phone;


//when i want to get the phone by id, do i have to create a list method and object or only simple objectg, because im only getting one 
public class Phonerepository {
	
	public static Phone getPhoneById(int id) {
	
		 Phone phone  = new Phone(); 
		 
		 try {
			 
			 Connection con = Dbutil.getConnection();


			 PreparedStatement statement = con.prepareStatement("select * from phone where id = ?");
			
			 statement.setInt(1,id);
			 
			 ResultSet rs  = statement.executeQuery();
			 
			 
			 if (rs !=  null) {
				 
				 if(rs.next()) {
					 
						phone.setId(rs.getInt(1));
						phone.setOwner(rs.getString(2));
						phone.setModel(rs.getString(3));
						phone.setColor(rs.getString(4));
				 }
			 }	 
	}
		 
		 catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			return phone; 
		 }	 
}
