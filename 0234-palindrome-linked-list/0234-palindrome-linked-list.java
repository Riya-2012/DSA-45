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
    public ListNode getMiddle(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null&&f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
     public ListNode reverseList(ListNode head) {
        if (head==null|| head.next==null){
            return head;
        }
       ListNode NHead=reverseList(head.next);
            head.next.next=head;
            head.next=null;
            return NHead;
        
    }
   
        public boolean isPalindrome(ListNode head) {
            if(head==null||head.next==null){
                return true;

            }
            ListNode Fs=head;
            ListNode Fe=getMiddle(head);
            ListNode Ss=reverseList(Fe.next);
            while(Ss!=null){
                if(Ss.val!=Fs.val){
                    return false;
                }
                Ss=Ss.next;
                Fs=Fs.next;
            }
        return true;

    }
}