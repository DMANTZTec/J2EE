package collections.shoppingcart;

import java.io.*;
import java.util.Scanner;

import org.junit.Test;

public class DeletingAnItem {

	@Test
	public void testDeleteItems() {
		
		 try {

		        String inFile = "C:\\Users\\Home\\eclipse-workspace\\file\\ShoppingCart.txt";
		          
		          //Construct the new file that will later be renamed to the original filename. 
		        String outFile = "C:\\Users\\Home\\eclipse-workspace\\file\\NewShoppingCart.txt";

	          //System.out.println("Enter the item id to be deleted");
	          //Scanner s = new Scanner(System.in);
	          String lineToRemove = "4";
	          InventoryManager.DeleteItemFromFile(inFile, lineToRemove, outFile);
	        } catch (Exception ex) {
	          ex.printStackTrace();
	        }
	                
	}
}
