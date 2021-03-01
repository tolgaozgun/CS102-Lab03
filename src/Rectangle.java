/**
 * 
 * @author Tolga Ozgun
 * @version 1.0
 * @date 01/03/2021
 * 
 * A subclass of Shape2D, rectangle class has height and width properties.
 * Overrides following methods: calculateArea, calculatePerimeter, toString
 * and equals.
 *
 */
public class Rectangle extends Shape2D {

	final int height;
	final int width;

	/**
	 * Default constructor
	 * 
	 * @param centerX Integer x value for the center of this rectangle.
	 * @param centerY Integer y value for the center of this rectangle.
	 * @param height  Integer height value of this rectangle.
	 * @param width   Integer width value of this rectangle.
	 */
	public Rectangle( int centerX, int centerY, int height, int width ) {
		super( centerX, centerY );
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * ( height + width );
	}

	@Override
	public double calculateArea() {
		return height * width;
	}

	@Override
	public String toString() {
		return super.toString() + " height = " + height + " and width = "
				+ width;
	}

	@Override
	public boolean equals( Object o ) {
		Rectangle other;
		if ( o instanceof Rectangle ) {
			other = ( Rectangle ) o;
			return super.equals( o ) && other.height == height
					&& other.width == width;
		}
		return false;
	}

}
