import java.util.*;

class java5class{
	public static void main(String[] args) {
		Scanner detail = new Scanner(System.in);
		
//		System.out.println("enter yourFirst name : ");
//		String fN = scan.next();
//		System.out.println("your first name is  : "+ fN);
		
//		System.out.println("enter your full name : ");
//		String fName = detail.nextLine();
//		
//		System.out.println("your full name is : "+fName);
		
//		System.out.println("enter a char or word value : ");
//		char character = detail.next().charAt(3);
//		System.out.println("your character value is : " + character);
		
		// read age of the student , read year of passout of the student, read salary of an eployee , read ph. number, read percentage , read weight , 
//		 read value of this (are u married? ) true or false.. read grade , read first name, read fullname...
		
		System.out.println("enter your age : ");
		byte age = detail.nextByte();
		
		System.out.println("are you male or female? (mention m / f )");
		char gender = detail.next().charAt(0);
		
		System.out.println("enter your year of pass out : ");
		short yop  = detail.nextShort();
		
		System.out.println("enter your salary : ");
		int salary = detail.nextInt();
		
		System.out.println("enter your phone no. : ");
		long phNo = detail.nextLong();
		
		System.out.println("enter your percentage : ");
		float percent = detail.nextFloat();
		
		System.out.println("enter your weight : ");
		double weight = detail.nextDouble();
		
		System.out.println("are you married ? (enter true or false in small alphabetical character) : ");
		boolean married = detail.nextBoolean();
		
		System.out.println("enter your grade : (please mention a or b or c or ...)");
		char grade = detail.next().charAt(0);
		
		System.out.println("enter your first name : ");
		String fname = detail.next();
		detail.nextLine();
		System.out.println("enter your full name : ");
		String fullName = detail.nextLine();
		
		System.out.println("your age is : "+ age);
		System.out.println("your gender is : " + gender);
		System.out.println("your age of pass out is : "+ yop);
		System.out.println("your salary is : " + salary);
		System.out.println("your phone number is :" + phNo);
		System.out.println("your percentage is : " + percent);
		System.out.println("your weight is  : " + weight);
		System.out.println("your married status is :" + married);
		System.out.println("your grade is : "+ grade);
		System.out.println("your first name is :" + fname);
		System.out.println("your full name is : " + fullName);
		
		if((age<=18) && (gender == 'f') || (gender == 'F')) 
		{
			System.out.println("your eligible to get married...");
			System.out.println("thank you for your interest :)");
		}
		else if((age>=23) && (gender == 'M') || (gender == 'm')) 
		{
			System.out.println("your eligible to get married :)");
		}
		else if(age<18)
		{
			System.out.println("your not eligible and your just a child...");
		}
		else
		{
			System.out.println("your entered invalid input...");
		}
		detail.close();
	}
}










