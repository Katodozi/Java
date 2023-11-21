import java.util.Scanner;

public class Two_D_array {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		System.out.println("Enter the elements of array:");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=s.nextInt();			}
		}System.out.println("The Matrix:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");			}//array in a row
			System.out.println();
		}
	}

}
