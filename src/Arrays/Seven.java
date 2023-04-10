package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Seven {

	static void m1() {
		Scanner sc=new Scanner(System.in);
		int size,i,t;
		System.out.println("enter size of Array");
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter "+size+" Element");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array before sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		//Sorting ascending
		
		for(i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Array after sorting:");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		//Sorting descending
		
		for(i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Array after sorting:");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void m2() {
		Scanner sc=new Scanner(System.in);
		int size,i,t;
		System.out.println("enter size of Array");
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter "+size+" Element");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array before sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		Arrays.sort(a);
		
		System.out.println("Array after sorting:");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("Array after sorting in descending order:");
		for(i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void m3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to be sorted");
		String a=sc.nextLine();
		char[] ch=a.toCharArray();	
		Arrays.sort(ch);
		System.out.println(new String(ch));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//m1();
		//m2();
		m3();
	}

}
