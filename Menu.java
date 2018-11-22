package fastfood.food;

import java.util.ArrayList;

public class Menu {
	public ArrayList<Food> foodMenu = new ArrayList<Food>();
	
	public Menu() {
		
	}
	
	public void addFood(Food food) {
		foodMenu.add(food);			
	}
	
	public void subFood(Food food) {
		foodMenu.remove(food);			
	}
	
	public void showMenu() {
		for(int i = 0; i < foodMenu.size(); i++) {		
			System.out.println(i+1 + " : " + foodMenu.get(i).getFoodName() + " : " + 
								foodMenu.get(i).getPrice() + " : " + foodMenu.get(i).getDiscription());
		}
		
	}

//	public ArrayList<Food> getFoodMenu() {
//		return foodMenu;
//	}

	public ArrayList<Food> getFoodMenu() {
		// TODO Auto-generated method stub
		return foodMenu;
	}
	
	
	
	
}
