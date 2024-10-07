package JavaPrograms;

import java.util.Scanner;

interface Shape{
	 Scanner sc = new Scanner(System.in);
	 int a=2;
	 int b=3;
  public void printArea();
}

class Rectangle implements Shape{
	
	public void printArea() {
		
	  
	  System.out.println("Enter length: ");
	  int a = sc.nextInt();
	  System.out.println("Enter breadth: ");
	  int  b = sc.nextInt();
	  int r = a*b;
	  System.out.println("Area of rectangle is " + r);
	}
	
}
class Triangle implements Shape{
	public void printArea() {
		
		
		  System.out.println("Enter breadth: ");
		  int a = sc.nextInt();
		  System.out.println("Enter height: ");
		  int b = sc.nextInt();
		  double t = (0.5)*a*b;
		  System.out.println("Area of traingle is" + t);
		}
		
}

class Circle implements Shape{
	
	public void printArea() {
		  System.out.println("Enter radius: ");
		  int  a = sc.nextInt();
		  double c = (3.14)*a*a;
		  System.out.println("Area of circle is" + c);
	}
}
public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		Circle c1 = new Circle();
		r1.printArea();
		t1.printArea();
		c1.printArea();
		

	}

}
