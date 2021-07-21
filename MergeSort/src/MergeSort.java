import java.util.Random;
import java.util.Scanner;

public class MergeSort {
		
		void mergesort(int[] arr,int low,int high)
		{
			if(low<high)
			{
				int mid=(low+high)/2;
				mergesort(arr,low,mid);
				mergesort(arr,mid+1,high);
				merge(arr,low,mid,high);
			}
		}
		void merge(int[] arr,int low,int mid,int high)
		{
			int i,j,h,k;
			int b[]=new  int[100000];
			h=low;
			i=low;
			j=mid+1;
			while((h<=mid)&&(j<=high))
			{
				if(arr[h]<arr[j])
				{
					b[i]=arr[h];
					h++;
				}
				else
				{
					b[i]=arr[j];
					j++;
				}
				i=i+1;
			}
			if(h>mid)
			{
				for(k=j;k<=high;k++)
				{
					b[i]=arr[k];
					i++;
				}
			}
			else
			{
				for(k=h;k<=mid;k++)
				{
					b[i]=arr[k];
					i= i+1;
				}
			}
			for(k=low;k<=high;k++)
				arr[k]=b[k];
			
		}
	public static void main(String[] args) {
		
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
		
		long start=System.nanoTime();
		
		MergeSort ms= new MergeSort();
		ms.mergesort(arr,0,n-1);
			
		long end=System.nanoTime();

		
		System.out.println("\nSorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\nThe time taken to sort is "+(end-start)+"ns");

		sc.close();
	}
}