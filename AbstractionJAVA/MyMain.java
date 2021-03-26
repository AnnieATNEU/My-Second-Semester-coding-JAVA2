package AbstractionJAVA;

public class MyMain {

	public static void main(String[] args) {
		Circle obj1= new Circle(3.8 );
		System.out.println("***Circle");
		obj1.setradius(3);
		obj1.getArea();
		obj1.printing();
		 
	    System.out.println("***Rectangle");
	    Rectangle obj2= new Rectangle();
	    obj2.setwidth(3);
	    obj2.setlength(4.5);
	    obj2.printing();
	    
	}

}
