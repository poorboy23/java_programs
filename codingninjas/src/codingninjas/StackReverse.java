package codingninjas;



	import java.util.*;

	public class StackReverse {
		public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		      /*  if(s1.size()==0){
		            return;
		        }
		        int store=s1.pop();
		        s1.pop();
		        reverseStack(s1,s2);
		      
		        for(int data:s1){
		            s2.add(s1.pop());
		        }
		        s1.add(store);
		        for(int data:s2){
		            s1.add(s2.pop());
		        }*/
		        Stack<Integer> third=new Stack<Integer>();
		        for(int data:s1){
		            s2.add(s1.pop());
		        }
		         for(int data:s2){
		            third.add(s2.pop());
		        }
		        for(int data:third){
		            s1.add(third.pop());
		        }
				
			}

		static Scanner s = new Scanner(System.in);
		
		public static void main(String[] args) {
			System.out.println(Math.ceil(2.1));
			int size = s.nextInt();
			Stack<Integer> input = new Stack<Integer>();
			for(int i = 0; i < size; i++) {
				input.push(s.nextInt());
			}
			Stack<Integer> extra = new Stack<Integer>();
			StackReverse.reverseStack(input, extra);
			while(!input.isEmpty()) {
				System.out.print(input.pop() + " ");
			}
			List<Integer> st1=new ArrayList<Integer>();
			List<Integer> st2=new ArrayList<Integer>();
			
			st1.add(2);
			st2.add(2);
			
			for(int i=0;i<st1.size();i++) {
				if(st1.get(i)==st2.get(i)) {
					
				}
			}
			
		}
	}