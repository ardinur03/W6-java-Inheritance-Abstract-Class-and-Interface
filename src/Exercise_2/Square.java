/**
 * @file Square.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_2;

public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + super.getColor() + ",filled=" + super.isFilled() + "]" + "],width="
                + super.getWidth()
                + ",length=" + super.getWidth() + "]";
    }
}
