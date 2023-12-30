import java.util.Scanner;
class java3class {
		// DATA TYPES
	public static void main(String[] args) 
	{
	 	Scanner sc1 = new Scanner(System.in);
	 	System.out.println("enter your name : ");
	 	String name = sc1.nextLine();
	 	System.out.println("your full name is : "+name);
	 	sc1.close();
	}
	 // DATA TYPES
// float  after = 25.567f;
// System.out.println("the value of a : "+after);
// double bird = 24.47454567457485;
// System.out.println("the value of b is : "+bird);

//}
//}

//class java2class {
//public static void main(String[] args){
// float flo = 45.3253f;
// System.out.println("the value of flo is : "+ flo);
// double doub = 23.342553657675788;
// System.out.println("the value of doub is : "+ doub);
// // float fl1 = doub; // error: incompatible types: possible lossy conversion from double to float
// // System.out.println(fl1);
// double doub1 = doub;  // type casting
// System.out.println(doub1);
//}
//}

//class java2class{
//public static void main(String[] args) {
// System.out.println("---------------------------------");
// char a = 'a'; // we can't store more than one char in single quote ''
// System.out.println("the val of a : "+ a);
// char b = '1';
// System.out.println("the val of b : "+ b);
// char c = '@';
// System.out.println("the val of c : "+ c);
// System.out.println("---------------------------------");
//}
//}

//class java2class{
//public static void main(String[] args) {
// boolean t = true;
// System.out.println("the value of t is : " + t);
// boolean f = false;
// System.out.println("the value of f is : " + f);
//}
//}


