
package vijay;
import java.util.*;


public class Practice {
	Scanner obj=new Scanner(System.in);
	//Area of circle
	public void Areaofcircle(){
		
		
		System.out.println("Enter radius: ");
		double r=obj.nextDouble();
		double Area=(22*r*r/7);
		System.out.println(Area);
	}
	
	//Area of Triangle
	public void AreaofTriangle(){
		System.out.println("Enter Breadth: ");
		double b=obj.nextDouble();
		System.out.println("Enter Length: ");
		double l=obj.nextDouble();
		double AreaT=(b*l/2);
		System.out.println(AreaT);
	}
	
	//Area of Rectangle
	public void AreaRectangle() {
		System.out.println("Enter Breadth: ");
		double b=obj.nextDouble();
		System.out.println("Enter Length: ");
		double l=obj.nextDouble();
		double AreaR=(l*b);
		System.out.println(AreaR);
	}
	public static void main(String args[]) {
		Practice k=new Practice();
		k.Areaofcircle();
		k.AreaofTriangle();
		k.AreaRectangle();
	}
}


