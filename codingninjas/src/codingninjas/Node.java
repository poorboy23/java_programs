package codingninjas;

public class Node {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        int index=0;
        while(head!=null&&index-1<=i){
            index++;
            head=head.next;
        }
        System.out.println(head.data);
	}
}