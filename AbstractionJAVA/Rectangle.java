package AbstractionJAVA;

public class Rectangle extends GeometricObject {
	private static double length;
	private static double width;
	private static double area;

	public Rectangle() { // no parameter constructor

	}

	public Rectangle(double length, double width) // constructor with parameter
	{
		this.length = length;
		this.width = width;
	}

	public void setlength(double length) { // length set method
		this.length = length;
	}

	public double getlength() { // length get method
		return length;
	}

	public void setwidth(double width) { // width set method
		this.width = width;
	}

	public double getwidth() { // width get method
		return width;
	}

	@Override
	double getArea() { // method to calculate area of a rectangle
		double area = length * width;
		return area;

	}

	public void printing() {
		System.out.println("The area of the Rectangle is = " + length * width);
	}

}
