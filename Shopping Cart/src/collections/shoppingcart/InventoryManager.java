package collections.shoppingcart;


import java.sql.* ;
import java.util.*;

public class InventoryManager {
	

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_cart", "root", "");
    Statement stmt = connection.createStatement();
    
	static List<Item> Item = new ArrayList<Item>();
	static Scanner s = new Scanner (System.in);
	
	static void ViewItems()
	{
		OrderManager.ViewItems();
	}
	
	static void CreateItems()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the Item Name :"); 
		String ItemName = s.nextLine(); 
		ItemsList.StoreItems().ItemName.add(ItemName);
		System.out.println("Enter the Item ID :");
		Integer ItemID = s.nextInt();
		ItemsList.StoreItems().ItemID.add(ItemID);
		System.out.println("Enter the Item Price :");
		Double ItemPrice = s.nextDouble();
		ItemsList.StoreItems().ItemPrice.add(ItemPrice);
		System.out.println("Enter the Item Category :");
		String ItemCategory = s.nextLine();   
		ItemsList.StoreItems().ItemCategory.add(ItemCategory);
		System.out.println("Enter the Item Subcategory :");
		String ItemSubcategory = s.nextLine();
		ItemsList.StoreItems().ItemSubcategory.add(ItemSubcategory);
		System.out.println("Enter the Item Quantity :");
		Integer ItemAvaliableQuantity = s.nextInt();
		ItemsList.StoreItems().ItemAvaliableQuantity.add(ItemAvaliableQuantity);
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
		String sql = "DELETE FROM my_table WHERE col_string='a string'";
	    int deleteCount = stmt.executeUpdate(sql);
	    sql = "DELETE FROM my_table WHERE col_string=?";
	    PreparedStatement pstmt = connection.prepareStatement(sql);
	    pstmt.setString(1, "a string");
	    deleteCount = pstmt.executeUpdate();
	}
	
	public static void main(String[] args) {
		  
		
		ViewItems();
		
		UpdateItems(); 
		ViewItems();
		
	}


}
