package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle rec = new MyRectangle();

		rec.setDepth(10);
		rec.setWidth(20);
		System.out.println(rec.getArea());

		MyRectangle rec1 = new MyRectangle(10, 20);
		System.out.println(rec1.getArea());

	}

}
