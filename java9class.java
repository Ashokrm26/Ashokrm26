//import java.util.*;
//
//public class java9class {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the length and breadth value : ");
//		float length = scan.nextFloat();
//		float breadth = scan.nextFloat();
//		rectangle(length,breadth);
//		
//		System.out.println("enter square value : ");
//		double sqr = scan.nextDouble();
//		double square1 = square(sqr);
//		System.out.println("square value value result is : "+ square1);
//		
//		System.out.println("enter radius value : ");
//		float radius = scan.nextFloat();
//		float radCircle = circle(radius);
//		System.out.println("circle value is : " + radCircle);
//		scan.close();	
//	}
//	
//	static void rectangle(float l, float b) {
//		float res1 = b*l;
//		System.out.println("your rectangle value is : " + res1);
//	}
//	
//	static double square(double sq) {
//		double resForSqr = sq*sq;
//		return resForSqr;
//	}
//	
//	static float circle(float r) {
//		float res = (float) (3.14 * r * r);
//		return res;
//	}
//}

import java.util.Scanner;

public class java9class{
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Enter what type of Maggi you want And how many maggi you want : ");
		String type = info.next();
		short count = info.nextShort();
		
		if((type == "normal" || type == "Normal" || type == "NORMAL") && (count==1)) {
			prepareMaggi();
		}
		else if((type == "normal" || type == "Normal" || type == "NORMAL") && (count>=2))
		{
			prepareMaggi(count);	
		}
		else if(type != "normal" || type != "Normal" || type != "NORMAL") {
			prepareMaggi(type);
		}
		else if((type != "normal" || type != "Normal" || type != "NORMAL")) {
			if(count>=2)
			prepareMaggi(type,count);
		}
		
		info.close();
		
	}
	
	
	// methods for prepare maggi
	
	static void prepareMaggi() {
		System.out.println("your normal maggi has been preparing. please wait for some time..");
	}
	
	static void prepareMaggi(String type) {
		System.out.println("your "+type+" maggi has preparing. please wait for some minute.");
	}
	
	static void prepareMaggi(String type, short count) {
		System.out.println("your "+type+" maggi has preparing. please wait for some minute.");
	}
	
	static void prepareMaggi(short count) {
		System.out.println("your normal maggi has been preparing for "+ count +" customers. please wait for some minute.");
	}
}
