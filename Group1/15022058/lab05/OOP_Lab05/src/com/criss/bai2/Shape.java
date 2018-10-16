package com.criss.bai2;

public class Shape {
	protected String color = "red";
	protected boolean filled = true;

	public Shape(String color, boolean filled) {
//		super();
		this.color = color;
		this.filled = filled;
	}

	public Shape() {
		super();
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

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
}
