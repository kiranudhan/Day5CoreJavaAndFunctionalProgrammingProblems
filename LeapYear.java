package basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year>999) {
			if(year %400 == 0 || (year % 4 == 0 && year % 100 != 0 )) {
				System.out.println(year + " it is a leap year");
			}else {
				System.out.println(year +" it is not leap year");
			}
		}else {
			System.out.println("Enter a valid year");
		}

	}

}
