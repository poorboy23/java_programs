package codingninjas;
public class Solution2 {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        int index=0;
        while(head!=null&&index-1<i+1){
            index++;
            head=head.next;
        }
        System.out.println(head.data);
	}
}
