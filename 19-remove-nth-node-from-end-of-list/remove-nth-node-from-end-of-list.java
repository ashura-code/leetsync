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


 //three pointers ig
 //loop through the node find the end , find the middle
 // get the n;
 //say end = 5 and n = 2 , so the position from the start is 3;


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode len_finder = head;
        int length = 0;

        while(len_finder != null){ 
             len_finder = len_finder.next;
             length++;
        }

        int target_pos = length - n;
        
           if (target_pos == 0) {
            return head.next;
        }


    

        int temp_counter = 0;
        ListNode list = head;

        while (temp_counter < target_pos - 1) { 
             list = list.next;
             temp_counter++;
        }

        list.next = list.next.next;
        

        return head;
    }
}