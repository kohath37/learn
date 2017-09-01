/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode head=new ListNode(0);
        ListNode a=l1,b=l2,curr=head;
        int carry=0;
        while(a!=null||b!=null)
        {
            int x=(a!=null)?a.val:0;
            int y=(b!=null)?b.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        if(carry>0){curr.next=new ListNode(carry);}
        return reverse(head.next);
    }
     /*反转链表函数*/
	 public ListNode reverse(ListNode nodehead){
         ListNode pre=null;
         while(nodehead!=null){
             ListNode next=nodehead.next;//记录保留当前节点的下一个节点的内存地址
             nodehead.next=pre;//当前节点指针域（原为下一个节点的内存地址）改为上一个节点的内存地址
             pre=nodehead;//上一个节点变为当前节点，为之后的循环做准备
             nodehead=next;//当前节点变为下一个节点，为之后的循环做准备
         }
         return pre;
    }
}