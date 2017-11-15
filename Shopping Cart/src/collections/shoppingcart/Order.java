package collections.shoppingcart;

import java.util.*;

public class Order {

	static Scanner s = new Scanner(System.in);
	static int n;
	static List<Item> order = new ArrayList<Item>();
	
	public static void AddItemByItemID(int ItemID) {
		Item item = GetItemByItemID(ItemID);
		order.add(item);
		Quantity(ItemID);
	}
	
	static int Quantity(int ItemID){
		Item item = GetItemByItemID(ItemID);
		System.out.print("Enter Item quantity : ");
		n = s.nextInt();
			int m = item.getItemAvaliableQuantity();

			 if(m<n)
			 {
				 System.out.println("Quantity is not available. please choose upto "+m);
				 Quantity(ItemID);
			 }
			 return n;
	}
	
	static void DeleteItemFromCartByItemID(int ItemID) {
		Item item = GetItemByItemID(ItemID);
		order.remove(item);
	}
	
	static Item GetItemByItemID(int ItemID) {
		Item item = null ;
		List<Item> ItemsList = new ItemsList().getItems(); 
		for(Item i : ItemsList) {
			if(i.getItemID() == ItemID) {
				item = i;
				break;
			}
		}
		return item;
	}
	
	
	static void PrintCartItems() {
		for(Item i : order) {
			System.out.print(i.getItemID() + " ");
			System.out.print(i.getItemName() + " ");
			System.out.println(i.getItemQuantity());
		}
	}	
}