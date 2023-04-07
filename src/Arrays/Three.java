package Arrays;

import java.util.Scanner;

public class Three {
	
	static void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the element of Array....");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Printing using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println("Index:"+i+" Value="+a[i]);
		}
		System.out.println("Printing using while loop");
		int index=0;
		while(index<a.length) {
			System.out.println("Index:"+index+" Value="+a[index]);
			index++;
		}
		System.out.println("Printing using for each loop");
		for(int item:a) {
			System.out.println("Item="+item);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
