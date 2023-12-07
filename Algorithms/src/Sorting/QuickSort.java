package Sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int low=0,high=a.length-1;
		int start=low;
		int end=high;
		int mid=(start+end)/2;
		int pivot=a[mid];
		
		while(start<=end) {
			while(a[start]<pivot) {
				start++;
			}
			while(a[end]>pivot) {
				end--;
			}
			if(start<=end) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println("Array after sorting");	
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		sc.close();
	}

}
