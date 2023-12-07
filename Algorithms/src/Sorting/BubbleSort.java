package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-2;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting");	
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		sc.close();
	}

}
