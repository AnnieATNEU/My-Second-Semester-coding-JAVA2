package AbstractionJAVA;

abstract class GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date datacreated; // build in method java to return date data created

	protected GeometricObject() // no parameter constructor
	{
		datacreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) { // constructor
		this.color = color;
		this.filled = filled;
		datacreated = new java.util.Date();
	}

//==============================================	 
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getdatacreated() {
		return datacreated;
	}

	public String toString() {
		return "The date Created" + datacreated + "\n Color " + color + "the filled is " + filled;
	}

	abstract double getArea();

}
