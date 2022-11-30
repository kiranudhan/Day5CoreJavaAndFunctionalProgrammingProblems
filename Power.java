package basicprograms;

public class Power {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num >= 0 && num <31) {
		     int value=(int) Math.pow(2, num);
		     System.out.println("Power of 2^ "+num +" is "+value);
		     System.out.println("printing all value :");
		     for(int i=1;i<=num;i++) {
		    	 System.out.println("2 raised to "+i +" is "+(Math.pow(2, i)));
		     }
	    }else {
	    	System.out.println("Number is not in range");
	    }

  }
}	
