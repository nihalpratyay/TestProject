package examples1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter the number Which is being to be multiplied");
		    int a=scanner.nextInt();
		    System.out.println("Enter the multiplication range");
		    int b=scanner.nextInt();
		    System.out.println("The multiplication table of:"+a+" is given below");
		    for(int i=1;i<=b;i++)
		    {
		      System.out.println(a+" x "+i+" = "+(a*i));
		    }

	}

}
