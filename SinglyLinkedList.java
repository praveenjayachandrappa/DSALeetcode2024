public class SinglyLinkedList {

    static class ListNode {

        int val;

        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


    ListNode head;

    public void insert(int[] A) {

        head = new ListNode(A[0]);

        ListNode cur = head;

        for (int i = 1; i < A.length; i++) {
            cur.next = new ListNode(A[i]);
            cur = cur.next;
        }

    }

    public void display() {

        ListNode ptr = head;

        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }

    public void reverse() {
        ListNode cur = head;

        ListNode prev = null;
        while (cur != null) {

            ListNode next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left==right) return head;

        ListNode cur = head;
        ListNode prev = null;
        while (left > 1) {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }

        ListNode connection=prev;
        ListNode tail=cur;
        while (right > 0) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            right--;
        }

        if(connection!=null)
            connection.next=prev;
        else
            head=prev;

        tail.next=cur;
        return head;
    }


    public ListNode reverseKGroup(ListNode head, int k) {

        // reverse the nodes of the list k at a time and return the modified list .


        if(head==null || k==1) return head;


        ListNode dummy=new ListNode(-1);

        dummy.next=head;


        int totalNodes=0;

        ListNode cur=head;

        while (cur!=null){

            totalNodes++;
            cur=cur.next;
        }


        cur=head;

        ListNode prev=dummy;


        ListNode next=null;


        while (totalNodes >=k){

            cur=prev.next;
            next=cur.next;

            for(int i=1;i<k;i++){


                cur.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=cur.next;
            }
            prev=cur;
            totalNodes-=k;
        }

        return dummy.next;

    }


    public static void main(String[] args) {

        SinglyLinkedList obj = new SinglyLinkedList();

        int[] A = {1,2,3,4,5};
        obj.insert(A);

        obj.reverseKGroup(obj.head,3);

        obj.display();


            }
    }

