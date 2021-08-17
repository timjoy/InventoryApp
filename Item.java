//import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Jen
 *
 */

//considering converting all 4 fields to type String, then casting to int when needed, such 
//as in methods that add or subtract to the totalInStock => reason for this =>
//error on line 68 => can't convert type String to type int ..
public class Item {

	private String itemName = "";
	private int item_id = 0;
	//private BigDecimal price = 1.1;
	private double price = 0.0;
	private int totalInStock = 0;
	
	@SuppressWarnings("unchecked")
	
		
	public Item(String name, int id, double cost, int totalStocked) {
		itemName = name;
		item_id = id;
		price = cost;
		totalInStock = totalStocked;
	}
	
	public String getItemName() {
		return itemName;
	}
	public int getID() {
		return item_id;
	}
	public double getPrice() {
		return price;
	}
	public int getTotalInStock() {
		return totalInStock;
	}
	//public String getTotalInStock() {
	//	String strGetTotalInStock = (String)getTotalInStock();	
	//	return strGetTotalInStock;
	//}
	public void setItemName(String newItemName) {
		itemName = newItemName;
	}
	public void setID(int newID) {
		item_id = newID;
	}
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	public void setTotalInStock(int newTotalInStock) {
		totalInStock = newTotalInStock;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Item test = new Item ("battery", 2, 10.00, 25); 
		//System.out.println("Item Name: " + test.getItemName());
		//System.out.println("ID: " + test.getID());
		//System.out.println("Price: " + test.getPrice());
		//System.out.println("totalStocked: " + test.getTotalInStock());
		
		//ArrayList<Item> itemList = new ArrayList(100);
		//itemList.add(new Item("hubcap", 1, 38.95, 24));
		//itemList.add(new Item("mudflap", 2, 25.55, 88));
		//itemList.add(new Item("windshield", 3, 265.95, 5));
		//itemList.add(new Item("steering wheel", 4, 574.75, 16));
		//itemList.add(new Item("cup holder", 45, 10.95, 36));
		//itemList.add(new Item("polish", 6, 14.66, 65));
		//itemList.add(new Item("windshield wiper", 7, 42.25, 47));
		//itemList.add(new Item("headlight", 8, 32.95, 77));
		//itemList.add(new Item("gas cap", 9, 11.85, 31));
		//itemList.add(new Item("tire guage", 10, 9.95, 48));
		//System.out.println ("Number in Stock of the First ArrayList Item: "  + itemList.get(0).getTotalInStock());
		//System.out.println ("Number in Stock of the Last ArrayList Item: "  + itemList.get(itemList.size()-1).getTotalInStock());

	}

}
