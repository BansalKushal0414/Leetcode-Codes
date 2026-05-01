class Solution {
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public ListNode getKth(ListNode node, int k){
        k-=1;
        while(node != null && k > 0){
            node = node.next;
            k--;
        }
        return node;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prevLast = null;

        while(curr != null){
            ListNode kth = getKth(curr, k);

            if(kth == null){
                if(prevLast != null){
                    prevLast.next = curr;
                }
                break;
            }

            ListNode nextGroup = kth.next;
            kth.next = null;

            ListNode newHead = reverse(curr);

            if(curr == head){
                head = newHead;
            } else {
                prevLast.next = newHead;
            }

            prevLast = curr;
            curr = nextGroup;
        }

        return head;
    }
}