package tu.phamanh2;

public class Shape 
{
	public final float PI = 3.14f;
	protected String color;
	protected boolean filled;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() 
	{
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Shape(String color, boolean filled) 
	{
		this.color = color;
		this.filled = filled;
	}
	public Shape() 
	{
		super();
	}
	public String toString() 
	{
		return "Shape  [color=" + color + ", filled=" + filled + "]";
	}

	
	
}