package t1;

public class CircleField {
	private double radius = 1;
	
	private static int numberOfObjects = 0;
	
	public CircleField() {
		numberOfObjects++;
	}
	
	public CircleField(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNuberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
