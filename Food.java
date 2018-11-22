package fastfood.food;

public class Food {
	private String foodName;
	private Double price;
	private String description;
	
	public Food(String foodName, Double price, String discription) {
		this.foodName = foodName;
		this.price = price;
		this.description = description;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDiscription() {
		return description;
	}
	public void setDiscription(String description) {
		this.description = description;
	}
	
	
}
