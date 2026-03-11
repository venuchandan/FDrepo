package daytwo;

public class array {
	public static void main(String [] args) {
		int[] myArray= {10,20,30,40,50};
		for(int i=0; i < myArray.length ; i++) {
			System.out.println(myArray[i]);
		}
		
		double[] salary= {10000, 20000, 30000, 40000, 50000};
		
		for(int i=0; i<salary.length; i++) {
			salary[i] = salary[i]*10;
			System.out.println("Previous salary: " + salary);
			System.out.println("After increment: " + salary[i] );
		}
	}
	

	
	
}




