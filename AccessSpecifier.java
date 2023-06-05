package VijapurJava;

class PrimeNumber {
	int a=1; // instance Variable => WHOLEclass

	void Input(int number) // Local Variable => WHOLE METHOD
	{
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0) 
			{
				a=0;
			} 
		}
		if(a==1)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}

class AccessSpecifier {

	public static void main(String[] dixit) {
		PrimeNumber obj = new PrimeNumber();
		obj.Input(13);
	}
}
/*
 * Package => lang,util,io,lib
 * => Palindrome Number : 121 , 676, 98789 
 * 		1) Method logic 
 * 		2) Print Palindrome Or Not Palindrome
 * 			
 * 
 */
