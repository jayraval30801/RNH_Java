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
 			System.out.println("Enter Name of Person You Want Data of");
 			String fname = sc.next();
 			sc.nextLine();
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
				if(fname.equals(obj[i].name)) 
				{
					System.out.println("Your Data has been found");
					System.out.println("Name is"+obj[i].name);
					System.out.println("Age is"+obj[i].age);
				}
			}
  		}
		
}

/*
 * Patients Class : 
 * 		Variable : pid , name , disease , adharno 
 * 		Multiple Patients => Specifiec Patient Find  
 * 
 * 
 * 
 * 
 */
