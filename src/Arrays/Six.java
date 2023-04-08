package Arrays;

import java.util.Scanner;

public class Six {
	//Program to replace old element with new element for all occurrence

	static void m1() {
		int size;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size=obj.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter the Element:");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		
		System.out.println("Element before update in array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		int replaceNum,replaceBy;
		System.out.println("Enter the number from which we wan to replace");
		replaceNum=obj.nextInt();
		System.out.println("Enter number which comes at replace number");
		replaceBy=obj.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==replaceNum) {
				a[i]=replaceBy;
			}
		}
		
		System.out.println("Elements in array after replace");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//Program to update only first occurrence
	static void m2() {
		int size;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size=obj.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter the Element:");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		
		System.out.println("Element before update in array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		int oldn,newn;
		System.out.println("Enter number to replace");
		oldn=obj.nextInt();
		System.out.println("Enter new number");
		newn=obj.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==oldn) {
				a[i]=newn;
				break;
			}
		}
		
		System.out.println("Elements in array after replace");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	//Program to update only second occurrence
	static void m3() {
		int size;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size=obj.nextInt();
		int[] a=new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		System.out.println("Array before update");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		System.out.println();
		int newn,oldn,c=0;
		System.out.println("Enter number to be replaced");
		oldn=obj.nextInt();
		System.out.println("Enter number to be replaced by");
		newn=obj.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==oldn) {
				c++;
				if(c==2) {
					a[i]=newn;
				}
			}
		}
		System.out.println("Array after update");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//last Occurrence
	static void m4() {
		int size;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size=obj.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter the Element:");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		
		System.out.println("Element before update in array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		int newn,oldn;
		System.out.println("Enter number to be replaced");
		oldn=obj.nextInt();
		System.out.println("Enter number to be replaced by");
		newn=obj.nextInt();
		
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]==oldn) {
				a[i]=newn;
				break;
			}
		}
		
		System.out.println("Array after update");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}	
	
	static void m5() {
		int size;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size=obj.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter the Element:");
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		
		System.out.println("Element before update in array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		int index,newn;
		System.out.println("Enter index:");
		index=obj.nextInt();
		System.out.println("Enter new number");
		newn=obj.nextInt();
		if(index>=0 && index<a.length) {
			a[index]=newn;
		}
		else {
			System.out.println("Enter valid index");
		}
		System.out.println("Array after update");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
	}

}
