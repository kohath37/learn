/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int sum;
        int location=0;
        ListNode node=new ListNode(0);
        node=head;
        for(sum=0;node!=null;sum++){
            node=node.next;
        }
        location=sum-n;
        node=dummy;
        while(location>0){
            location--;
            node=node.next;
        }
        node.next=node.next.next;
        return dummy;
    }
}