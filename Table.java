import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any number:");
		Scanner s=new Scanner(System.in);
		
		num = s.nextInt();
		System.out.println("The multiplication table of "+num+":");
		int i=1;
		while(i<=10) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		

	}

}
