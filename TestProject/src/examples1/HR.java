package examples1;

public class HR extends Employee {
	
	String designation = "HR";
	String Work = "Manpower Management";

	public static void main(String[] args) {
		HR obj = new HR();
		System.out.println("Company name: " +obj.companyName);
		System.out.println("City Posted: " +obj.postingCity);
		System.out.println("Degination: " +obj.designation);
		System.out.println("Work: " +obj.Work);
		
	}

}
