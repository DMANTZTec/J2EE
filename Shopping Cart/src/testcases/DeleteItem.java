package testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class DeleteItem {
	
	Scanner s = new Scanner (System.in);

	@Test
	public void test() throws SQLException {
		
		System.out.println("Enter the Item ID to delete : ");  
		String II = s.nextLine();
		
		String delete ;
		delete = "DELETE FROM inventory WHERE ID = ? ";
		PreparedStatement p = shoppingcart.InventoryManger.conn.prepareStatement(delete);
		
		p.setString(1,II);
		
		p.executeUpdate();
	    p.close();
		
	}

}
