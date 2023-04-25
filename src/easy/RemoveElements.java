package easy;

import helper_elements.ListNode;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next = head;

        ListNode current = fakeNode;

        while(current != null && current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return fakeNode.next;
    }

}
