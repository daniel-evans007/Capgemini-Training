package day5_shapes_inheritance;

public class Rectangle extends Shape{

	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle() {
		
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super();
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
		return length*width;
	}
	
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	@Override
	public String toString() {
		return "Rectangle [Shape [color = " + color + ", filled = " + filled + "],"
				+ " width = "+width+", length = "+length+"]";
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("The details of the rectangle are:\n"+rectangle);
	}
}