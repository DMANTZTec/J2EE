package shoppingcart;

import java.sql.*;
import java.util.*;

import testcases.*;

public class InventoryManger {
	
	static Scanner s = new Scanner (System.in);
	
	String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static String DB_URL = "jdbc:mysql://localhost:3306/test";
	static String USER = "pooja";
	static String PASS = "pooja";
	   
	public static Connection conn = null;
	public static Statement stmt = null;
	
		public static void main(String[] args) throws Exception {
			  
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection(DB_URL,USER,PASS);
	   	    System.out.println("Creating statement...");
		    stmt = conn.createStatement();
		    int sw = 0;
		    while(sw != 5)
		    {
		    	System.out.println("\n1.View Items\n2.Create Items\n3.Update Items\n4.Delete Items\n5.exit");
			    sw = s.nextInt();
			    switch(sw)
			    {
			    case 1 : ViewItems VI = new ViewItems();
			    		 VI.test();
			    		 break;
			    case 2 : CreateItem CI = new CreateItem();
			    		 CI.test();
			    		 break;
			    case 3 : UpdateItem UI = new UpdateItem();
			    		 UI.test();
			    		 break;
			    case 4 : DeleteItem DI = new DeleteItem();
			    		 DI.test();
			    		 break;
			    }
		    }
		    
			stmt.close();
		    conn.close();
		}

}
