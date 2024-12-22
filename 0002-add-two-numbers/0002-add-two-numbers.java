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
 
        // Dummy head to start building the result linked list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Traverse both linked lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start with the carry from the previous step
            
            // Add the values from l1 and l2 if they are not null
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Update carry for the next iteration
            carry = sum / 10;
            
            // Create the new node with the current digit
            current.next = new ListNode(sum % 10);
            current = current.next;  // Move to the next node
        }
        
        // Return the node after the dummy head
        return dummyHead.next;
    
    }
}