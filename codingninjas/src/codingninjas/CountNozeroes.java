package codingninjas;

import java.util.Scanner;

public class CountNozeroes {
	public static int countZerosRec(int input){
		// Write your code here
        if(input<10 && input==0){
            return 1;
        }else if(input<10&& input!=0) {
        	return 0;
        }
        int last =input%10;
        int count=0;
        if(last==0){
            count+=1;
        }
        input=input/10;
        int val=countZerosRec( input);
        if(count==0) {
        	return count;
        }
		return count+val;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(CountNozeroes.countZerosRec(n));
	}
}

