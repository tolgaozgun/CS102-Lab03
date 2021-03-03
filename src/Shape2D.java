/**
 * 
 * An abstract class, Shape2D, is the superclass for 2D shapes
 * that has properties of the shape's center coordinates. Implements
 * calculating area and perimeter of a Shape2D object, checking the
 * distance between two Shape2D objects. Also implements toString
 * and equals methods.
 * 
 * @author Tolga Ozgun
 * @version 1.2, 03/03/2021
 *
 */
public abstract class Shape2D {

	final int centerX;
	final int centerY;

	/**
	 * Default constructor
	 * @param centerX Integer x value for the center of this object.
	 * @param centerY Integer y value for the center of this object.
	 */
	public Shape2D( int centerX, int centerY ) {
		this.centerX = centerX;
		this.centerY = centerY;
	}

	/**
	 * Calculates perimeter for this {@link Shape2D} object
	 * @return Double value of perimeter
	 */
	public abstract double calculatePerimeter();

	/**
	 * Calculates area for this {@link Shape2D} object
	 * @return Double value of area
	 */
	public abstract double calculateArea();

	/**
	 * Calculates distance between centers of two {@link Shape2D} objects.
	 * @param anyShape Any object that inherits Shape2D.
	 * @return Double value of distance between centers of two objects.
	 */
	public double calculateDistance( Object anyShape ) {
		double yDiff;
		double xDiff;
		Shape2D other;
		if ( anyShape instanceof Shape2D ) {
			other = ( Shape2D ) anyShape;
			yDiff = Math.abs( centerY - other.centerY );
			xDiff = Math.abs( centerX - other.centerX );
			return Math.sqrt( yDiff * yDiff + xDiff * xDiff );
		}
		return -1;
	}
	
	/**
	 * Prints the type of current Shape2D, integer values of its
	 * center x and y.
	 * @return String with data of this Shape2D object.
	 */
	@Override
	public String toString() {
		return "[" + getClass() + "]x = " + centerX + ", y = " + centerY;
	}

	/**
	 * Checks if given object equals to this Shape2D object.
	 * @return boolean
	 */
	@Override
	public boolean equals( Object o ) {
		Shape2D other;
		if ( o instanceof Shape2D ) {
			other = ( Shape2D ) o;
			return other.centerX == centerX && other.centerY == centerY;
		}
		return false;
	}

}
