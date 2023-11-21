import java.util.Arrays;
import java.util.Scanner;

public class runtime_array {

	public static void main(String[] args) {
		//declaring array and taking elements in the array at runtime 
		int a[]=new int[5];
		System.out.println("Enter the elements in array:");
		Scanner s=new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			a[i]=s.nextInt();}
		System.out.println("The array:");
		for(int b : a) {//printing array using for each loop
		System.out.print(b+" ");
	}
		Arrays.sort(a);
	System.out.print("\nThe sorted array:\n");
	for(int c:a) {
		System.out.print(c+" ");
	}
}}
