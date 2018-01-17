package testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class UpdateItem {
	
	Scanner s = new Scanner (System.in);

	@Test
	public void test() throws SQLException {
		
		System.out.println("Enter the Item ID : ");  
	    String II = s.nextLine();
		
	    String update = null ;
	    
	    System.out.println("1.Price\n2.Quantity");
	    int sw = s.nextInt();
	    int I = 0;
	    switch(sw)
	    {
	    case 1 : System.out.println("Enter the updated Item price : ");  
				 int IP = s.nextInt();
				 I = IP;
				 update = "UPDATE inventory SET Price = ? WHERE ID = ? ";
	    		 break;
	    case 2 : System.out.println("Enter the updated Item Quantity : ");  
				 int IQ = s.nextInt(); 
				 I = IQ;
				 update = "UPDATE inventory SET Quantity = ? WHERE ID = ? ";
	    		 break;
	    }
		
	    PreparedStatement p = shoppingcart.InventoryManger.conn.prepareStatement(update);
		
		p.setInt(1,I);
		p.setString(2,II);
		
		p.executeUpdate();
	    p.close();
		
	}

}
