package testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import shoppingcart.Item;
import shoppingcart.JSONobject;

public class CreateItem {
	
	Scanner s = new Scanner (System.in);

	@Test
	public void test() {
		
		System.out.println("Enter the Item ID : ");  
		String II = s.nextLine();
		System.out.println("Enter the Item Name : ");  
		String IN = s.nextLine();
		System.out.println("Enter the Item Price : ");  
		int IP = s.nextInt();
		System.out.println("Enter the Item Category : ");  
		String IC1 = s.nextLine();
		System.out.println("Enter the Item Category : ");  
		String IC = s.nextLine();
		System.out.println("Enter the Item Sub-Category : ");  
		String ISC = s.nextLine();
		System.out.println("Enter the Item Quantity : ");  
		int IQ = s.nextInt();
		
		try{
			   
			   String sql,insert;
			   insert = "Insert into inventory (ID,Name,Price,Category,Subcategory,Quantity) values(?,?,?,?,?,?)";
			      
			   PreparedStatement p = shoppingcart.InventoryManger.conn.prepareStatement(insert);
			     
			   p.setString(1,II);
			   p.setString(2,IN);
			   p.setInt(3,IP);
			   p.setString(4,IC);
			   p.setString(5,ISC);
			   p.setInt(6,IQ);
			     
			   sql = "SELECT * FROM inventory";
			   p.executeUpdate();
			   ResultSet rs = shoppingcart.InventoryManger.stmt.executeQuery(sql);
			   
			   Item i = new Item(II,IN,IP,IC,ISC,IQ);
	    	   String JSON = JSONobject.JavaObjtoJSON(i);
	    	   System.out.println(JSON);

		      rs.close();
		      
		}catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		
		}catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		}

		
	}

}
