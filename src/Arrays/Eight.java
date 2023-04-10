package Arrays;

import java.util.Scanner;

public class Eight {
	
	static void m1() {
		Scanner sc=new Scanner(System.in);
		int i,size;
		System.out.println("Enter size of Array");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array before sort");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int j,t;
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Array after sort");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void m2() {
		Scanner sc=new Scanner(System.in);
		int i,size;
		System.out.println("Enter size of Array");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array before sort");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int low=0,high=a.length-1;
		while(low<=high) {
			System.out.print(a[low]+" "+a[high]+" ");
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//m1();
		m2();
	}

}
