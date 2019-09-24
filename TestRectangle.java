package t1;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle first = new Rectangle(4,40);
		Rectangle second = new Rectangle(3.5,35.9);
		
		System.out.println("Rectangle first's width, height, area, and perimeter are "+ first.getWidth() +", "+ first.getHeight() + 
				", " + first.getArea() + ", " + first.getPerimeter());
		
		System.out.println("Rectangle second's width, height, area, and perimeter are "+ second.getWidth() +", "+ second.getHeight() + 
				", " + second.getArea() + ", " + second.getPerimeter());
		

	}

}
