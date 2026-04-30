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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        // Finding the middle of Linked List
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        // Merging the Middle and First part
        ListNode merged = mergeTwoLists(left,right);
        return merged;

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(5);
        ListNode list = head;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ListNode a = new ListNode(list1.val);
                list.next = a;
                list = a;
                list1 = list1.next;
            }
            else{
                ListNode a = new ListNode(list2.val);
                list.next = a;
                list = a;
                list2 = list2.next;
            }
        }
        if(list1!=null){
            list.next = list1;
        }
        else{
            list.next = list2;
        }
        head = head.next;
        return head;
    }
}