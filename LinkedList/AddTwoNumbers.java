public class AddTwoNumbers {
    public ListNode reverse(ListNode head) {
        ListNode curr=head;
       ListNode prev=null,next=null;
       while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       return prev;
   }
   //Function to add two numbers represented by linked list.
  public ListNode addTwoNumbers(ListNode first, ListNode second){
       // code here
       // return head of sum list
       ListNode l1=(first);
       ListNode l2=(second);
       ListNode dum=new ListNode(-1);
       ListNode tail=dum;
       int c=0;
       while(l1!=null || l2!=null){
           int sum=c;
           
           if(l1!=null){
               sum+=l1.val;
               l1=l1.next;
           }
           if(l2!=null){
               sum+=l2.val;
               l2=l2.next;
           }
           ListNode curr=new ListNode(0);
           curr.val=sum%10;
           c=sum/10;
           tail.next=curr;
           tail=tail.next;
       }
       if(c>0) tail.next=new ListNode(c);
       return (dum.next);       
   }
}
