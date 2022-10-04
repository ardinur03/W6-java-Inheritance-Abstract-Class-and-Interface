/**
 * @file Circle.java 
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_2;

// 13 menit
public class Circle extends Shape {

	// private instance variable, not accessible from outside this class
	private double radius;

	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() { // 1st (default) constructor
		this.radius = 1.0;
		setColor(super.getColor());
	}

	/** Constructs a Circle instance with the given radius and default color */
	public Circle(double r) { // 2nd constructor
		this.radius = r;
		setColor("red");
	}

	public Circle(double radius, String Color) { // 1st (default) constructor
		this.radius = radius;
		setColor(Color);
	}

	public Circle(double radius, String Color, boolean filled) { // 1st (default) constructor
		this.radius = radius;
		setColor(Color);
		setFilled(filled);
	}

	/** Returns the radius */
	public double getRadius() {
		return radius;
	}

	/** Returns the area of this Circle instance */
	protected double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	/**
	 * Return a self-descriptive string of this instance in the form of
	 * Circle[radius=?,color=?]
	 */
	public String toString() {
		return "Circle[radius=" + getRadius() + " color=" + getColor() + "]" + " filled= " + isFilled();
	}
}
