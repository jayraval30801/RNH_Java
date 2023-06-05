package VijapurJava;

import java.util.Scanner;

public class ArrayInfo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[30]; //
		int i;
		System.out.println("Enter How many elements you want");
		int num = sc.nextInt();
		for (i = 0; i < num; i++) {
			System.out.println("Enter a[" + i + "]");
			a[i] = sc.nextInt();
		}
		System.out.println("Elements are");
		for (i = 0; i < num; i++) {
			System.out.print(" " + a[i]);
		}

	}
}
/*
 * Array : 
 * Maximum Elements 
 * Ascending Order
 * Prime Elements 
 * Positive & Negative Element Count
 * 
 * 
 * 
 */
