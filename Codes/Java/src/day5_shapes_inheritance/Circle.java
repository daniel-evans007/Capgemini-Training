package day5_shapes_inheritance;

public class Circle extends Shape{

	private double radius = 1.0;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	
	@Override
	public String toString() {
		return "Circle [Shape [color = " + color + ", filled = " + filled + "],"
				+ "radius = " + radius+"]";
	}
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		System.out.print("The details of the circle are:\n"+circle);
	}
}