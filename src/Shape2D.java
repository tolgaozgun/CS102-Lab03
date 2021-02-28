
public abstract class Shape2D {

	final int centerX;
	final int centerY;

	public Shape2D( int centerX, int centerY ) {
		this.centerX = centerX;
		this.centerY = centerY;
	}

	public abstract double calculatePerimeter();

	public abstract double calculateArea();

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

	@Override
	public String toString() {
		return "[" + getClass() + "]x = " + centerX + ", y = " + centerY;
	}

	@Override
	public boolean equals( Object o ) {
		Shape2D other;
		if( o instanceof Shape2D ) {
			other = (Shape2D) o;
			return other.centerX == centerX && other.centerY == centerY;
		}
		return false;
	}

}
