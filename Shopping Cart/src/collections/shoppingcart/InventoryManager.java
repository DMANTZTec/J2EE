package collections.shoppingcart;

import java.util.*;

public class InventoryManager {
	
	static List<Item> Item = new ArrayList<Item>();
	static Scanner s = new Scanner (System.in);
	
	static void ViewItems()
	{
		OrderManager.ViewItems();
	}
	
	@SuppressWarnings({ "unused", "resource" })
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
		
		int ItemID = s.nextInt();
		Item item = Order.GetItemByItemID(ItemID);
		Item.add(item);
		
		
	}
	
	static void DeleteItems()
	{
		
	}
	
	public static void main(String[] args) {
		  
		
		ViewItems();
		CreateItems();
		UpdateItems(); 
		DeleteItems();
	}


}
