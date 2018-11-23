import java.util.ArrayList;
import java.util.List;

public class Order {
	private int quantity;
	private double totalPrice;
	public List<Customer> customers;
	public List<Menu> menu;
	
	
	public Order() {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		customers = new ArrayList<Customer>();
		menu = new ArrayList<Menu>();
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void addMenu(Menu menu) {
		this.menu.add(menu);
	}
	
	public void setTotalPrice(int orderNumber) {
		int i =orderNumber - 1;
		double price;
		for(int j=0; j<menu.size(); j++) {
			price = menu.get(j).getFoodMenu().get(i).getPrice();
			this.totalPrice = this.quantity * price;
		}
		
	}
	
	public void addCustomer(Customer cus) {
		this.customers.add(cus);
	}
	public List<Customer> getCustomer() {
		return customers;
	} 
	
}
