import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b,c;
		char choice;
		System.out.println("Enter any two numbers:");
		Scanner s=new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.println("What operation do you want to perform...?");
		choice = s.next().charAt(0);
		
		switch(choice) {
		case '+': c=a+b;
			System.out.println("Addition: "+c);
			break;
		case '-': c=a-b;
			System.out.println("Subtraction: "+c);
			break;
		case '*': c=a*b;
			System.out.println("Multiplication: "+c);
			break;
		case '/': c=a/b;
			System.out.println("Division: "+c);
			break;
		case '%': c=a%b;
		 	System.out.println("Remainder: "+c);
		 	break;
		 default: System.out.println("Invalid choice......!!!");
		}
			
	}

}
