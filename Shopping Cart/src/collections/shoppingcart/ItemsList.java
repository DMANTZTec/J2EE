package collections.shoppingcart;

import java.util.*;

public class ItemsList {
	
	private final static List<Item> Items = new ArrayList<Item>();
	
	public ItemsList( ) {
		StoreItems();
	}
	
	public List<Item> getItems() {
		return Items;
	}
	
	public static void StoreItems() {
		
		String[] ItemName = {"Saree", "Dress" , "Shirt" ,"Pant", "girls" , "Boys"};
		Integer[] ItemID = {111,112,121,122,131,132};
		Double[] ItemPrice = {600.00d, 500.00d, 500.00d, 650.00d, 350.00d, 300.00d};
		String[] ItemCategory = {"clothing" , "clothing" , "clothing", "clothing", "clothing", "clothing"};
		String[] ItemSubcategory = {"Ladies" , "Ladies" , "Gents" , "Gents" , "Kids" , "Kids"};
		Integer[] ItemAvaliableQuantity = {10,10,10,10,10,10};
		
		for(int k = 0 ; k < ItemName.length ; k++)
		{
			Items.add(new Item(ItemName[k] , ItemID[k] , ItemPrice[k] ,  ItemCategory[k] , ItemSubcategory[k] , ItemAvaliableQuantity[k]));
		}
	}
}
