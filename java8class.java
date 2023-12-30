//public class java8class{
//	public static void main(String[] args) {
//		short s1 = 5;
//		short s2 = 3;
//		int ret = multi(s1,s2);
//		System.out.println(ret);
//	}
//	
//	public static int multi(int b1, int b2) {
//		int bb1 = b1;
//		int bb2 = b2;
//		int result = bb1 * bb2;
//		return result;
//	}
//}

import java.util.*;
public class java8class{
	public static void main(String[] args) {
		// addition for type 1
		addition();
		
		Scanner ac2 = new Scanner(System.in);
		System.out.println("enter 2 no. for subtraction : ");
		int aa = ac2.nextInt();
		int bb = ac2.nextInt();
		subtraction(aa, bb); // type 2 method
		
		int multiply = mul(); // type 3 method
		System.out.println(multiply);
		System.out.println("---------------------------------");
		
		System.out.println("enter the numbers for addition : ");
		int add1 = ac2.nextInt();
		int add2 = ac2.nextInt();
		int res = addition(add1, add2); // type 4 method
		System.out.println("your addition result is : "+ res);
		
		ac2.close();
		
		
	}
	
	static void addition() {  // type 1 method
		int a = 10;
		int b = 4;
		int result = a+b;
		System.out.println("welcome to type 1 method for addition value will be : "+result );
		System.out.println("--------------------------------------------------------");
	}
	
	static void subtraction(int a, int b) { // type 2 method
		int aa = a;
		int bb = b;
		System.out.println("your subtraction value is : " +(aa-bb));
		System.out.println("--------------------------------------");
	}
	
	static int mul(){ // type 3 method
		int c = 34;
		int d = 45;
		int result1 = c*d;
		return result1;
	}
	
	static int addition(int a1, int a2) { // type 4 method
		int no1 = a1;
		int no2 = a2;
		int resultAddition = no1+no2;
		return resultAddition;
	}
	
	
}











