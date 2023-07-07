package VijapurJava;

import java.util.Scanner;

public class StringOccurenseProg {

	public static void main(String[] args) {
		int count[] = new int[256]; // 261
		int temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine(); // dixit
		char ch[] = str.toCharArray();
		// loop throught the string and count frequency of every character
		// and store it in count array
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;// count['i']++; => 2
		}
		for(int i=0;i<str.length();i++) // i = 2
		{
			temp=0;
			for(int j=0;j<=i;j++) // j=0 , j=1 , j=2
			{
				if(ch[j] == str.charAt(i)) // ch[0] == 'd' == str.charAt(0)
				{
					temp++;
				}		
			}
			if(temp == 1)
			{
				System.out.println("Occurence of "+str.charAt(i)+" is "+count[str.charAt(i)]);
			}
		}
	}
}
/*
 * 
 * Array : Max Array Size  : Each character 2 bytes ASCII table 127 chracter 
 * Total Array Size : 256 
 * 
 * */
