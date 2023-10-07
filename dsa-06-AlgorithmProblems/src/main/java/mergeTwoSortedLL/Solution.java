package mergeTwoSortedLL;

public class Solution {

    public ListNode mergeTwoLists(ListNode curr1, ListNode curr2) {

        // create a dummy head Node;
        ListNode tempHead = new ListNode();
        ListNode prev = tempHead;

        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                prev.next = curr1;
                curr1 = curr1.next;
            } else {
                prev.next = curr2;
                curr2 = curr2.next;
            }
            prev = prev.next;
        }

        //now check if any leftover
        if (curr1 == null) prev.next = curr2;
        else prev.next = curr1;

        return tempHead.next;

    }
}
/*

Problem:
• You are given the heads of two sorted linked lists list1 and list2.
• Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of
the first two lists.
• Return the head of the merged linked list.

Steps:
• I need a variable to keep track of last added item to new list
• Create a temp new dummy Head;
• I need to keep track of the new head node
• Any leftover in one of lists will be added to the new list



 */