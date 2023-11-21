class P{//super class
	int a=100;
	int b;
	P(){
		b=200;
		System.out.println(b);
	}
	void show() {
		System.out.println("Class P");
	}
} 
class Y extends P{//sub class 
	int a=20;
	Y(){//for constructor the java gives the default super 
		//or maybe you could give one
		super();
		b=300;
		System.out.println(b);
	}
	void show() {
		
		System.out.println(a);//it will call it's own member
		super.show();//accessing the method of super class
		System.out.println(super.a);//this will call the variable of superclass
	}
}

class Super_keyword {
	
	public static void main(String[] args) {
		Y r=new Y();
		r.show();

	}

}
