package collections.shoppingcart;

public class Item {
	
	private String ItemName;
	private int ItemID;
	private double ItemPrice;
	private String ItemCategory;
	private String ItemSubcategory;
	private int ItemAvaliableQuantity;
	private int ItemQuantity;
	
	
	
	public Item (String ItemName,Integer ItemID, Double ItemPrice,String ItemCategory,String ItemSubcategory,Integer ItemAvaliableQuantity) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemCategory = ItemCategory;
        this.ItemSubcategory = ItemSubcategory;
        this.ItemAvaliableQuantity = ItemAvaliableQuantity;
    }
	
	public String getItemName() {
		return ItemName;
	}
	
	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	
	public int getItemID() {
		return ItemID;
	}
	
	public void setItemName(int ItemID) {
		this.ItemID = ItemID;
	}
	
	public double getItemPrice() {
		return ItemPrice;
	}
	
	public void setItemPrice(double ItemPrice) {
		this.ItemPrice = ItemPrice;
	}
	public String getItemCategory() {
		return ItemCategory;
	}
	
	public void setItemCategory(String ItemCategory) {
		this.ItemCategory = ItemCategory;
	}
	public String getItemSubcategory() {
		return ItemSubcategory;
	}
	
	public void setItemSubcategory(String ItemSubcategory) {
		this.ItemSubcategory = ItemSubcategory;
	}
	public int getItemAvaliableQuantity() {
		return ItemAvaliableQuantity;
	}
	
	public void setItemAvaliableQuantity(int ItemAvaliableQuantity) {
		this.ItemAvaliableQuantity = ItemAvaliableQuantity;
	}
	
	public void setItemID(Integer ItemID) {
		this.ItemID = ItemID;
    } 
	
	public int getItemQuantity() {
		return ItemQuantity;
	}
	
	public void setItemQuantity(int ItemQuantity) {
		this.ItemQuantity = ItemQuantity;
	}
	
}