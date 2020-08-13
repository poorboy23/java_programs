package codingninjas;

public class Factorial {
	public static int fact(int n) {
		if(n==0|n==1) {
			return 1;
		}
		System.out.println(n);
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial.fact(5));

	}

}
