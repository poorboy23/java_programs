package codingninjas;

public class sortEvenOdd {
	public static LinkedListNode<Integer> sortEvenOdd2(LinkedListNode<Integer> head) {
        if(head==null||sortEvenOdd.length(head)==1){
            return head;
        }
        LinkedListNode<Integer> get=sortEvenOdd2(head.next);
            if(get.data%2==0 && head.data%2==0){
                get.next=head;
                return get;
            }else if( get.data%2==0 &&head.data%2!=0 ){
                head.next=get;
                return head;
                
            }else if(head.data%2==0&&get.data%2!=0){
              LinkedListNode<Integer> temp=get;
                while(temp.next!=null){
                    temp=temp.next; 
                }
                temp.next=head;
                return get;
            }else{
                head.next=get;
                return head;
            }
        
        
        

	}
    public static int length(LinkedListNode<Integer> head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}
