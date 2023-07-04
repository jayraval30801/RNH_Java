package VijapurJava;


interface Running {
	
	int a=12;   // public static final  int a = 12;
		void run();//public abstract void run();
}
interface Walking
{
	int b = 6;
	void walk();
}
class Person1 implements Running , Walking
{

	public void run()
	{
		System.out.println(""+Running.a);
		System.out.println("Run the Person");
	}
	public void walk()
	{
		System.out.println("Person has walk "+b+"kms");
	}

}

public class InterfaceInfo 
{	
		public static void main(String[] args) {
			Person1 obj = new Person1();
			System.out.println(""+Running.a);
			obj.run();
		}
}


