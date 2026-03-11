package assignmentday2;

public class ElectronicProduct extends Product{
	private int warrantyPeriod;
	private String Brand;
	
	public ElectronicProduct(int productId, String name, double price) {
		super(productId, name, price);
		// TODO Auto-generated constructor stub
	}

	public ElectronicProduct(int productId, String name, double price, int warrantyPeriod, String Brand) {
		super(productId, name, price);
		this.warrantyPeriod = warrantyPeriod;
		this.Brand = Brand;
	}
	@Override
	public void displayInformation() {
	super.displayInformation();
	System.out.println("Brand " + Brand);
	System.out.println("Warrenty "+ warrantyPeriod);
	}
	
	}
	

