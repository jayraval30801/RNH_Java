package VijapurJava;
class Parent{
	Parent(int Size, int a[])
	{	
		for(int i=0;i<Size;i++)
		{
			if(a[i]==3)
			{
				System.out.println("Number Found at index "+i);
			}
		}
	}
};

class Child{
	Child(int size, int a[])
	{
		
	}
}

class superKW{
	public static void main(String []args)
	{
		int Size=5;
		int a[]= new int[Size];
		for(int j=0;j<Size;j++)
		{
			a[j]=j+2;
		}
		System.out.println();
		for(int j=0;j<Size;j++)
		{
			System.out.print(a[j]);
		}
		Child c=new Child(Size,a);
	}
}