package Revision;

import java.util.Scanner;

public class Day1 {
	
	static void m1() {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int[] a=new int[size];
		
		//Enter element
		System.out.println("enter the element in array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//Display array
		System.out.println("Array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		//Max Element
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Max element is array is "+max);
		
		//Min Element
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Min element in array is "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
