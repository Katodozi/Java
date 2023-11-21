import java.util.Scanner;

abstract class Bank{
	public String name="Katodozi Bank Ltd";
	
	public void bankdetails() {
		System.out.println("Bank_name: "+name);
	}
	abstract void deposit();
	abstract void withdraw();
	abstract void checkbal();
}
class bankservice extends Bank{
	private double bal=5000;
	private int pwd;
	public double money;
	
	public void deposit() {
		System.out.println("Enter the password:");
		Scanner s=new Scanner(System.in);
		
		pwd = s.nextInt();
		if(pwd==1999) {
			System.out.println("Enter Deposite amount:");
			money=s.nextDouble();
			System.out.println("Deposited Money: "+money);
			System.out.println("Total balance: "+bal);
			}else {
				System.out.println("Incorrect password..!!");
			}
	}public void withdraw() {
		System.out.println("Enter Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==1999) {
			System.out.print("Enter the Withdraw amount:");
			money=s.nextDouble();
			
			System.out.println("Withdrawn money:"+money);
			System.out.println("Total balance: "+bal);
		}
		else {
			System.out.println("Incorrect password..!!");
		}
	}public void checkbal() {
		System.out.println("Enter Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==1999) {
			System.out.println("Total balance: "+bal);
		}else {
			System.out.println("Incorrect password..!!");
		}
	}
	
}
class Abstraction{

	public static void main(String[] args) {
		bankservice b=new bankservice();
		b.bankdetails();
		
		int choice;
		System.out.println("1.Deposit\n2.Check balance\n3.Withdraw");
		System.out.println("Enter your choice:");
		Scanner s1=new Scanner(System.in);
		choice = s1.nextInt();
		
		switch(choice) {
		case 1:
			b.deposit();
			break;
		case 2:
			b.checkbal();
			break;
		case 3:
			b.withdraw();
			break;
		default: 
			System.out.println("Invalid choice");
		}
	}}
