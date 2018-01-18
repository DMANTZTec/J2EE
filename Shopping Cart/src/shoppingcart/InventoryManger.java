package shoppingcart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;

import testcases.*;

public class InventoryManger {
	
	Scanner s = new Scanner (System.in);
	
	
	public void CreateItems() throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Home\\ShoppingCart\\Create_Items.txt"));
	    String line = null;

	    String II,IN,IP,IC,IS,IQ;
	    int J = 1;
	    while ((line = br.readLine()) != null) {  	
	    	System.out.println(line);
	    	J++;
	    	StringTokenizer tokenizer = new StringTokenizer(line, ",");
	    	
		    	II = tokenizer.nextToken();
		    	IN = tokenizer.nextToken();
		    	IP = tokenizer.nextToken();
		    	IC = tokenizer.nextToken();
		    	IS = tokenizer.nextToken();
		    	IQ = tokenizer.nextToken();
		    
	    	while (tokenizer.hasMoreTokens())
	    	{
	    		System.out.println(tokenizer.nextToken());
	    		tokenizer.nextToken();
	    	}
		
		try{
			   
			   String sql,insert;
			   insert = "Insert into inventory (ID,Name,Price,Category,Subcategory,Quantity) values(?,?,?,?,?,?)";
			      
			   PreparedStatement p = testcases.InventoryMangerTest.conn.prepareStatement(insert);
			     
			   p.setString(1,II);
			   p.setString(2,IN);
			   p.setString(3,IP);
			   p.setString(4,IC);
			   p.setString(5,IS);
			   p.setString(6,IQ);
			     
			   sql = "SELECT * FROM inventory";
			   p.executeUpdate();
			   ResultSet rs = testcases.InventoryMangerTest.stmt.executeQuery(sql);
			   
			   Item i = new Item(II,IN,IP,IC,IS,IQ);
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
	
	public void DeleteItem() throws SQLException {
		
		System.out.println("Enter the Item ID to delete : ");  
		String II = s.nextLine();
		
		String delete ;
		delete = "DELETE FROM inventory WHERE ID = ? ";
		PreparedStatement p = testcases.InventoryMangerTest.conn.prepareStatement(delete);
		
		p.setString(1,II);
		
		p.executeUpdate();
	    p.close();
		
	}
	
	public void UpdateItems() throws SQLException {
			
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
		
	    PreparedStatement p = testcases.InventoryMangerTest.conn.prepareStatement(update);
		
		p.setInt(1,I);
		p.setString(2,II);
		
		p.executeUpdate();
	    p.close();
		
	}
	
	public void ViewItems() {
		
		try
		{
			String view = "SELECT * FROM inventory";
			
			System.out.println("  ID  " +"   ITEM");
			
			ResultSet rs = testcases.InventoryMangerTest.stmt.executeQuery(view);
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
