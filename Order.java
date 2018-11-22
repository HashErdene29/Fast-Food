package fastfood.food;

import java.util.ArrayList;

public class Order {
	private int quantity;
	private double totalPrice;
	
	public ArrayList<Menu> menu = new ArrayList<Menu>();
	
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
		price = menu.get(0).getFoodMenu().get(i).getPrice();
		this.totalPrice = this.quantity * price;
	}
	 
	
}
