package assignmentday2;

public class StationaryProduct extends Product{
	private String material;
	private int quality;
	
public StationaryProduct(int productId, String name, double price) {
		super(productId, name, price);
		
	}
public StationaryProduct(int productId, String name, double price, int quality, String material) {
	super(productId, name, price);
	this.quality = quality;
	this.material = material;
}
public void displayInformation() {
	super.displayInformation();
	System.out.println("Quality: "+ quality);
	System.out.println("Material: "+ material);
}
}
