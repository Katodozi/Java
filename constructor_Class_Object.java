class X
{
	int x,a;//instance variable
	char y;
	X(){//default constructor
	 a=200;
} 
	X(int b, String c){//parametrized constructor 
		System.out.println(b+" "+c);
	}
	X(int d, char e){
		 x = d;
		 y = e;
	}
	
	X(X sef){//copy constructor
		x=sef.x;
		y=sef.y;
		a=sef.a;
		System.out.print(x+" "+y+" ");
		System.out.println(a);
	}
	void show() {
		System.out.println(a);
		}
	void show1() {
		System.out.println(x+" "+y);
		
	}
	}
class constructor_Class_Object {

	public static void main(String[] args) {
		X s=new X();
		X r=new X(19, "Katodozi");//creating an object
		X p=new X(12, 'A');
		//passing reference variable as an arguement
		X t=new X(p);//copy constructor only copying the value of p....
		t=new X(s);//only copying the value of default constructor......
		s.show();
		p.show1();
	}

}
