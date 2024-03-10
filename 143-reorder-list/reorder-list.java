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

         ListNode slow = head;
         ListNode fast = head;

         while(fast.next!=null && fast.next.next!=null){ 
              slow = slow.next;
              fast = fast.next.next;
         }

         ListNode second = slow.next;
         ListNode first = head;
         slow.next = null;
         ListNode prev = null;

         while(second!=null){ 
              ListNode temp = second.next;
              second.next = prev;
              prev = second;
              second = temp;                   
         }

         second = prev;

         while(second!=null){  //deliberately second
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;

         }
    }
}