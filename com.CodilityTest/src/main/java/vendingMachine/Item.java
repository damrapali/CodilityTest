package vendingMachine;

public class Item {
	
	protected String name;
	protected int quantity;
	protected double price;
	
	public Item(String name, int quantity, double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;				
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
