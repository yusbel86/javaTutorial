public class method {

	static void myMethod(String fname, int age){
		System.out.println(fname + " is " + age);
	}

	static int plusMethod(int x, int y){
		return x + y;
	}

	static double plusMethod(double x, double y){
		return x + y;
	}

	public static void main (String [] args){
		myMethod("Liam", 23);
		int myNum1 = plusMethod(8, 5);
		double myNum2 = plusMethod(4.3, 6.23);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
	}

	
}