package basicprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		double result=0;
		for(int  i=num;i>0;i--) {
			result=result + (double)1/i;
		}
		System.out.print("Nth Harmonic value : "+result);
		
		

	}

}
