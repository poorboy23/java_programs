package codingninjas;
import java.util.Scanner;

public class stringAB {
	public static boolean checkAB(String input) {
		// Write your code here
        if(input.charAt(0)!='a'){
            return false;
        }else if(input.length()==1 && input.charAt(0)!='a'){
            return false;
        }
        return check (input,0,input.length()-1);
        

	}
    public static boolean check(String input,int si,int ei) {
        if(si<ei){
            return true;
        }
        if(input.charAt(si)=='a'&& (input.charAt(si+1)=='b'&& input.charAt(si+2)=='b')||  input.charAt(si+1)=='a') {
        	boolean val=check(input.substring(si+1),si, input.substring(si+1).length()-1);
        	return val;
        }else if((input.charAt(si)=='b'&& input.charAt(si+1)=='b')&& input.charAt(si+2)=='a') {
        	boolean val=check(input.substring(si+2),si, input.substring(si+2).length()-1);
        	return val;
        
        }
        
        return false;
    }
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(stringAB.checkAB(input));
	}

}