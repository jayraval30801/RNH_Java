package VijapurJava;

class GrandPar // Multilevel Inheri
{
	void display()
	{
		System.out.println("DisplayMethod of Grand Parent class");
	}
}
class Par1 extends GrandPar
{
	void display()
	{
		System.out.println("Par1 Method Of Display");
	}
	
}
public class InheriTypes  extends Par1{
	
		public static void main(String[] args) {
			GrandPar obj  = new Par1();
			obj.display();
		}	
}
