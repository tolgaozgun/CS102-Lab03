/**
 * 
 * A subclass of Shape2D, square class has side length property.
 * Overrides following methods: calculateArea, calculatePerimeter, toString
 * and equals.
 * 
 * @author Tolga Ozgun
 * @version 1.2, 03/03/2021
 *
 *
 */
public class Square extends Shape2D {

	final int sideLength;

	/**
	 * Default constructor
	 * 
	 * @param centerX    Integer x value for the center of this square.
	 * @param centerY    Integer y value for the center of this square.
	 * @param sideLength Integer value for the length of a side for this square.
	 */
	public Square( int centerX, int centerY, int sideLength ) {
		super( centerX, centerY );
		this.sideLength = sideLength;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calculatePerimeter() {
		return 4 * sideLength;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calculateArea() {
		return sideLength * sideLength;
	}

	/**
	 * {@inheritDoc}
	 * Also prints the side.
	 * @return String value of this Square object.
	 */
	@Override
	public String toString() {
		return super.toString() + " and side = " + sideLength;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals( Object o ) {
		Square other;
		if ( o instanceof Square ) {
			other = ( Square ) o;
			return super.equals( o ) && other.sideLength == sideLength;
		}
		return false;
	}

}
