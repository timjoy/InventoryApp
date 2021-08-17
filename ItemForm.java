/**
 * 
 */

/**
 * @author Jen
 *
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;

//import java.sql.SQLException;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ItemForm extends JFrame implements ActionListener {
	private JLabel enterItemName = new JLabel("Enter Item Name: ");
	private JTextField enterItemText = new JTextField(20);
	private JLabel itemName = new JLabel("Item Name: ");
	
	private JLabel itemNameText = new JLabel("");
	private JLabel item_id = new JLabel("Item ID: "); 
	private JLabel item_idText = new JLabel("");
	private JLabel price = new JLabel("Price: ");
	private JLabel priceText = new JLabel("");
	private JLabel totalInStock = new JLabel("Total In Stock: ");
	private JLabel totalInStockText = new JLabel("");
	
	private JSeparator s = new JSeparator();
	
	private JLabel newItemArea = new JLabel("Add A New Item To The Inventory");
	private JLabel newItemName = new JLabel("New Item Name: ");
	private JTextField newItemText = new JTextField(20);
	private JLabel newItem_id = new JLabel("New Item ID: ");
	private JTextField newItem_idText = new JTextField(20);
	private JLabel newItemPrice = new JLabel("New Item Price: ");
	private JTextField newItemPriceText = new JTextField(20);
	private JLabel newItemTotalInStock = new JLabel("New Item Total In Stock: ");
	private JTextField newItemTotalInStockText = new JTextField(20);

	
	
	public ItemForm() {
		setTitle("Inventory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//s.setOrientation(SwingConstants.HORIZONTAL);
		setSize(350,350);
		
		JPanel pane = new JPanel();
		
		pane.setLayout(new GridLayout(0,1));
		
		pane.add(enterItemName);
		pane.add(enterItemText);
		pane.add(itemName);
		pane.add(itemNameText);
		
		pane.add(item_id);
		pane.add(item_idText);
		
		pane.add(price);
		pane.add(priceText);
		
		pane.add(totalInStock);
		pane.add(totalInStockText);
		
		
		s.setOrientation(SwingConstants.HORIZONTAL);
		pane.add(s);
		pane.add(newItemArea);
		pane.add(newItemName);
		pane.add(newItemText);
		pane.add(newItem_id);
		pane.add(newItem_idText);
		pane.add(newItemPrice);
		pane.add(newItemPriceText);
		pane.add(newItemTotalInStock);
		pane.add(newItemTotalInStockText);
		
		enterItemText.addActionListener(this);
		
		
		setContentPane(pane);
		setVisible(true);
	}
	//methods
	//write a method that uses the text entered by the user in enterItemText to populate the 4 text boxes - 
	//itemNameText, aisleText, priceText, and totalInStockText.  Maybe use Item.test. ....
	
	
	
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
				
		// TODO Auto-generated method stub
		
		ItemForm inventory1 = new ItemForm();
		//Item test = new Item ("battery", 1, 10, 25);
		
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
		//itemList.add(new Item("tire gauge", 10, 9.95, 48));
		//System.out.println ("Number in Stock of the First ArrayList Item: "  + itemList.get(0).getTotalInStock());
		//System.out.println ("Number in Stock of the Last ArrayList Item: "  + itemList.get(itemList.size()-1).getTotalInStock());
		
		
	}
	public void actionPerformed(ActionEvent evt) {
		Object src = evt.getSource();
		if(src == enterItemText) {
			String enteredText = enterItemText.getText();
			itemNameText.setText(enteredText);
			System.out.println("");
		}
	}




	//@Override
	//public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	//}

}
