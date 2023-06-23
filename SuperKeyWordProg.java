package VijapurJava;

class A
{
	int p=1;
	A(int a,int b)
	{
		System.out.println("A para Constructor");
	}
	void display()
	{
		System.out.println("Value of p is"+p);
	}
	void print()
	{
		System.out.println("Print Method of A class");
	}
}
class B extends A
{
	int p=2;
	B()
	{
		super(12,2);
		System.out.println("B default constructor");
	}
	void display()
	{
		System.out.println("Value of p is "+super.p);
		super.print();
	}
	
}
class C extends B 
{
		void show()
		{
			super.print();
		}
}
public class SuperKeyWordProg {

		public static void main(String[] args)
		{
			C obj = new C();
			obj.show();
		}
}
/*
 * Super Keyword : 
 * 		Used to Current class Parent class Variables, Methods , Contructors Call
 * 
 * 
 * */
