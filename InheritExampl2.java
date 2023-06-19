package VijapurJava;

class ABC {
	{
		System.out.println("ABC instance Init Block");
	}
	static {
		System.out.println("ABC static Block");
	}
//	ABC() {
//		System.out.println("ABC Default Constructor");
//	}
}
class XYZ extends ABC {
	{
		System.out.println("XYZ instance init Block");
	}
	static {
		System.out.println("Static block of XYZ");
	}
	XYZ() {
		System.out.println("XYZ Default Constructor");
	}
}

public class InheritExampl2 extends XYZ {
	InheritExampl2(int a,int n)
	{
		
	}
	public static void main(String[] args) {
		InheritExampl2 obj = new InheritExampl2(12,2);
		
	}
}
/*
 * 
 * Constructor : object =>1) Grand Parent  
 * 						  2) Parent XYZ
 * 						  3) Child 
 * Method  => 1) Child
 * 			  2) Parent 
 * 			  3) Grand Parent			 		
 * 
 * 
 * */