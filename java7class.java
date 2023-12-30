//
//public class java7class {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("before invoking a method..");
//		int x = add();
//		System.out.println("after invoking a method...");
//		System.out.println(x);
//		System.out.println();
//	}
//	
//	static int add() {
//		int a = 10;
//		int b = 20;
//		int res = a + b;
//		return res;
//		// System.out.println("after return it can't do any function in an method...");
//	}
//
//}


//	public static void main(String[] args) {
//		float mul = multiplication(5,8);
//		System.out.println(mul);
//	}
//	
//	public static float multiplication(float a, float b) {
//		float aa = a;
//		float bb = b;
//		float result = aa*bb;
//		return result;
//	}

public class java7class{
	public static void main(String[] args) {
		add();   // created type 1 method for addition
		
		boolean isMarried = false;
		sub(isMarried);  // created type 2 method for subtraction..
		
		float multi = mul();
		System.out.println(multi);
		
		
		double first = 34.1;
		double second = 12.3;
		
		double division = div(first, second);
		System.out.println("division of two number is : " + division);
		
		
	}
	
	
	
	public static void add() {   // created type 1 method for addition..
		int aa = 90;
		int bb = 234;
		int res = aa+bb;
		System.out.println("Type 1 method : "+res);
	}
	
	
	public static void sub(boolean m) {  // created type 2 method for subtraction..
		
		System.out.println("Type 2 method : ");
		
		if( m == true)
			System.out.println("your eligible for this coupon..");
		else
			System.out.println("your not eligible for this offer..");
	}
	
	
	private static float mul() {
		float aaa = 5;
		float bbb = 8;
		float results = aaa*bbb;
		System.out.println("Type 3 method : ");
		return results;
	}
	
	private static double div(double aaa, double bbb) {
		double divOfTwo = aaa/bbb;
		System.out.println("Type 4 method : ");
		return divOfTwo;
	}
	
	
}