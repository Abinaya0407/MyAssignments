package week1day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 20, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + range + " terms:");

	    for (int i = 1; i <= range; ++i) {
	      System.out.print(firstTerm + ", ");

	      int sum = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = sum;
	    }
}

}
