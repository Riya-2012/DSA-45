/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode F=dummy;
        ListNode S=dummy;
        for(int i=0;i<n;i++){
            S=S.next;

        }
        while(S.next!=null){
            F=F.next;
            S=S.next;
        }
        F.next=F.next.next;
        return dummy.next;
    }
}