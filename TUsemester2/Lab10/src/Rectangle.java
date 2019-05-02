
/**
 * Name: James Joyce 
 * Lab Section: L1 
 * Date: 3/25/19 
 * Assignment: CS 1043 Lab 10
 * Description: implementing the given hierarchy as classes in Java
 **/

public class Rectangle extends Parallelogram{

	public Rectangle() {
		super();
	}
	
	public Rectangle(double sideA, double sideC){
		super();
		super.sideA = sideA;
		super.sideC = sideC;
	}
	
	public double perimeter(){
		double perimeter = 2*(getSideA() + getSideC());
		String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
		String className = this.getClass().getName();
		System.out.println(className + " " + methodName + " " + "method called!");
		return perimeter;
	}
	
	public double area(){
		double area = getSideA() * getSideC();
		String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
		String className = this.getClass().getName();
		System.out.println(className + " " + methodName + " " + "method called!");
		return area;
	}

}
