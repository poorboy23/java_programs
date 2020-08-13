package codingninjas;


public class MergeL {

	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
		LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;
        
        if(head1.data<head2.data){
            head=head1;
            tail=head;
            head1=head1.next;
          
        }else{
            head=head2;
            tail=head;
            head2=head2.next;
           
        }
        while(head1!=null &&head2!=null){
            if(head1.data>=head2.data){
                
                tail.next=head1;
                tail=head1;
                head2=head2.next;
            }else if(head1.data<=head2.data){
               
                tail.next=head2;
                tail=head2;
                 head1=head1.next;
            }
        }
        if(head1==null){
          tail.next=head2;  
        }else{
            tail.next=head1; 
        }
        
        
        
        
        return head;
	}

}