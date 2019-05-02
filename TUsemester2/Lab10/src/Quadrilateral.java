
/**
 * Name: James Joyce 
 * Lab Section: L1 
 * Date: 3/25/19 
 * Assignment: CS 1043 Lab 10
 * Description: implementing the given hierarchy as classes in Java
 **/

public class Quadrilateral {
	double sideA;
	double sideB;
	double sideC;
	double sideD;
	double angleA;
	double angleB;
	double angleC;
	double angleD;

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getSideD() {
		return sideD;
	}

	public void setSideD(double sideD) {
		this.sideD = sideD;
	}

	public double getAngleA() {
		return angleA;
	}

	public void setAngleA(double angleA) {
		this.angleA = angleA;
	}

	public double getAngleB() {
		return angleB;
	}

	public void setAngleB(double angleB) {
		this.angleB = angleB;
	}

	public double getAngleC() {
		return angleC;
	}

	public void setAngleC(double angleC) {
		this.angleC = angleC;
	}

	public double getAngleD() {
		return angleD;
	}

	public void setAngleD(double angleD) {
		this.angleD = angleD;
	}

	public Quadrilateral() {
		super();
	}

	public Quadrilateral(double sideA, double sideB, double sideC, double sideD, double angleA, double angleB,
			double angleC, double angleD) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.sideD = sideD;
		this.angleA = angleA;
		this.angleB = angleB;
		this.angleC = angleC;
		this.angleD = angleD;
	}

	public double perimeter(){
		double perimeter = getSideA() + getSideB() + getSideC() + getSideD();
		String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
		String className = this.getClass().getName();
		System.out.println(className + " " + methodName + " " + "method called!");
		return perimeter;
	}
	
	public double area(){
		double area = (0.5 * getSideA() * getSideD() * Math.sin(Math.toRadians(getAngleA())))
					+ (0.5 * getSideB() * getSideC() * Math.sin(Math.toRadians(getAngleC())));
		String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
		String className = this.getClass().getName();
		System.out.println(className + " " + methodName + " " + "method called!");
		return area;
	}

	@Override
	public String toString() {
		return "Quadrilateral [getSideA()=" + getSideA() + ", getSideB()=" + getSideB() + ", getSideC()=" + getSideC()
				+ ", getSideD()=" + getSideD() + ", getAngleA()=" + getAngleA() + ", getAngleB()=" + getAngleB()
				+ ", getAngleC()=" + getAngleC() + ", getAngleD()=" + getAngleD() + ", perimeter()=" + perimeter()
				+ ", area()=" + area() + "]\n";
	}
}
