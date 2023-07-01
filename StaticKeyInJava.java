package VijapurJava;

class STC
{
 static	int i = 1;
	
	void print()
	{
		System.out.println("Print Method Value of i is"+i);
		i++;
	}
}
public class StaticKeyInJava {

	public static void main(String[] args) {
		//STC.display();
		STC obj = new STC();
		obj.print();
		STC obj2 = new STC();
		obj2.print();
	}
}
/*
 * Static  Keyword : 
 * 		Variable : Memory Whole Program Same : Class Name Use  
 * 		Method : Class Name Call , Variable Static Only
 * Final :
 *  Class 
 *  Variable
 *  Method
 * */
