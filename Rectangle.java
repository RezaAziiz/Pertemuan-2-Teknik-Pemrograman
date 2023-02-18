
public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	public Rectangle(String color, Boolean filled, double width, double length) {
		super(color,filled);
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*width*length;
	}
	@Override
	 public String toString() {
		 return "A rectangle with width " + width + "and length " + length + ", which is a subclass of " + super.toString();
		 }
}
