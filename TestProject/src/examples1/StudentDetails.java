package examples1;

public class StudentDetails {
	
	String name;
	int ID;
	int RollNo;
	int Marks;
	String Grade;
	
public StudentDetails(String name, int ID, int RollNo, int Marks, String Grade) {
	this.name = name;
	this.ID = ID;
	this.RollNo = RollNo;
	this.Marks = Marks;
	this.Grade = Grade;
}

	public static void main(String[] args) {
		StudentDetails obj = new StudentDetails("Nihal", 8, 13, 85, "A");
		System.out.println(obj.name);
		System.out.println(obj.ID);
		System.out.println(obj.RollNo);
		System.out.println(obj.Marks);
		System.out.println(obj.Grade);
		

	}

}
