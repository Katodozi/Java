
public class ternary_operator {

	public static void main(String[] args) {
		int a=10, b=41, c=11;
		int r = (a>b)?(a>c?a:c):(b>a?b:c);
		System.out.println("Largest number is : "+r);
	}

}
