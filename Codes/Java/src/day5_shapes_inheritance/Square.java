package day5_shapes_inheritance;

public class Square extends Rectangle{

	private double side = 1.0;
	
	public Square() {
		
	}

	public Square(double side) {
		super();
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double width) {
		this.width = side;
	}
	
	public void setLength(double length) {
		this.length = side;
	}
	
	@Override
	public String toString() {
		return "Square [Rectangle [Shape [color = " + color + ", filled = " + filled + "],"
				+ " width = "+width+", length = "+length+"]]";
	}
	
	public static void main(String[] args) {
		
		Square square = new Square();
		
		System.out.print("The details of the square are:\n"+square);
	}
}