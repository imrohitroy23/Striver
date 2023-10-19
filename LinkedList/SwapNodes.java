public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null) return head;
        ListNode temp=head.next.next;
            ListNode fir=head.next;
            ListNode se=head;
        head=fir;
        head.next=se;
        head.next.next=swapPairs(temp);
        return head;
    }
}
