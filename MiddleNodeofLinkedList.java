class ListNode{

    int val;

    ListNode next;
    public ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class MiddleNodeofLinkedList {


    public ListNode middleNode(ListNode head) {

        if(head == null) return head;


        ListNode slow=head,fast=head;


        while(fast!=null && fast.next!=null){

            fast=fast.next.next;

            slow=slow.next;
        }

        return slow;


    }



//     public ListNode middleNode(ListNode head) {

//         if(head == null) return head;

//         int len=length(head);

//         int mid=len/2;

//         ListNode ptr=head;
//         while(mid>0){

//             ptr=ptr.next;
//             mid--;
//         }

//         return ptr;
//     }

//     private int length(ListNode ptr){

//         if(ptr==null) return 0;

//         return length(ptr.next)+1;
//     }
}
