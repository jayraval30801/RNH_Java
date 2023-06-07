package VijapurJava;

class Shape
{
	int a,b;
	{
		//instance initialized block
		System.out.println("Instance block");
	}
	static 
	{
		//static block
		System.out.println("Block Static");
	}
	Shape()
	{
		System.out.println("Shape Default Con Called");
	}
	Shape(int a,int b)
	{
			this.a=a;
			this.b=b;
			System.out.println("Parameterized Con");
	}
	void display()
	{
		System.out.println("Reactangle Area is"+a*b);
	}
}

public class ConsOverLoad {

		public static void main(String[] args) {
			
				Shape obj = new Shape();
				obj.display();
				Shape obj2 = new Shape(23,3);
				obj2.display();
				Shape obj3 = new Shape();
				
				//static block
				//instance block
				//default con call
				//display method
				//instancee block
				//para con
				//display method
				//instance block
				//default con
		}
}
/*
 * 
 * Class => Mutliple Method with same name
 * 
 * Overloading = ? 
 * 
 * 1) Static Block => First Priority (Only Once in Whole Program)
 * 2) Instance Block  => Each time when Object is Created
 * 3) Constructor => Each Time When Object is create (2nd Priority)
 * 4) Methods => You need to call
 * 
 * This Keyword in Java : 
 * 			
 * 
 * 
 */

