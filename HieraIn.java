package VijapurJava;

class A2
{
	A2()
	{
			System.out.println("A2 Default constructor Called");
	}
}
class B2 extends A2
{
	B2()
	{
		System.out.println("B2 Default constructor Called");
	}
}
class C2 extends A2
{
	C2()
	{
		System.out.println("C2 Default Constructor Called");
	}	
	void display()
	{
		System.out.println("Display Method");
	}
}
public class HieraIn {

		public static void main(String[] args) 
		{
			HieraIn h;
			new C2();
			new B2();
			new C2().display();
		}
}
