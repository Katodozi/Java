import java.util.Scanner;
import java.lang.System;

class bank{
	private double balance=15000;
	private int pin;
	
	public void deposit(double money) {
		System.out.println("Enter the pin:");
		Scanner s=new Scanner(System.in);
		
		pin=s.nextInt();
		if(pin==1999) {
			
			System.out.println("Total money in your account:"+(balance+money));
	}else {
		System.out.println("Incorrect pin code...!!!!!!\n Try again!!");
	}
		}
	public void withdraw() {
		double money;
		System.out.println("Enter the pin:");
		Scanner s=new Scanner(System.in);
		
			pin=s.nextInt();
		if(pin==1999) {
			if (balance<=15000){
			System.out.println("Enter the amount:");
			money=s.nextDouble();
			System.out.println("You have successfully withdrawn the amount "+money);
			System.out.println("Total money in your account:"+(balance-money));
			}}
		else {
			System.out.println("Incorrect pin code...!!!!!!\n Try again!!");
		}
	}
	void show() {
		System.out.println("Your balance is => "+balance);
	}
}
class Encapsulation_ {
	bank b=new bank();
	 void login(){
		String user=new String("katodozi");
		String user1;
		int password;
		int choice;
		System.out.println("Enter the Username:");
		Scanner s1=new Scanner(System.in);
		
		user1=s1.nextLine();
		System.out.println("Enter the Password:");
		password=s1.nextInt();
		
		if(password==1234 && user.equals(user1)){
			 
			System.out.println("YOU HAVE SUCCESSFULLY LOGGED IN...!!!!!!");
			System.out.println("1.Deposit\n2.Check balance\n3.Withdraw");
			System.out.println("Enter your choice:");
			choice = s1.nextInt();
			
			switch(choice) {
			case 1:
				b.deposit(34000);
				break;
			case 2:
				b.show();
				break;
			case 3:
				b.withdraw();
				break;
			default: 
				System.out.println("Invalid choice");
			}
		}else {
			System.out.println("Invalid details.....!!");
		}
	}	
	public static void main(String[] args) {
		System.out.println("                     WELCOME TO THE kATODOZI BANK LTD.!!!!!!");
		Encapsulation_ e=new Encapsulation_();
		e.login();
	}

}
