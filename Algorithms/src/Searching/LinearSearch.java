package Searching;

import java.util.Scanner;

public class LinearSearch {

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
		int count=0,i;
		for(i=0;i<=a.length-1;i++) {
			if(a[i]==x) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Element found at "+i+" location");
		}
		else {
			System.out.println("Element not found");
		}
		sc.close();

	}

}
