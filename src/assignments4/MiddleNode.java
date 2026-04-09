package Module10;

class ListNode2{
    int val;
    ListNode2 next;

    ListNode2(int val){
        this.val=val;
    }
}

public class MiddleNode {

    public static ListNode middleNode(ListNode head){

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args){

        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);
        a.next.next.next=new ListNode(4);

        System.out.println(middleNode(a).val);
    }
}
