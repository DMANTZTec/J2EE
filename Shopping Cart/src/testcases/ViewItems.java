package testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

public class ViewItems {

	@Test
	public
	void test() {
		
		try
		{
			String view = "SELECT * FROM inventory";
			
			System.out.println("  ID  " +"   ITEM");
			
			ResultSet rs = shoppingcart.InventoryManger.stmt.executeQuery(view);
            while (rs.next())
            {
                System.out.print( rs.getString(1)+ "  ");
                System.out.println( rs.getString(2)+ "  ");
                                
            }
           
		}
		catch(Exception e)
		{
			System.out.println("Exception!");
			e.printStackTrace();
		}
		
		
		
	}

}
