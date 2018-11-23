public class Payment {
	private double amount;
	private String chooseBank;
	
	public double getAmount() {
		this.amount = Order.getTotalPrice();
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getChooseBank() {
		return chooseBank;
	}
	public void setChooseBank(String chooseBank) {
		this.chooseBank = chooseBank;
	}
	
	public void makePayment() {
		System.out.println("Hereglegch: " + Customer.getAccount() + "Zahialgiin dugaar: " + Order.getId + "Uniin dun: " + amount);
	}
}
