package VijapurJava;

class Bike
{
	int m;
	String n;
		Bike()
		{
			this(12,"Interceptor 650");
			System.out.println("Default con");
		}
		Bike(int mileage ,String name)
		{
			this.m = mileage;
			this.n = name;
			System.out.println("para Cons");	
		}
		void print()
		{
			this.display();
			System.out.println("Bike Mileage is"+m+"Name is"+n);
		}
		void display()
		{
			System.out.println("Bike also need PUC");
		}
}


public class ThisKeyProg {

		public static void main(String[] args) {
			
				Bike obj = new Bike();
				obj.print();
		}
}
/*Task : 
 * 		This => 	
 * 	Two Constructor Call =>  
 * 		One Constructor For Values Assign
 * 	Getter Setter For Private Data of User and Constructor To call Those Data 
 *  Two Methods Call => 						
 *  
 * 	1)		User Private Data : instaId  , Pass : 
 * 				Getter Setter => this => Methods Print
 * 	2)      2 constructor  => 1 Constructor Array Maximum Element Logic
 * 						   => 2 Constructor Array Minimum Element Logic
 * 			2 Methods     => 1 Method Ascending Order Print
 * 						  => 2 Method Descending Order print 
 * 		
 * 			This Keyword : 1 Call 1 Method 	
 * 					 		
 * 
 * */
