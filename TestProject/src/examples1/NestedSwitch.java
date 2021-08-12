package examples1;

public class NestedSwitch {

	public static void main(String[] args) {
		int cousinetype = 3;
		int dish = 'B';
		switch (cousinetype) {
		case 1:
			System.out.println("You choosed North Indian Food");
			switch (dish) {
			case 'A':
				System.out.println("You ordered Samosa");
				break;
			case 'B':
				System.out.println("You ordered litti");
				break;
			default: System.out.println("Please choose a valid dish");
			    break;
			}
			break;
		case 2:
			System.out.println("You choosed South Indian Food");
			switch (dish) {
			case 'A':
				System.out.println("You ordered Idli");
				break;
			case 'B':
			    System.out.println("You ordered Dosa");
			default: System.out.println("Please choose a valid dish");
			    break;
			}
			break;
		case 3:
			System.out.println("You choosed Chinese Food");
			switch (dish) {
			case 'A':
				System.out.println("You ordered Schezwan Rice");
				break;
			case 'B':
				System.out.println("You ordered Chilli Chicken");
				break;
			default: System.out.println("Please choose a valid dish");
			    break;
			}
			break;
		default: System.out.println("Please choose a valid cousine");
		
		
		}

	}

}
