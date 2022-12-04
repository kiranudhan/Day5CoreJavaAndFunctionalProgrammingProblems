package basicprograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns :");
		int n=sc.nextInt();
		
		//Declaring 2D array
		int array[][]=new int[m][n];
		System.out.println("Enter the elements of the array ::: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
