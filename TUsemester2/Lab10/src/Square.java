
/**
 * Name: James Joyce 
 * Lab Section: L1 
 * Date: 3/25/19 
 * Assignment: CS 1043 Lab 10
 * Description: implementing the given hierarchy as classes in Java
 **/

public class Square extends Rectangle{

	public Square() {
		super();
	}
	
	public Square(double sideA){
		super();
		super.sideA = sideA;
	}
	
	public double perimeter(){
		double perimeter = 4 * getSideA();
		String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
		String className = this.getClass().getName();
		System.out.println(className + " " + methodName + " " + "method called!");
		return perimeter;
	}
	
	public double area(){
		double area = Math.pow(getSideA(), 2);
		String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
		String className = this.getClass().getName();
		System.out.println(className + " " + methodName + " " + "method called!");
		return area;
	}

}
