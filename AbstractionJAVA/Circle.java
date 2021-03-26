package AbstractionJAVA;

public class Circle extends GeometricObject {

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setradius(double radius) {
		this.radius = radius;
	}

	public double getradius() {
		return radius;
	}

	@Override
	double getArea() {
		double Area = (radius * radius * Math.PI);
		return Area;
	}

	public void printing() {
		System.out.println("The radius of the circle is = " + radius*radius);
	}
}
