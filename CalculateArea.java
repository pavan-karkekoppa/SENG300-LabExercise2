import java.util.Scanner;

public class CalculateArea {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = 0;
		double area;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the radius:");
		radius = scn.nextDouble();
		area = calcArea(radius);
		System.out.print("Area of circle: "+ area);
		scn.close();	
		}

	private static double calcArea(double radius) {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	

}
