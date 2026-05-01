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

    public int length(ListNode a){
        ListNode h = a;
        int count = 0;
        while(h!=null){
            count++;
            h = h.next;
        }
        return count;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int len = length(head);
        k = k % len;

        if (k == 0) return head;

        int diff = len - k - 1;

        ListNode temp = head;
        while(temp!=null && diff > 0){
            temp = temp.next;
            diff--;
        }

        ListNode next = temp.next;
        temp.next = null;
        ListNode pointNext = next;

        while(pointNext.next!=null){
            pointNext = pointNext.next;
        }

        pointNext.next = head;
        return next;
    }
}