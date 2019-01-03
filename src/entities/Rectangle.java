package entities;

public class Rectangle {

	private double width;
	private double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (height + width);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
