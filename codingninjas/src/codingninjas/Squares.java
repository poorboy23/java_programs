package codingninjas;

import java.util.ArrayList;
import java.util.List;

//public class Squares {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
class CountSquares { 
	  
    public static List<Integer> countSquares(List<String> arr) 
    { 
    	int a=Integer.parseInt(arr.get(0));
    	int b=Integer.parseInt(arr.get(1));
       
        List<Integer> result=new ArrayList<>();
        
        for (int i = a; i <= b; i++) 
  
            
            for (int j = 1; j * j <= i; j++) 
                if (j * j == i) {
                	
                	result.add(i);
                  
                }
        return result; 
    } 
} 
  
// Driver Code 
public class Squares { 
    public static void main(String[] args) 
    { 
//        int a = 9, b = 25; 
//        CountSquares obj = new CountSquares(); 
//        System.out.print("Count of squares is " + obj.countSquares(a, b));
//        
    	
    	List<String> arr=new ArrayList<>();
    	arr.add("1");
    	arr.add("10");
    	System.out.println(CountSquares.countSquares(arr));
        
    } 
}