import java.util.Arrays;

public class ShapeTest {

	public static void main( String[] args ) {
		Shape2D[] shapeArray;
		Square sq;
		Square sq2;
		Square sq3;
		Square sq4;
		Rectangle rect;
		Circle circle;

		rect = new Rectangle( 2, 3, 8, 15 );
		circle = new Circle( 13, 15, 3.0 );
		sq = new Square( -2, -5, 5 );
		sq2 = new Square( -2, -5, 5 );
		sq3 = new Square( -1, -5, 5 );
		sq4 = null;
		shapeArray = new Shape2D[ 3 ];
		shapeArray[ 0 ] = rect;
		shapeArray[ 1 ] = circle;
		shapeArray[ 2 ] = sq;

		System.out.println( rect );
		System.out.println( circle );
		System.out.println( "sq: " + sq );
		System.out.println( "sq2: " + sq2 );
		System.out.println( "sq3: " + sq3 );
		System.out.println( "sq4: " + sq4 );
		System.out.println( "sq.equals( sq2 ) is " + sq.equals( sq2 ) );
		System.out.println( "sq.equals( sq3 ) is " + sq.equals( sq3 ) );
		System.out.println( "sq.equals( sq4 ) is " + sq.equals( sq4 ) );
		System.out.println( "sq.equals( circle ) is " + sq.equals( circle ) );
		System.out
				.println( "The shape array: " + Arrays.toString( shapeArray ) );
		System.out.println( findLargestArea( shapeArray ).getClass().getName()
				+ " has the largest area" );
		System.out.println(
				findLongestPerimeter( shapeArray ).getClass().getName()
						+ " has longest perimeter " );
		System.out.print( "Distance between shape 1 shape 2 is "
				+ shapeArray[ 0 ].calculateDistance( shapeArray[ 1 ] ) );
		System.out.println( "Distance between shape 1 shape 3 is "
				+ shapeArray[ 0 ].calculateDistance( shapeArray[ 2 ] ) );
		System.out.print( "Distance between shape 2 shape 3 is "
				+ shapeArray[ 1 ].calculateDistance( shapeArray[ 2 ] ) );
	}

	public static Shape2D findLargestArea( Shape2D[] shapes ) {
		double maxArea;
		Shape2D selectedShape;

		maxArea = shapes[ 0 ].calculateArea();
		selectedShape = shapes[ 0 ];

		for ( int i = 0; i < shapes.length; i++ ) {
			if ( shapes[ i ] != null
					&& shapes[ i ].calculateArea() > maxArea ) {
				maxArea = shapes[ i ].calculateArea();
				selectedShape = shapes[ i ];
			}
		}
		return selectedShape;
	}

	public static Shape2D findLongestPerimeter( Shape2D[] shapes ) {
		double maxPerim;
		Shape2D selectedShape;

		maxPerim = shapes[ 0 ].calculatePerimeter();
		selectedShape = shapes[ 0 ];

		for ( int i = 0; i < shapes.length; i++ ) {
			if ( shapes[ i ] != null
					&& shapes[ i ].calculatePerimeter() > maxPerim ) {
				maxPerim = shapes[ i ].calculatePerimeter();
				selectedShape = shapes[ i ];
			}
		}
		return selectedShape;
	}

}
