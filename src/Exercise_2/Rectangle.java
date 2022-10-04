/**
 * @file Rectangle.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_2;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}

	public Rectangle(double width, double length) {
		this.setWidth(width);
		this.setLength(length);
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.setWidth(width);
		this.setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle[Shape[color=" + super.getColor() + ",filled=" + super.isFilled() + "]" + "],width=" + width
				+ ",length=" + length + "]";
	}
}
