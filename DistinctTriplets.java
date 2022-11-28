package basicprograms;

import java.util.Scanner;

public class DistinctTriplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int noOfElements=sc.nextInt();
		int count=0;
		int array[] = new int[noOfElements];
		for(int i=0;i<noOfElements;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<=array.length-3;i++) 
		{
			for(int j=i+1;j<=array.length-2;j++) 
			{
				for(int k=j+1;k<=array.length-1;k++)
				{
					if(array[i] + array[j] + array[k] == 0) {
						count++;
						System.out.println("Valid triplet is "+array[i] +","+array[j]+","+array[k]);
					}
				}
				
			}
		}

	}

}
