package findCycle;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        ListNode n1=new ListNode(3);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(0);
        ListNode n4=new ListNode(4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;
        System.out.println(hasCycle(n1));
    }
    public static boolean hasCycle(ListNode head) {
        // create a HashSet for nodes
        HashSet<ListNode> visited=new HashSet<>();
        // set current to head
        ListNode current=head;
        while(current!=null){
            if (visited.contains(current)) return true;
            visited.add(current); // Why HashSet? Because I don't need any other value I am just going to hold the addresses of the nodes, nothing more
            current=current.next;
        }
        return false;
    }
}

/*

Problem:
• Given head, the head of a linked list, determine if the linked list has a cycle in it.
• There is a cycle in a linked list if there is some node in the list that can be reached again by
continuously following the next pointer. Internally, pos is used to denote the index of the node
that tail's next pointer is connected to. Note that pos is not passed as a parameter.
• Return true if there is a cycle in the linked list. Otherwise, return false.

Steps:
1. Create a HashSet
2. Start with head put nodes you visited in the HashSet
3. If your current node exists in HashSet, this means you have already visited that node and this is
your second time. In this case return true.
4. If you are done with the iteration and could not find a node visited twice, return false;

 */