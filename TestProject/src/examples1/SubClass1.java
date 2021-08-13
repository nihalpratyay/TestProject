package examples1;

class Parentclass
{
   Parentclass(){
	System.out.println("no-arg constructor of parent class");
   }
   Parentclass(String str){
	System.out.println("parameterized constructor of parent class");
   }
}

public class SubClass1 extends Parentclass {
	 SubClass1(){
		super("Hii");
		
	   }
	   void display(){
		System.out.println("Hello");
	   }

	public static void main(String[] args) {
		SubClass1 obj = new SubClass1();
		obj.display();
		

	}

}
