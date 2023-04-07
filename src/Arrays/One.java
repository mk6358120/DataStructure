package Arrays;

public class One {
	
	static void m1() {
		System.out.println("m1 method");
		int[] a=new int[3];
		System.out.println(a);
	}
	
	static void m2() {
		System.out.println("m2 method");
		int[] a=new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
	
	static void m3() {
		System.out.println("m3 method");
		int[][] a=new int[3][3];
		System.out.println(a);
	}
	
	static void m4() {
		System.out.println("m4 method");
		String a[];
		a=new String[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		boolean c[];
		c=new boolean[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m2();
		m3();
		m4();

	}

}
