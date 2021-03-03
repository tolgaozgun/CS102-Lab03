/**
 * 
 * A subclass of Shape2D, circle class has radius property.
 * Overrides following methods: calculateArea, calculatePerimeter, toString
 * and equals.
 * 
 * @author Tolga Ozgun
 * @version 1.2, 03/03/2021
 *
 */
public class Circle extends Shape2D {

	final double radius;

	/**
	 * Default constructor
	 * 
	 * @param centerX Integer x value for the center of this circle.
	 * @param centerY Integer y value for the center of this circle.
	 * @param radius  Double value for the radius of this circle.
	 */
	public Circle( int centerX, int centerY, double radius ) {
		super( centerX, centerY );
		this.radius = radius;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	/**
	 * {@inheritDoc}
	 * Also prints its radius.
	 * @return String value of this Circle object.
	 */
	@Override
	public String toString() {
		return super.toString() + " and radius = " + radius;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals( Object o ) {
		Circle other;
		if ( o instanceof Circle ) {
			other = ( Circle ) o;
			return super.equals( o ) && radius == other.radius;
		}
		return false;
	}

}
