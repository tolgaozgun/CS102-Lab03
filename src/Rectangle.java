
public class Rectangle extends Shape2D {

	final int height;
	final int width;

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
