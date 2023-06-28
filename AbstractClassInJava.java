package VijapurJava;

abstract class Hotel // abstract class
{
		void punjabi() // non abstract method
		{
			System.out.println("Punjabi Dishes");
		}
		//abstract method
		abstract void chinese(); //Abstract method Declaration 
}
class Chef extends Hotel
{
	protected void chinese()	
	{
		System.out.println("Chef Chinese Dish");
	}
}
class Customer1 extends Hotel
{
	protected void chinese()
	{
		System.out.println("Customer Chinese Dish");
	}
}
public class AbstractClassInJava {

		public static void main(String[] args) {
			
			Customer1 obj = new Customer1();
			obj.chinese();
			obj.punjabi();
		}
}
