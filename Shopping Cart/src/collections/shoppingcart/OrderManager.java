package collections.shoppingcart;

import java.util.*;

public class OrderManager {
		
	Order order = new Order();
    private static int ch = 0;
    
    private static int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }
    
    static void ViewItems() {
    	
    	List<Item> ItemsList = new ItemsList().getItems(); 
		for(Item i : ItemsList) {
		    System.out.print(i.getItemID() + "  - " );
		    System.out.print(i.getItemName() + " ");
		    System.out.print(i.getItemPrice() + " ");
		    System.out.print(i.getItemCategory() + " "); 
		    System.out.print(i.getItemSubcategory() + " ");
		    System.out.println(i.getItemAvaliableQuantity());
		}
    }
                            
		 private static void AddItemToCart() {
		        int ItemID = getUserInput();
		       Order.AddItemByItemID(ItemID);      
		    }

		    private static void showCart() {
		        Order.PrintCartItems();
		    }

		    private static void DeleteItemFromCart() {
		        int ItemID = getUserInput();
		        Order.DeleteItemFromCartByItemID(ItemID);
		    }
    
    public static void main (String [] args) {
            
            ViewItems();
            {
            	System.out.print("how many items you want to add cart ");
            	int k = getUserInput();
            	for(int j = 0 ; j < k ; j++)
            	{
            		AddItemToCart();
            	}
            	showCart();
            	System.out.println("do you want delete items");
            	int i = getUserInput(); 
            	if(i == 1 )
            	{
            		DeleteItemFromCart();
            		showCart();
            	}
            
            }
    }



}
