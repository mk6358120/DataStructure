package Arrays;

public class Five {
	
	static void sumOfEven() {
		int sum=0;
		int[] a= {2,4,5,4,23,54,32};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of even number in array is: "+sum);
	}
	
	static void sumOfOdd() {
		int sum=0;
		int[] a= {3,5,7,11,13,2,2,24,33};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 != 0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of odd number in array is: "+sum);

	}
	
	static void sumOfPositiveNum() {
		int sum=0;
		int[] a= {-3,5,7,11,13,-2,-2,-24,-33};
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of positive number in array is: "+sum);
	}
	
	static void sumOfNegativeNum() {
		int sum=0;
		int[] a= {-3,5,7,11,13,-2,-2,-24,-33};
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of negative number in array is: "+sum);
	}
	
	static void divisibleSum() {
		int sum=0;
		int[] a= {2,4,6,8,9,12,15,3,43,321};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]%3==0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of number in array which is divisibl by 2 and 3 is: "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfEven();
		sumOfOdd();
		sumOfPositiveNum();
		sumOfNegativeNum();
		divisibleSum();

	}

}
