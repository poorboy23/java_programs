package codingninjas;
import java.util.*;

public class StringReplace {


	public static void main(String[] args) {
		
		 List<List<Integer>> listOfLists = new ArrayList<>();
	        
	        // Creating innerList 
	        List<Integer> innerList = new ArrayList<>();
	        
	        // Adding elements to innerList
	        innerList.add(1);
	        innerList.add(2);
	        innerList.add(3);
	        
	        // Adding innerList to listOfLists
	        listOfLists.add(innerList);
	        
	        // Creating another inner list 
	        List<Integer> innerList2 = new ArrayList<>();
	        
	        // Adding elements to innerList2
	        innerList2.add(100);
	        innerList2.add(101);
	        innerList2.add(102);
	        
	        // Adding innerList2 to listOfLists
	        listOfLists.add(innerList2);        

	        // Printing listOfLists elements
	        System.out.println();
	    }
		
		StringReplace.destCity(listOfLists);
		
		

	}


