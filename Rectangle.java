package t1;

public class Rectangle {
	private double width = 1;
	private double height = 1;
	
	private static int numberOfObjects = 0;
	
	public Rectangle() {
		numberOfObjects++;
	}
	
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
		numberOfObjects++;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double newWidth) {
		width = (newWidth >= 0) ? newWidth : 0;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double newHeight) {
		height = (newHeight >= 0) ? newHeight : 0;
	}
	
	public static int getNuberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2*width + 2*height;
	}
}
