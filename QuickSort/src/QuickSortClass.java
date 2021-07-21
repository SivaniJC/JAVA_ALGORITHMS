import java.util.Random;
import java.util.Scanner;
public class QuickSortClass{
	
	 void Quicksort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int j =partition(arr,low,high);
			Quicksort(arr,low,j-1);
			Quicksort(arr,j+1,high);
		}
	}
	 
	 /*Partition Method*/
	 
	int partition(int[] arr,int low,int high)
	{
		int i,j,pivot,temp ;
		pivot=arr[high];
		i=low-1;
		j=low;
		for(j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
				
		return i+1;
	}

	public static void main(String[] args) {
		
		//int[] arr= {124,890,875,657,245,512,346,79,543,897};
		//int n=arr.length;
		
		int n;
		Scanner sc = new Scanner(System.in);			
		
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int[] arr = new int[n];
		Random random =new Random();				
		
		for(int i=0;i<n;i++)
		{
			arr[i]=random.nextInt(6000);
		}
		
		System.out.print("Array:\n");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
//		long lStartTime = new Date().getTime();
		
		long start=System.nanoTime();
		
		QuickSortClass qs= new QuickSortClass();
		qs.Quicksort(arr,0,n-1);
			
		long end=System.nanoTime();
		
//		long lEndTime = new Date().getTime();
		
		System.out.println("\nSorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\nThe time taken to sort is "+(end-start)+"ns");
		
//		long difference = lEndTime - lStartTime;
//		System.out.println("\n\n30Elapsed milliseconds: " + difference);
		sc.close();
	}
}
