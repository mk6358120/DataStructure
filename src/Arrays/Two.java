package Arrays;

public class Two {
	
	static void m1() {
		int a[] = {1,2,3,4,5}; 
		System.out.println("----m1 Method------");
		System.out.println(a[0]);//1
		System.out.println(a[1]);//2
		System.out.println(a[2]);//3
		System.out.println(a[3]);//4
		System.out.println(a[4]);//5
		System.out.println("lenght of array is "+a.length);
	}
	
	static void m2() {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("----m2 Method------");
		System.out.println(a[0][0]);//1
		System.out.println(a[0][1]);//2
		System.out.println(a[0][2]);//3
		
		System.out.println(a[1][0]);//4
		System.out.println(a[1][1]);//5
		System.out.println(a[1][2]);//6

		System.out.println(a[2][0]);//7
		System.out.println(a[2][1]);//8
		System.out.println(a[2][2]);//9

	}
	
	static void m3() {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("----m3 Method------");
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m2();
		m3();
	}

}
