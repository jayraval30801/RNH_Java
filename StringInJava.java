package VijapurJava;

public class StringInJava {

	public static void main(String[] args) {
			String str = "Hii Welcome to Gausala"; // String literal 
			char ch[] = {'a','p','n','a'};
			String str1 = new String("Panjrapol");
			for(int i=0;i<ch.length;i++)
			{
					System.out.println(""+ch[i]);
			}
			String str2 = new String(ch);//converting ch array to string
			System.out.println("New String is"+str2);
			int count=0;
			for(int i=0;i<str2.length();i++)
			{
				count++;
			}
			System.out.println("Total Characters are "+count);
			char ch1[] = str2.toCharArray();	
	}
}
/*
 * 
 * 
 * String str = "";
 * 
 * 
 * 
 */
