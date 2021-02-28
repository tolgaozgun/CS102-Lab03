
public class Square extends Shape2D {

	final int sideLength;

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
			other = (Square) o;
			return super.equals( o ) && other.sideLength == sideLength;
		}
		return false;
	}

}
