
public class method_ {

	public static void main(String[] args) {//main is also the user defined method
		add(5,3);
		//creating an object since sun() is not static and directly cannot be called
		method_ obj=new method_();
		
		System.out.println("Subtraction: "+obj.sub());
		
	}
	static void add(int a, int b) {//user defined method
		System.out.println("Addtition: "+(a+b));
	}
	int sub() {
		int a=10,b=4;
		return (a-b);
	}
}
