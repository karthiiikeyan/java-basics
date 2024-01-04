package basicjava;
/*if else,find leap year using operators*/


public class Conditional {
	public static void main (String[]args) {
		int age = 18;
		if(age>21) {
			System.out.println("you are eligible to donate blood ");
			
		}
		else if(age==21){
			System.out.println("you are also eligible");
		}
		else {
			System.out.println("you are not eligible");
		}
		int day = 4;
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default :
				System.out.println("no days");


		}
	}		
}