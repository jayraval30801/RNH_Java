package VijapurJava;

import java.util.Scanner;

class Customer
{
	private int accno;
	private int password;
	public String firstName;
	
	public int getPass() {
		return password;
	}
	public void setPass(int pass) {
		password = pass;
	}
	public void setAccno(int a)
	{
		accno = a;
	}
	public int getAccno()
	{
		return accno;
	}

}
public class EncapDemo {

		public static void main(String[] args) {
			int a;
			Scanner sc  =  new Scanner(System.in);
			Customer obj = new Customer();
			System.out.println("Enter Account Number");
			 a = sc.nextInt();
			 obj.setAccno(a);
			 System.out.println("Your Account Number is"+obj.getAccno());
			 
			System.out.println("Enter First Name");
			obj.firstName = sc.next(); //
			System.out.println("Your First Name is"+obj.firstName);
		}
}
