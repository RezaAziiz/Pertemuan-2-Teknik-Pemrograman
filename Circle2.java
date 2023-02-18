
public class Circle2 extends Shape{
	
	private double radius;
	
	public Circle2() {
		radius = 1.0;
	}
	public Circle2(double r) {
		radius = r;
	}
	public Circle2(String color, Boolean filled, double radius) {
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	@Override
	 public String toString() {
		 return "A circle with radius " + radius + " which is a subclass of " + super.toString() + "]";
		 }
		
}
