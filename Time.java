package interfaceRelays;

public interface Time
{
	/**
	 * Adds the given time to the current time, producing the sum
	 * @param other the given time to add
	 * @return the sum of this time and the other time
	 */
	public abstract Time add(Time other);

	/**
	 * Return a String representation of this time
	 * @return this time represented as a String in hh:mm:ss format
	 */
	public abstract String toString();
}