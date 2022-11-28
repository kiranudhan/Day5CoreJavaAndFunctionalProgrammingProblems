package basicprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double root1=0,root2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c : ");
		double c=sc.nextDouble();
        double delta=b*b-4*a*c;
        double sqrt=Math.sqrt(delta);
        
		if(delta>0) {
		root1=(-b+Math.sqrt(delta))/(2*a);
		root2=(-b-Math.sqrt(delta))/(2*a);
        System.out.println("Roots are :::"+root1+" and "+root2);
       }else if(delta==0) {
    	   double root=-b/(2*a); 
    	   System.out.println("Root is :: "+root);
       }else {
    	   System.out.println("Roots are not real");
       }

   }
}
