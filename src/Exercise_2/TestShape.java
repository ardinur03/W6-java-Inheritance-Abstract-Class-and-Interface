/**
 * @file TestShape.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_2;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Circle circle = new Circle();

		System.out.println("1. shape ");
		System.out.println(shape);
		shape = new Shape("blue", false);
		System.out.println(shape);
		System.out.println("--------------------\n");

		System.out.println("2. rectangle ");
		System.out.println(rectangle);
		rectangle = new Rectangle(2.3, 5.8);
		System.out.println(rectangle);
		rectangle = new Rectangle(2.5, 3.8, "orange", false);
		System.out.println(rectangle);
		System.out.println("--------------------\n");

		System.out.println("3. square ");
		System.out.println(square);
		square = new Square(2.3);
		System.out.println(square);
		square = new Square(5.8, "yellow", false);
		System.out.println(square);
		System.out.println("--------------------\n");

		System.out.println("4. circle ");
		System.out.println(circle);
		circle = new Circle(2.3);
		System.out.println(circle);
		circle = new Circle(3.5, "green", false);
		System.out.println(circle);

	}

}
