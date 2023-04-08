package Arrays;

import java.util.Scanner;

public class Four {
	static void m1() {
		int size,i,sum=0,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter elements of array");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		//SUM OF ARRAY
		for(i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of array element is: "+sum);
		//MAX ELEMENT
		max=a[0];
		for(i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Max element in array is: "+max);
		//MIN ELEMENT
		min=a[0];
		for(i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Min element in array is: "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
