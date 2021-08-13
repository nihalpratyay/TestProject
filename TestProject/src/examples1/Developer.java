package examples1;

public class Developer extends Employee {
	
	String designation = "developer";
	String work = "Software Development";

	public static void main(String[] args) {
		Developer obj = new Developer();
		System.out.println("Company name: " +obj.companyName);
		System.out.println("City Posted: " +obj.postingCity);
		System.out.println("Degisnation: " +obj.designation);
		System.out.println("Work: " +obj.work);

	}

}
