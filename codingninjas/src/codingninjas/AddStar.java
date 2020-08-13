package codingninjas;
import java.util.*;

public class AddStar {


		// Return the updated string
		public static String addStars(String s) {
			// Write your code here
			 if(s.length()==1){
		            return s;
		        }
		        if(s.charAt(0)==s.charAt(1)){
		            String sc=addStars(s.substring(1));
		            return s.substring(0,1)+"*"+sc;
		            
		        }else {
		              String sc=addStars(s.substring(1));
		            return s.charAt(0)+sc;
		        }
			
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "stiing";
//		System.out.println(AddStar.addStars(input,0,input.length()-1));
	
//		System.out.println(input.substring(0, 1));
		System.out.println(AddStar.addStars(s));
		
	}
}

