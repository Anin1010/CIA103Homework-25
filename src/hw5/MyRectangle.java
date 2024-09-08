package hw5;

public class MyRectangle {

	private double width;
	private double depth;

	public MyRectangle() {
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public void setWidth(double width) {
		if (width <= 0) {
			System.out.println("寬度不可為0或負數");
		} else {
			this.width = width;
		}
	}

	public void setDepth(double depth) {
		if (depth <= 0) {
			System.out.println("高度不可為0或負數");
		} else {
			this.depth = depth;
		}
	}

	public double getArea(){
		
			return this.width * this.depth;
	}

}
