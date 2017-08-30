  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode q=l1,p=l2,curr=head;
        int carry=0;
        while(q!=null||p!=null)
        {
            int x=(q!=null)?q.val:0;
            int y=(p!=null)?p.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(q!=null)q=q.next;
            if(p!=null)p=p.next;
        }
        if(carry>0)
        {
            curr.next=new ListNode(carry);
        }
        return head.next;
    }
}