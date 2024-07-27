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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)
        return;
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null&& p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        ListNode mid=p1;
        ListNode R=p1.next;
        while(R.next!=null){
            ListNode current=R.next;
            R.next=current.next;
            current.next=mid.next;
            mid.next=current;
        }
        p1=head;
        p2=mid.next;
        while(p1!=mid){
            mid.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=mid.next;
        }

    }
}