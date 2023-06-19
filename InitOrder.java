package VijapurJava;

public class InitOrder {

	public String first = "instance";

	public InitOrder() {
		first = "constructor";
	}

	{
		first = "block";
	}

	public void print() 
	{
		System.out.println(first);
	}

	static InitOrder i;
	
	public static void main(String... args)
	{
		System.out.println(""+i.first);
		new InitOrder().print();
	}

}
