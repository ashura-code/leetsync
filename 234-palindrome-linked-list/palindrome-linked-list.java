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
    public boolean isPalindrome(ListNode head) {

        ListNode dummy = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while(fast!=null && fast.next!=null) { 
            fast = fast.next.next;
            slow = slow.next;
        }


        ListNode prev = null;
        while(slow!=null){ 
              ListNode temp = slow.next;
              slow.next = prev;
              prev = slow;
              slow = temp;   
        }

        ListNode left = head;
        ListNode right = prev;

        while(left!=null && right!=null){
             if(left.val != right.val){
                 return false;
             }
             left = left.next;
             right = right.next;
        }

        return true;

        

        
    }
}