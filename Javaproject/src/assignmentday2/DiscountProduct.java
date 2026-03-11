package assignmentday2;

public abstract class DiscountProduct extends ElectronicProduct{
	public DiscountProduct(int productId, String name, double price) {
		super(productId, name, price);
		// TODO Auto-generated constructor stub
	}
	public double DiscountProduct() {
		return 0;
	}		public void displayInformation() {
		System.out.print("Discounted price In ElectronicProduct: ",);
		}
	
}
}
