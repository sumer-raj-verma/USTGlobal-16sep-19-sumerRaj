package array;

public class BubbleSort {
	
	static void bubbleUpSort(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
