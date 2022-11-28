package basicprograms;

public class FlipCoin {

	public static void main(String[] args) {
		int coinFlipped=5;
		int tailcount=0,headcount=0;
		for(int i=1;i<=coinFlipped;i++) {
			double random=Math.random() * 2;
			System.out.println("random : " + random);
			if(random<0.5) {
				//tails
				tailcount++;
			}else {
				//heads
				headcount++;
		  }
		}
		int headPercentage=(tailcount / coinFlipped) * 100;
	    int tailPercentage=(headcount / coinFlipped) * 100;
       System.out.println("Percentage of Head :"+headPercentage);
       System.out.println("Percentage of tail : "+tailPercentage);
	}

}
