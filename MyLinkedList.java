import java.util.ArrayList;
import java.util.List;

class MyLinkedList {

    class ListNode {

        private int val;

        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;

    private int length;

    public MyLinkedList() {

        this.head = null;
        this.length = 0;

    }


    public int get(int index) {

        if (index < 0 || index > this.length-1)
            return -1;

        ListNode ptr = head;

        for (;index>0;index--){
            ptr=ptr.next;
        }
        return ptr.val;

    }

    public void addAtHead(int val) {
        ListNode node=new ListNode(val);
        node.next=head;
        head=node;
        length++;
    }

    public void addAtTail(int val) {

        if (length==0) {
            this.addAtHead(val);
            return;
        }
        else {
            ListNode ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = new ListNode(val);
        }
        this.length++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > length) return;

        if(index==0){
            this.addAtHead(val);
            return;
        }

        ListNode ptr=head;

        for (;index>1;index--){
            ptr=ptr.next;
        }
        ListNode node=new ListNode(val);
        node.next=ptr.next;
        ptr.next=node;
        length++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index > length-1) return;

        if(index == 0){
            head=head.next;
            length--;
        }
        else{
            ListNode ptr=head;
            for (;index>1;index--){
                ptr=ptr.next;
            }
            if(ptr.next!=null)
            ptr.next=ptr.next.next;
            length--;
        }
    }

    public void diplay() {

        while (this.head != null) {
            System.out.print(this.head.val + "->");
            this.head = this.head.next;
        }
    }

    public void display(ListNode ptr){

        if(ptr==null)
            return;
        System.out.print(ptr.val+"->");
        display(ptr.next);
    }

    public int sum(ListNode ptr){
        if(ptr==null) return 0;
        return sum(ptr.next)+ptr.val;
    }

    public int sum_iteratvie(){

        ListNode ptr=this.head;

        int sum=0;
        while (ptr!=null){

            sum+=ptr.val;
            ptr=ptr.next;
        }
        return sum;
    }

    public int max(ListNode ptr){
        if(ptr==null) return -1;

        int maxVal=ptr.val;
        ptr=ptr.next;

        while (ptr!=null){

            maxVal=Math.max(maxVal,ptr.val);
            ptr=ptr.next;
        }
        return maxVal;
    }

    public boolean search(int key){

        ListNode ptr=this.head;

        ListNode q=null;

        while (ptr!=null){

            if(ptr.val==key){
                if(q!=null){
                    q.next=ptr.next;
                    ptr.next=head;
                    head=ptr;
                }
                return true;
            }
            q=ptr;
            ptr=ptr.next;
        }
        return false;
    }

    //remove duplicates from sorted linked List


    public void removeDuplicates(){

        ListNode p=this.head;

        ListNode q=p.next;

        while (q!=null){
            if(p.val==q.val){
                p.next=q.next;
                q=p.next;
            }
            else{
                p=q;
                q=q.next;
            }
        }

    }

    public ListNode reverse(ListNode ptr){

        ListNode prev=null;

        ListNode next;

        while (ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return prev;
    }

    //reverse using elements of the list
    public void reverse_usingElements(ListNode head){
        List<Integer> list=new ArrayList<>();

        ListNode ptr=head;
        while (ptr!=null){
            list.add(ptr.val);
            ptr=ptr.next;
        }

        int i=list.size()-1;
        ptr=head;

        while (i>=0){

            ptr.val=list.get(i);
            i--;
            ptr=ptr.next;
        }
        this.display(head);
    }


    public void makeCircular(){

        ListNode ptr=this.head;

        while (ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=this.head;
    }

    public void displayCircularLinkedList(){

        ListNode ptr=this.head;

        if(ptr==null) return;

        do{
            System.out.print(ptr.val+"->");
            ptr=ptr.next;
        }while (ptr!=head);

        System.out.println();
    }

    static boolean flag=false;

    public void displayCircularLinkedList_recursive(ListNode ptr,ListNode head){

        if(ptr!=head || !flag){
            System.out.print(ptr.val+"->");
            ptr=ptr.next;
            flag=true;
            displayCircularLinkedList_recursive(ptr,head);
        }
        flag=false;
    }

    public static void main(String[] args) {


        MyLinkedList obj = new MyLinkedList();

        obj.addAtHead(1);
        obj.addAtTail(2);
        obj.addAtTail(7);
        obj.addAtTail(8);
        obj.addAtTail(9);
        //make cicular linked List
        obj.makeCircular();
        obj.displayCircularLinkedList();
        obj.displayCircularLinkedList_recursive(obj.head, obj.head);
        //obj.addAtIndex(2, 10);
       // obj.deleteAtIndex(3);
        //obj.display(obj.head);
       // obj.removeDuplicates();
        //System.out.println();
        //obj.diplay();
//        System.out.println(obj.sum(obj.head));
//
//        System.out.println(obj.sum_iteratvie());

//        System.out.println(obj.max(obj.head));
//
//        System.out.println(obj.search(7));
//        System.out.println(obj.search(7));
//        obj.diplay();
//        ListNode reverse = obj.reverse(obj.head);
//
//        System.out.println();
//        obj.display(reverse);
//        System.out.println();
//        System.out.println("Reverse using elements");
//        obj.reverse_usingElements(obj.head);

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */