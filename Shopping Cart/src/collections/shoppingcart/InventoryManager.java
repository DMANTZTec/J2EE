package collections.shoppingcart;

import java.io.*;
import java.sql.* ;
import java.util.*;

public class InventoryManager {
	

   
    
	static List<Item> Item = new ArrayList<Item>();
	static Scanner s = new Scanner (System.in);
	
	static void ViewItems()
	{
		OrderManager.ViewItems();
	}
	
	static void CreateItems() throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Home\\Documents\\items_test.txt"));
	    String line = null;

	    int i = 0;
	    while ((line = br.readLine()) != null) {  	
	    	System.out.println(line);
	    	System.out.println("Line Number : " + i);
	    	StringTokenizer tokenizer = new StringTokenizer(line, ",");
	    	while(i>=1 && tokenizer.hasMoreTokens() )
	    	{
		    	System.out.println("ItemID = " + tokenizer.nextToken());
		    	System.out.println("ItemName = " + tokenizer.nextToken());
		    	System.out.println("ItemDescription = " + tokenizer.nextToken());
		    	System.out.println("ItemPrice = " + tokenizer.nextToken());
		    	System.out.println("ItemSubcategory = " + tokenizer.nextToken());
		    	System.out.println("ItemCategory = " + tokenizer.nextToken());
		    }
	    }
	    br.close();
	}
	
	static void UpdateItems()
	{
		System.out.println("1.Update Item Price");
		System.out.println("2.Update Item Avaliable Quantity");
		int c = s.nextInt(); 
		switch(c) 
		{
		case 1 : UpdatePrice();
		case 2 : UpdateItemQuantity();
		}
	}
	
	static void UpdateItemQuantity() {
		
		  
		
	}

	static void UpdatePrice(){
		
		System.out.println("enter the ID");
		int ItemID = s.nextInt();
		System.out.println("enter the item price");
		Item item = Order.GetItemByItemID(ItemID);
		Item.add(item);
		
		
	}
	
	static void DeleteItems()
	{
		
	}
	
	static void DeleteItemFromFile(String inputFile,String itemNumber,String outputFile)
	{
        File inFile = new File(inputFile);
        
        //Construct the new file that will later be renamed to the original filename. 
        File outFile = new File(outputFile);

    try {  
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        PrintWriter pw = new PrintWriter(new FileWriter(outFile));

        String line = null;
        
       while ((line = br.readLine()) != null) {
          if (!line.trim().contains(itemNumber)) {
            pw.println(line);
            pw.flush();
          }
        }
       br.close();
       pw.close();
	} catch (Exception ex) {
        ex.printStackTrace();
      }
     
        
	}
	
	public static void main(String[] args) {
		  
		
		ViewItems();
		
		DeleteItems(); 
	
		
	}


}
