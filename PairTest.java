import java.util.Scanner;
/**
 * The PairTest Class initializes a Pair object and tests it
 * @author Kobe Uytiepo
 * @date August 29, 2017
 */
public class PairTest 
{
	/**
	 * Main method that tests the Pair
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double one, two = 0;
		System.out.println("Enter two numbers.\nFirst Value: ");
		one = sc.nextDouble();
		System.out.println("Second Value: ");
		two = sc.nextDouble();
		sc.close();
		
		Pair p = new Pair(one, two);
		p.sum();
		p.diff();
		p.product();
		p.average();
		p.distance();
		p.max();
		p.min();
		System.out.println(p);
	}

}