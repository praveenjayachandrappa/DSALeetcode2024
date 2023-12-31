import java.util.Stack;

public class IntersectionOfTwoLinkedLists {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Stack<ListNode> stackA=new Stack();

        Stack<ListNode> stackB=new Stack();

        ListNode p1=headA,p2=headB;

        while (p1!=null){
            stackA.push(p1);
            p1=p1.next;
        }

        while (p2!=null){
            stackB.push(p2);
            p2=p2.next;
        }

        ListNode interSectingNode=null;
        while (!stackA.isEmpty() && !stackB.isEmpty()){

            if(stackA.peek() != stackB.peek()){
                return interSectingNode;
            }

            interSectingNode=stackA.pop();
            stackB.pop();
        }

        return interSectingNode;
    }
}
