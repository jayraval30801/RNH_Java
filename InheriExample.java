package VijapurJava;
class Pub
{
	public int a=12;
	protected int b=13;
	private int c=14;
	Pub()
	{
		System.out.println();
	}
	Pub(int a,int b)
	{
		System.out.println("Pub Para Cons");
	}
	void display()
	{
		System.out.println("Pub Display Mthod ");
	}
}
class Pvt extends Pub
{
	Pvt()
	{
		System.out.println("Pvt Default cons");
	}
	Pvt(int a,int b)
	{
		System.out.println("Pvt Para Cons");
	}
	void display()
	{
		System.out.println("Value of a is"+a);
		System.out.println("Value of b is "+b);
	}
	public void printDisplay()
	{
		this.display();
	}
}
public class InheriExample {

	public static void main(String[] args) {
		Pvt obj = new Pvt();
		Pvt obj2 = new Pvt(23,3);
		obj.printDisplay();		
	}
}
/*
 * 
 * Inheritence: 
 * => To Access Protected and Public Members of Child class We use
 * 			inheritence.
 * 1) Parent Class/Super class/Base Class :  
 * 2) Child class/Sub class/Derived Class : Object Create 
 * 
 * 		Types of Inheritence : 
 * 				5 types : 
 * 					Single : One parent one child 
 * 					Multiple : Not Supperted using class : inteface
 * 					Multilevel : Grand parent Parent class Child class
 * 					Hierarchical : Parent 2 Childs 
 * 					Hybrid  : Combination of Inheritence Types
 *		
 *	CPP : (:)
 *	Java : extends
 *			
 * protected : child class Class Access 
 * 
 */