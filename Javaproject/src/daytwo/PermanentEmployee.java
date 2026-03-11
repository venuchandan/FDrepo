package daytwo;

public class PermanentEmployee extends Employee {
	int bonus;

	public PermanentEmployee(int empId, String name, double salary) {
		super(empId, name, salary);
		this.bonus=bonus;
		System.out.println(empId+name+salary );
	}
	
public void calculatePerk(int bonus) {
	System.out.println(bonus+salary);
}
public void calculatePerk(int hra, int bonus) {
	System.out.println(bonus+salary+hra);
}

public void displayDetails() {
	super.displayDetails();
	System.out.println(bonus);
}
}
