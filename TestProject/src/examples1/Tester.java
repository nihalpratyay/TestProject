package examples1;

public class Tester extends Employee {
	
	String designation = "Tester";
	String work = "Testing";

	public static void main(String[] args) {
		Tester obj = new Tester();
		System.out.println("Company name: " +obj.companyName);
		System.out.println("City Posted: " +obj.postingCity);
		System.out.println("Designation: " +obj.designation);
		System.out.println("Work: " +obj.work);

	}

}
