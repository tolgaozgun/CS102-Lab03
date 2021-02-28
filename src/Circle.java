
public class Circle extends Shape2D {

	final double radius;

	public Circle( int centerX, int centerY, double radius ) {
		super( centerX, centerY );
		this.radius = radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return super.toString() + " and radius = " + radius;
	}

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
