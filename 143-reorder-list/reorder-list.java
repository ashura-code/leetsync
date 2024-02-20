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

    public ListNode reverseList(ListNode head){ 
            ListNode current = head;
            ListNode previous = null;
            ListNode nxt = null;

            while(current!=null) {
                 nxt = current.next;
                 current.next = previous;
                 previous = current;
                 current = nxt;
            }

            return previous;
         
    }

    public void MergeLists(ListNode first,ListNode second){

        while(second != null) {
             ListNode temp1 = first.next;
             ListNode temp2 = second.next;

             first.next = second;
             second.next = temp1;

             first = temp1;
             second = temp2;

        }

    }
 


    public void reorderList(ListNode head) {

        if(head.next != null){ 

            ListNode slow = head;
            ListNode fast = head;

            while(fast.next !=null && fast.next.next != null){ 
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode second_h = slow.next;
            slow.next = null; //cut the linked list

            //reverse the second half
            second_h = reverseList(second_h);
            MergeLists(head,second_h);


            

            








        }
           
        

        
    }
}