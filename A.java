import java.util.Scanner;/*automatically entered by IDE when object is 
created to input at runtime*/
public class A {

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter any two numbers:");
		Scanner s=new Scanner(System.in);//to create object for input
		
		a=s.nextInt();//for taking a input at runtime
		b=s.nextInt();// for taking b input at runtime
		
		c = a + b;
		
		System.out.println("The sum of two numbers:"+c);
		
	}

}
