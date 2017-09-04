/**
 * The Pair Class creates an object that computes two values inputed
 * @author Kobe Uytiepo
 * @date August 29, 2017
 */
public class Pair 
{
	private double a, b;
	/**
	 * Constructs a pair
	 * @param first First value of the pair
	 * @param second Second value of the pair
	 */
	public Pair(double first, double second)
	{
		a = first;
		b = second;
	}
	/**
	 * Computes the sum of the values in this pair
	 * @return the sum of the first and second values
	 */
	public double sum()
	{
		return a + b;
	}
	/**
	 * Computes the difference of the values in this pair
	 * @return the difference of the first and second values
	 */
	public double diff()
	{
		return a - b;
	}
	/**
	 * Computes the product of the values in this pair
	 * @return the product of the first and second values
	 */
	public double product()
	{
		return a * b;
	}
	/**
	 * Computes the average of the values in this pair
	 * @return the average of the first and second values
	 */
	public double average()
	{
		return (a + b) / 2;
	}
	/**
	 * Computes the distance of the values in this pair
	 * @return the absolute value of the difference of the first and second values 
	 */
	public double distance()
	{
		return Math.abs(a - b);
	}
	/**
	 * Computes the maximum value in this pair
	 * @return the greater of the first and second values
	 */
	public double max()
	{
		if(a > b)
			return a;
		else
			return b;
	}
	/**
	 * Computes the minimum value in this pair
	 * @return the lesser of the first and second values
	 */
	public double min()
	{
		if(a < b)
			return a;
		else
			return b;
	}
	/**
	 * Outputs the Pair as a string
	 * @return the Pair as a string
	 */
	public String toString()
	{
		String str = "";
		str += "Sum: " + this.sum();
		str += "\nDifference: " + this.diff();
		str += "\nProduct: " + this.product();
		str += "\nAverage: " + this.average();
		str += "\nDistance: " + this.distance();
		str += "\nMaximum: " + this.max();
		str += "\nMinimum: " + this.min();
		return str;
	}
}
