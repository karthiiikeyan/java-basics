package basicjava;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		int year;
		Scanner x=new Scanner (System.in);
		System.out.println("Enter the year :");
		year =x.nextInt();
		if(year %400==0) {
			System.out.println(year+"is a leap year");
		}
			else if (year %4==0 && year %100!=0) {
				System.out.println(year+"is a leap year");
			}
			
			else {
				System.out.println("is not leap year");
			}
	}
}
