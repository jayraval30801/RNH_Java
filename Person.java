package VijapurJava;

import java.util.Scanner;

public class Person {
		String name;
		int age;	
		public static void main(String[] args) 
		{
			int i;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of Persons");
			int count = sc.nextInt();
			sc.nextLine(); // fflush(stdin) Same
			
//			int a[] = {1,2,2,3,3}; // Array Declaration
//			int a[] = new int[SIZE];
 						
			Person obj[] = new Person[count];
			for(i=0;i<count;i++)
			{
				obj[i] = new Person();// obj[i] = new Person()
				System.out.println("Enter Name for Person"+(i+1)); 
				obj[i].name = sc.nextLine();
				System.out.println("Enter Age for Person"+(i+1));
				obj[i].age = sc.nextInt();
				sc.nextLine();
			}
			for(i=0;i<count;i++)
			{
				System.out.println("Person "+(i+1)+":");
				System.out.println("name : "+obj[i].name);
				System.out.println("age : "+obj[i].age);
				System.out.println();
			}
  		}
}
