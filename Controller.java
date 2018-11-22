package fastfood.food;

import java.util.Scanner;

public class Controller {
	Food food = new Food("Khuushuur", 800.0, "Naadmiin khuushuur");
	Menu menu = new Menu();
	Order order = new Order();
	
	
	public Controller() {
		menu.addFood(food);
		order.addMenu(menu);
		menu.showMenu();
		System.out.print("Too hemjeeg oruulna uu: ");
		Scanner sc = new Scanner(System.in);
		order.setQuantity(sc.nextInt());
		System.out.print("Zahialgiin dugaariig oruulna uu: ");
		Scanner sc1 = new Scanner(System.in);
		order.setTotalPrice(sc1.nextInt());
		System.out.print("Tanii zahialgiin niit vne: " + order.getTotalPrice());
		
	}

	public static void main(String[] args) {
		new Controller();
	}

}
