public class AddTwoLinkedLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum,carry=0;

        ListNode head=new ListNode();

        ListNode cur=head;

        while(l1!=null && l2!=null){


            sum=carry+l1.val+l2.val;

            carry=sum / 10;

            sum=sum % 10;

            cur.next=new ListNode(sum);

            cur=cur.next;

            l1=l1.next;

            l2=l2.next;

        }

        while(l1!=null){

            sum=carry+l1.val;

            carry=sum /10;

            sum= sum % 10;

            cur.next=new ListNode(sum);

            cur=cur.next;

            l1=l1.next;
        }


        while(l2!=null){

            sum=carry+l2.val;

            carry=sum /10;

            sum= sum % 10;

            cur.next=new ListNode(sum);

            cur=cur.next;
            l2=l2.next;
        }

        if(carry !=0){

            cur.next=new ListNode(carry);
        }

        return head.next;
    }
}
