abstract class Animal{//it's object cannot be made
	void limbs() {//since it is for all animals
		System.out.println("They have 4 limbs");
	}
	abstract void sound();//if one of the method is abstract then the whole class becomes abstract
	abstract void eat();
}
class Dog extends Animal{
	@Override//to write of what's already written
	void sound() {
		System.out.println("The dogs: Bhow ...bhow...!!");
	}
	void eat() {
		System.out.println("The dog eats meat..");
	}
}
class Cow extends Animal{
	@Override
	void sound() {
		System.out.println("The cows: hubbaaa ...hubbaaa...!!");
	}
	void eat() {
		System.out.println("The cow eats grass...!!");
	}
}
public class override_abstract {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cow c=new Cow();
		
		d.sound();	d.eat();
		c.sound();  c.eat();
		d.limbs();//both objects can access the limbs method since it has extended
	}

}
