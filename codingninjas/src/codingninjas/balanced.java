package codingninjas;
import java.util.*;

public class balanced {
	
		public static boolean checkBalanced(String exp) {
	        char[] arr=exp.toCharArray();
	        int i=0;
	        int length=arr.length;
	        Stack<Character> par=new Stack<Character>();           
	        while(i<length){
	            if(exp.charAt(i)=='{'||exp.charAt(i)=='('||exp.charAt(i)=='['){
	                par.push(exp.charAt(i));
	            }else if(exp.charAt(i)=='}'&& par.peek()=='{'){
	                par.pop();
	            }else if(exp.charAt(i)==')'&& par.peek()=='('){
	                par.pop();
	            
	            }else if(exp.charAt(i)==']'&& par.peek()=='['){
	                par.pop(); 
	            }
	            i++;
		}
	        if(par.size()==0){
	            return true ;
	        }else{
	            return false;
	        }
	        


	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input = s.nextLine();
	
		
		System.out.println(checkBalanced(input));

	}

}
