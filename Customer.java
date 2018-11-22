import java.util.List;

public class Customer {
	private String name;
	private int phoneNumber;
	private String address;
	public List<Account> accounts;
	
	public Customer(String name, int phoneNumber, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAccount(Account acc) {
		this.accounts.add(acc);
		
	}
	public List<Account> getAccount() {
		return accounts;
	}
	
}
