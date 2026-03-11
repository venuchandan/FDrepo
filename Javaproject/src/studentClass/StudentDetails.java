package studentClass;

public class StudentDetails {
	private int roll;
	private String name;
	private int maths;
	private int science;
	private int english;
	
	
	public StudentDetails(int roll, String name, int maths, int science, int english) {
		this.roll = roll;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	
	public int getRollNo() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getMaths() {
		return maths;
	}
	
	public int getScience() {
		return science;
	}
	public int getEnglish() {
		return english;
	}


	

}
