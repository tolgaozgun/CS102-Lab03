/**
 * 
 * @author Tolga Ozgun
 * @version 1.0
 * @date 01/03/2021
 * 
 * A subclass of Shape2D, square class has side length property.
 * Overrides following methods: calculateArea, calculatePerimeter, toString
 * and equals.
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

	@Override
	public double calculatePerimeter() {
		return 4 * sideLength;
	}

	@Override
	public double calculateArea() {
		return sideLength * sideLength;
	}

	@Override
	public String toString() {
		return super.toString() + " and side = " + sideLength;
	}

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
