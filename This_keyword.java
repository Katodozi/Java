
class This_keyword {
	int a;
	This_keyword(){
		System.out.println("Katodozi");
	}
	This_keyword(int a){
		this();//calls the default constructor within the class
		this.a=a;//now the instance variable is conformed
	}
	void show1() {
		System.out.println(a);
	} 
	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		This_keyword r=new This_keyword();
		This_keyword s=new This_keyword(5);
		System.out.println(r);
		r.show();
		s.show1();
	}

}
