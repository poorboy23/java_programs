package codingninjas;
import java.util.Scanner;

public class Palindrome {
	public static boolean isStringPalindrome(String input) {
		// Write your code here
        if(input.length()==1){
            return true;
        }
     
        boolean net=Palindrome(input, 0,input.length()-1);
        return net;
      
        

	}
    public static boolean Palindrome(String s,int si,int ei){
        if(si>ei){
            return true;
        }
        if(s.charAt(si)!=s.charAt(ei)){
            return false;
        }
        return  Palindrome( s,si+1, ei-1);
        
        
    } 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Palindrome.isStringPalindrome(input));
	}
}

 
