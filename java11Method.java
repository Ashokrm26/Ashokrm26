import java.util.Scanner;

public class java11Method {
	
	public static void calculateArea11(int side) {
		int res = side*side;
		System.out.println(res);
	}
	
	public static void calculateArea11() {
		int side = 23;
		int res = side*side;
		System.out.println(res);
	}
	
	public static int calculateArea1() {
		int side = 10;
		int res = side*side;
		return res;
	}
	
	public static int calculateArea1(int side) {
		int res = side*side;
		return res;
	}
	
	
	public static int rectangle() {
		int len = 10;
		int bre = 12;
		int res = len*bre;
		return res;
	}
	
	public static int rectangle(int len, int bre) {
		int res = len*bre;
		return res;
	}
	
	public static void rectangle1(int length, int breadth) {
		int res = length*breadth;
		System.out.println(res);
	}
	
	public static void rectangle1() {
		int len = 10;
		int bre = 5;
		int res = len*bre;
		System.out.println(res);
	}
	
	public static void areaOfCircle(float rad) {
		float res = (float) (3.14*rad*rad);
		System.out.println(res);
	}
	
	public static void areaOfCircle() {
		float rad = 4.5f;
		float res = (float) (3.14*rad*rad);
		System.out.println(res);
	}
	
	public static float areaOfCircle1(float rad) {
		float res = (float) (3.14*rad*rad);
		return res;
	}
	
	public static float areaOfCircle1() {
		float rad = 5.6f;
		float pi = 3.14f;
		float res = (float) (pi*rad*rad);
		return res;
	}
	
	public static void calcTriangle(double base, double height) {
		double res = 1/2 * (base*height);
		System.out.println(res);
	}
	
	public static void calcTriangle() {
		double base = 23;
		double height = 12;
		double res = 1/2 * (base*height);
		System.out.println(res);
	}
	
	public static double calcTriangle1(double base, double height) {
		double res = 1/2*(base*height);
		return res;
	}
	
	public static double calcTriangle1() {
		double base = 23, heigth = 11;
		double res = 1/2*(base*heigth);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter side for sqr. : ");
		int calAreaSqr = scan.nextInt();
		
		calculateArea11(calAreaSqr);
		calculateArea11();
		int sqrValue1 = calculateArea1(calAreaSqr);
		System.out.println(sqrValue1);
		int sqrValue2 = calculateArea1();
		System.out.println(sqrValue2);
		System.out.println("--------------------------------------");
		
		System.out.println("enter values for length and breadth : ");
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		
		rectangle(length, breadth);
		rectangle();
		int rect = rectangle(length, breadth);
		int rect1 = rectangle();
		System.out.println(rect1);
		System.out.println(rect);
		System.out.println("---------------------------------------");
		
		System.out.println("enter radius value : ");
		float rad = scan.nextFloat();
		
		areaOfCircle(rad);
		areaOfCircle();
		float circle = areaOfCircle1(rad);
		float circle1 = areaOfCircle1();
		System.out.println(circle);
		System.out.println(circle1);
		System.out.println("--------------------------------------  ");
		
		System.out.println("enter values base & height for the triangle : ");
		double base = scan.nextDouble();
		double height = scan.nextDouble();
		
		calcTriangle(base, height);
		calcTriangle();
		double triangle = calcTriangle1(base, height);
		double triangle1 = calcTriangle1();
		System.out.println(triangle);
		System.out.println(triangle1);
		System.out.println("--------------------------------------");
		scan.close();
	}
	
}
