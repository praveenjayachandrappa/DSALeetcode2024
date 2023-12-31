package doublyLinkedList;

import java.util.List;

public class DoublyLinkedList {

    class ListNode{

        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val){
            this.val=val;
            this.prev=this.next=null;
        }
    }

    private ListNode head;

    public DoublyLinkedList(){
        this.head=null;
    }
    public int length(ListNode ptr){

        if(ptr==null) return 0;

        return length(ptr.next)+1;
    }
    public void create(int[] A, int n){

        this.head=new ListNode(A[0]);
        ListNode ptr=head;

        for (int i=1;i<n;i++){
            ListNode t=new ListNode(A[i]);
            t.next=ptr.next;
            t.prev=ptr;
            ptr.next=t;
            ptr=t;
        }
    }

    public ListNode insert(ListNode first,int index,int x){

        if(index < 0 || index > length(first)){
            return first;
        }
        //inserting at first Node when index is 0

        if(index==0){
            ListNode t=new ListNode(x);
            t.next=first;
            t.prev=null;
            first.prev=t;
            first=t;
            return first;
        }
        else{
            ListNode ptr=first;
            for (;index-1>0;index--){

                ptr=ptr.next;
            }
            ListNode t=new ListNode(x);
            t.next=ptr.next;
            t.prev=ptr;
            if(ptr.next!=null) ptr.next.prev=t;
            ptr.next=t;
            return first;
        }

    }

    public void display(){

        ListNode ptr=this.head;
        while (ptr!=null){
            System.out.print(ptr.val+"->");
            ptr=ptr.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {

        int[] A={10,20,30,40,50,60,70};
        int n=7;
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.create(A,n);
        obj.display();
        System.out.println("Deleting a node based on index");
        int delete = obj.delete( 10);
        System.out.println(delete);
        obj.display();
    }

    public int delete(int index) {
        //DoublyLinkedList doublyLinkedList=this;

        if(index < 1 || index > length(head)){
            return -1;
        }
        ListNode ptr;
        if(index==1){
            ptr=this.head;
            head=head.next;
            if(head!=null)
                head.prev=null;
            return ptr.val;
        }
        else{
            ptr=head;
            for (int i = 0; i < index-1; i++) {
                ptr=ptr.next;
            }

            ptr.prev.next=ptr.next;
            if(ptr.next!=null)
                ptr.next.prev=ptr.prev;
            return ptr.val;
        }
    }
}
