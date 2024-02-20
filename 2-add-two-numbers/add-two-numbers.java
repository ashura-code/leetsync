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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode res = new ListNode(0);
          ListNode end = res;
          int carry = 0;
          int ans = 0;

          while(l1!=null || l2!=null || carry!=0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            ans = val1 +val2 + carry;
            res.next = new ListNode(ans % 10);
            carry = (int)Math.floor(ans/10);
            res = res.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
          }

          return end.next;




  

    }
}