package codingninjas;

public class Recursion {
	static int n1=1,n2=1,n3=0;
	public static int fib(int n) {
		if(n==1) {
			return 1;
		}else if (n==2) {
			return 1;
		}
		int nmu1=fib(n-1);
		int nmul2=fib(n-2);
		int result =nmu1+nmul2;
		return result;
	}
	public static void fib2(int n) {
		if(n>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			fib2(n-1);
		}
	}
	public static void fib3(int n) {
		if(n==1|n==2) {
			System.out.println(n);;
		}
		fib3(n-1);
		System.out.println(n);
		
	}
	

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//System.out.println("Hello World!");
//System.out.println(Recursion.fib(3));
//System.out.println(n1+" "+n2);
//Recursion.fib2(4);
		Recursion.fib3(3);
	}

}