    // TYPE CASTING

//class java2class {
//public static void main(String[] args) {
// byte a = 34;
// int b;
// b = a;
// System.out.println(a); 
// System.out.println(b);

// float c = 23.56f;
// double d ;
// d = c;
// System.out.println(c);
// System.out.println(d);
//}
//}

//class java2class{
//public static void main(String[] args) {
// int a =54;
// byte b;
// // b = a; error
// b = (byte)a; // here we can expect data loss
// System.out.println(a);
// System.out.println(b);

// double c = 62.3435;
// int d;
// // d = c; error
// d = (int)c; // here we can expect data loss
// System.out.println(c);
// System.out.println(d);
//}
//}

// TYPE CASTING EXERCISE
// BYTE TO OTHERS
//class java2class {
//public static void main(String[] args) {
// System.out.println("----- BYTE TO OTHERS DATA TYPES ------");
// byte b1 = 125;
// short s1;
// s1 = b1;
// System.out.println(s1);
// System.out.println(b1);

// byte b2 = 100;
// int i1;
// i1 = b2;
// System.out.println(b2);
// System.out.println(i1);

// byte b3 = 98;
// long l1;
// l1 = b3;
// System.out.println(l1);
// System.out.println(b3);

// byte b4 = 90;
// float f1;
// f1 = b4;
// System.out.println(f1);
// System.out.println(b4);

// byte b5 = 85;
// double d1;
// d1 = b5;
// System.out.println(d1);
// System.out.println(b5);

// byte b6 = 76;
// char c1;
// c1 = (char)b6;
// System.out.println(c1);
// System.out.println(b6);

// System.out.println("-------------------------");
//}
//}


//class java2class {
//public static void main(String[] args){
// System.out.println("------ SHORT TO OTHERS TYPE CASTING -------");
// short s1 = 455;
// byte b1;
// b1 = (byte)s1; // ans: -57 data overflow has been occured so we loss data..
// System.out.println(b1);

// short s2 = 344;
// int i1;
// i1 = s2;
// System.out.println(i1);
// System.out.println(s2);

// short s3 = 234;
// long l1;
// l1 = s3;
// System.out.println(l1);
// System.out.println(s3);

// short s4 = 2345;
// float f1;
// f1 = s4;
// System.out.println(f1);
// System.out.println(s4);

// short s5 = 2356;
// double d1;
// d1 = s5;
// System.out.println(d1);
// System.out.println(s5);

// short s6 = 35;
// char c1 ;
// c1 = (char)s6;
// System.out.println(c1);
// System.out.println(s6);
// System.out.println("-------------------------");
//}
//}

//class java2class {
//public static void main(String[] args) {
// System.out.println("---- INT TO OTHERS DATA TYPES IN TYPE CASTING----");
// int i1 = 234;
// byte b1;
// b1 = (byte)i1; // b1 = i1 ---> error 
// System.out.println(b1); // -22 data overflow so it will get error
// System.out.println(i1);

// int i2 = 43345;
// short s1;
// s1 = (short)i2;// s1 = i2;
// System.out.println(s1);
// System.out.println(i2);

// int i3 = 45664;
// long l1;
// l1 = i3;
// System.out.println(l1);
// System.out.println(i3);

// int i4 = 43345;
// float f1;
// f1 = i4;
// System.out.println(f1);
// System.out.println(i4);

// int i5 = 2233;
// double d1 ;
// d1 = i5;
// System.out.println(d1);
// System.out.println(i5);

// int i6 = 57;
// char c1;
// c1 = (char)i6;
// System.out.println(c1);
// System.out.println(i6);
//}
//}

//class java2class {
//public static void main(String[] args) {
// System.out.println("----- LONG TYPE CASTING -------")
// long l1 = 234453;
// byte b1;
// b1 = (byte)l1; 
// System.out.println(l1);
// System.out.println(b1); //data overflow

// long l2 = 345654;
// short s1;
// s1 = (short)l2;
// System.out.println(s1); //data overflow
// System.out.println(l2);

// long l3 = 23432;
// int i1;
// i1 = (int)l3;
// System.out.println(i1);
// System.out.println(l3);

// long l4 = 34543;
// float f1;
// f1 = l4; // loss of precision
// System.out.println(f1);
// System.out.println(l4);

// long l5 = 3432;
// double d1;
// d1 = l5;
// System.out.println(d1);
// System.out.println(l5);

// long l6 = 34;
// char c1;
// c1 = (char)l6;
// System.out.println(c1);
// System.out.println(l6);
// System.out.println("---------------------------")
//}
//}

//class java2class {
//public static void main(String[] args) {
// System.out.println("------ FLOAT TYPE CASTING ------");
// float f1 = 54.455f;
// byte b1;
// b1 = (byte)f1;
// System.out.println(b1);
// System.out.println(f1);

// float f2 = 34.454f;
// short s1;
// s1 = (short)f2;
// System.out.println(s1);
// System.out.println(f2);

// float f3 = 34.454f;
// int i1;
// i1 = (int)f3;
// System.out.println(i1);
// System.out.println(f3);

// float f4 = 34.454f;
// long l1;
// l1 = (long)f4;
// System.out.println(l1);
// System.out.println(f4);

// float f5 = 34.454f;
// double d1;
// d1 = (double)f5;
// System.out.println(d1);
// System.out.println(f5);

// float f6 = 34.454f;
// char c1;
// c1 = (char)f6;
// System.out.println(c1);
// System.out.println(f6);

// System.out.println("---------------");
//}
//}

//class java2class {
//public static void main(String[] args) {
// System.out.println("--------- DOUBLE TYPE CASTING-----------");

// double d1 = 45.6454;
// byte b1;
// b1 = (byte)d1;
// System.out.println(b1);
// System.out.println(d1);

// double d2 =23.345;
// short s1;
// s1 = (short)d2;
// System.out.println(s1);
// System.out.println(d2);

// double d3 = 23.545;
// int i1;
// i1 = (int)d3;
// System.out.println(i1);
// System.out.println(d3);

// double d4 = 34.433;
// long l1;
// l1 = (long)d4;
// System.out.println(l1);
// System.out.println(d4);

// double d5 = 34.24342;
// float f1;
// f1 = (float)d1;
// System.out.println(f1);
// System.out.println(d5);

// double d6 = 34.56;
// char c1;
// c1 = (char)d6;
// System.out.println(c1);
// System.out.println(d6);

// System.out.println("----------------------");
//}
//}
//
//		System.out.println("---------- CHAR TYPE CASTING -----------");
//		char c1 ='a';
//		byte b1;
//		b1 = (byte)c1;
//		System.out.println(b1);
//		System.out.println(c1);
//
//		char c2 = 'A';
//		short s1 ;
//		s1 = (short)c2;
//		System.out.println(s1);
//		System.out.println(c2);
//		
//		char c3 = '1';
//		int i1;
//		i1 = (int)c3;
//		System.out.println(i1);
//		System.out.println(c3);
//
//		char c4 = '%';
//		long l1;
//		l1 = (long)c4;
//		System.out.println(l1);
//		System.out.println(c4);
//
//		char c5 = '+';
//		float f1;
//		f1 = (float)c5;
//		System.out.println(f1);
//		System.out.println(c5);
//
//		char c6 = '|';
//		double d1;
//		d1 = (double)c6;
//		System.out.println(d1);
//		System.out.println(c6);
//
//		System.out.println("--------------------------");
}