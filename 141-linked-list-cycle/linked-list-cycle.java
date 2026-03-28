public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowptr=head;
        ListNode fastptr=head;

        while(slowptr!=null && fastptr!=null && fastptr.next!=null){
        slowptr=slowptr.next;
        fastptr=fastptr.next.next;

        if(slowptr==fastptr)
        {
            return true;
        }
        }
        return false;
    }
}