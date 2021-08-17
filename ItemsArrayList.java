import java.util.ArrayList;

public class ItemsArrayList {
	//private ArrayList<Item> itemList = new ArrayList(100);
	
	public static void main(String[] args) {
	ArrayList<Item> itemList = new ArrayList(100);
	itemList.add(new Item("hubcap", 1, 38.95, 24));
	itemList.add(new Item("mudflap", 2, 25.55, 88));
	itemList.add(new Item("windshield", 3, 265.95, 5));
	itemList.add(new Item("steering wheel", 4, 574.75, 16));
	itemList.add(new Item("cup holder", 5, 10.95, 36));
	itemList.add(new Item("polish", 6, 14.66, 65));
	itemList.add(new Item("windshield wiper", 7, 42.25, 47));
	itemList.add(new Item("headlight", 8, 32.95, 77));
	itemList.add(new Item("gas cap", 9, 11.85, 31));
	itemList.add(new Item("tire guage", 10, 9.95, 48));  
	}
}
