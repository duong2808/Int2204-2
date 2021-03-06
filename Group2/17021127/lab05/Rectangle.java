<<<<<<< HEAD
package cau2;

public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
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

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return this.getColor() + ", " + this.getFilled() + ", " + this.width + ", " + this.length;
    }
}
=======
package cau2;

public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
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

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return this.getColor() + ", " + this.getFilled() + ", " + this.width + ", " + this.length;
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
