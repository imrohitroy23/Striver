class ReverseLL{
    public ListNode reverseList(ListNode head) {
        ListNode c=head;
        ListNode p=null;
        
        ListNode n=null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
}