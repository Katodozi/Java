
public class private_constructor {
	int a;
	String b;
	private private_constructor() {
		a=15;
		b="Katodozi";
		System.out.println(a+" "+b);
	}
	static void show() {//now you can use these values in any operation you want..
		int x=a;
		String y=b;
	}
	public static void main(String[] args) {
		private_constructor p=new private_constructor();

	}

}

/*Here no other class can access the data of private constructor so if you
 * want to use those data outside the class then make a static method and 
 * use because static method can be access without any object....... */
