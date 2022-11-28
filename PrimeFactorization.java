package basicprograms;

import java.util.Scanner;

public class PrimeFactorization {
	public static void primeFactors(int n)
	{
		for(int i=2;i>0;i++) {
			while(n%i==0) {
				System.out.print(i + " ");
				n=n/i;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		primeFactors(num);

	}

}
