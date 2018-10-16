package tuan5.shape;
public class Shape {
	public String color = "red";
	public Boolean filled = true;
	public Shape() {
		
	}
	public Shape(String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return "Shape";
	}
	
}
