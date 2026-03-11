package assignmentday2;

public abstract class Product {
	public static void main(String [] args) {
		ElectronicProduct laptop = new ElectronicProduct(3143131, "Laptop", 24000.4500,36,"ASUS");
		StationaryProduct phone = new StationaryProduct(4545463,"StoryBook", 179.99,100, "Apple");
		
		System.out.println("ElectronicProduct: ");
		laptop.displayInformation();
		System.out.println("StationaryProduct");
		phone.displayInformation();
	}
		
protected int productId ;
protected String name;
protected double price;
public Product(int productId, String name, double price) {
	this.productId = productId;
	this.name = name;
	this.price = price;
}
public void displayInformation() {
	System.out.println("ProductID: " + productId);
	System.out.println("ProductName: " + name);
	System.out.println("ProductPrice: " + price);
}
}


