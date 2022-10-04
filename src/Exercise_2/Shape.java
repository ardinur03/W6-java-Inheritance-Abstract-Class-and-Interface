/**
 * @file Shape.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_2;

public class Shape {
	private String color;
	private boolean filled;

	public Shape() {
		setColor("red");
		setFilled(true);
	}

	public Shape(String ColorTemp, boolean filledTemp) {
		setColor(ColorTemp);
		setFilled(filledTemp);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		return "Shape [color= " + getColor() + "," + "filled= " + isFilled();
	}
}
