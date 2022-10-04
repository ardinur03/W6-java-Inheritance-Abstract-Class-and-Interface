/**
 * @file Circle.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_1;

// 13 menit
public class Circle {

	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() { // 1st (default) constructor
		setRadius(1.0);
		setColor("red");
	}

	/** Constructs a Circle instance with the given radius and default color */
	public Circle(double r) { // 2nd constructor
		setRadius(r);
		setColor("red");
	}

	public Circle(double radius, String Color) { // 1st (default) constructor
		setRadius(radius);
		setColor(Color);
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
		return "Circle[radius=" + getRadius() + " color=" + getColor() + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
