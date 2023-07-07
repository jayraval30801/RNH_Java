package VijapurJava;

import java.util.Scanner;

public class StringProgram {

		public static void main(String[] args) {
			
			int count=1;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter String");
			String str = sc.nextLine();// Dixit and Rushi => 3 words
			System.out.println("Your Inputed String is"+str);
			char ch[] = str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i] == ' ' || ch[i] == '\t')
				{
						count++;
				}
			}
			System.out.println("Total Words in String are "+count);
		}
}
/*
 * Input : Today match is IndvsPak
 * Character occurence: 
 * T : 
 * t : 
 * o :
 * d : 
 * y : 
 * ' ' :  
 * 
 * */
