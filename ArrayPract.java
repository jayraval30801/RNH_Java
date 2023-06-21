package VijapurJava;

public class ArrayPract 
{

	public static void main(String[] args)
	{
		int a[] = new int[] {1,2,3,5,6};
		int b[] = new int[] {3,2,4};
		int c[] = new int[3];
		int i,j,k=0;
		for(i=0;i<a.length;i++)//i=0;a[i] = 1
		{
			for(j=0;j<b.length;j++) //j=3 b[j] = 2
			{
				if(a[i] == b[j])
				{
					break;
				}
			}
			if(j == b.length) 
			{
				c[k] = a[i];
				k++;
			}
		}
		System.out.println("Your Output Array is");
		for(i=0;i<3;i++)
		{
			System.out.println(""+c[i]);
		}
	}
}
/*
 * a[3] = {1,2,3};
 * b[3] = {2,3,4};
 * c[3] = {1};
 * 
 * 
 * 
 * 
 * 
 * */
