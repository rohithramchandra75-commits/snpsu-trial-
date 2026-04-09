package Module10;

class ListNode1{
    int val;
    ListNode1 next;

    ListNode1(int val){
        this.val=val;
    }
}

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head){

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args){

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);

        a.next=b;
        b.next=c;
        c.next=b;

        System.out.println(hasCycle(a));
    }
}
