package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter search element");
		int x=sc.nextInt();
		
		int i=0,j=a.length-1,mid=0,count=0;
		while(i<j) {
			mid=(i+j)/2;
			if(x==a[mid]) {
				count++;
				break;
			}
			else if(x>a[mid]) {
				i++;
			}
			else if(x<a[mid]) {
				j--;
			}
		}
		if(count==1) {
			System.out.println("Element found at "+mid+" location");
		}
		else {
			System.out.println("Element not found");
		}
		sc.close();
	}

}
