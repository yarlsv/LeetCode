package easy;

import helper_elements.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode current = new ListNode(0);
        ListNode result = current;


        while(list1 != null || list2 != null) {
            if(list1 != null && list2 != null) {
                if(list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
            } else if(list1 != null) {
                current.next = list1;
                list1 = list1.next;
            } else if(list2 != null) {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        return result.next;
    }
}
