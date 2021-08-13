package examples1;

public class Manager extends Employee {
	
	String degisnation = "Manager";
	String work = "Management";

	public static void main(String[] args) {
		Manager obj = new Manager();
		System.out.println("Company name: " +obj.companyName);
		System.out.println("City Posted: " +obj.postingCity);
		System.out.println("Degisnation: " +obj.degisnation);
		System.out.println("Work: " +obj.work);
		
	}

}
