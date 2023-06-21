package VijapurJava;

public class PairOfArrayWithGivenSum {

		static void findPair(int a[],int sum)
		{
			int i,j;
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]+a[j] == sum)
					{
						System.out.printf("Pair Found : (%d,%d)",a[i],a[j]);
					}
				}
			}
		}
		public static void main(String[] args) {
			int a[] = {2,4,5,6,0,1};
			int sum = 6; // (2,4) , (6,0), (5,1)
			findPair(a,sum);
		}
}
/**
 * 
 * 
 */
