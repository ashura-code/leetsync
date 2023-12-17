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
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1) {

            int sum = 0;
            int added_value = 0;

            if (l1 != null) {
             added_value += l1.val;
             l1 = l1.next;
            }

            if (l2 != null) {
            added_value += l2.val;
            l2 = l2.next;
             }         

            added_value += carry;
            carry = added_value / 10;
            ListNode node = new ListNode(added_value%10);

            curr.next = node;
            curr = curr.next;

        }

        return ans.next;


    }
}