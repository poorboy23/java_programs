package codingninjas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GeometricSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = solution.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}

 class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0){
        	return (double)1/(Math.pow(2,0));
        }
       
      return  ((double)1/Math.pow(2, k))+findGeometricSum(k-1);
    
     
        

	}
}

