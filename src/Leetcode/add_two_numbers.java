package Leetcode;

public class add_two_numbers {
    /*
        @ Time Complexity : O(n)
        @ Space Complexity : O(n)
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode tail = null;
        ListNode firstPointer = l1;
        ListNode secondPointer = l2;


        int additional = 0;
        while (firstPointer != null || secondPointer != null || additional != 0) {
            int firstValue = firstPointer == null ? 0 : firstPointer.val;
            int secondValue = secondPointer == null ? 0 : secondPointer.val;

            int value = (firstValue + secondValue + additional) % 10;
            additional = (firstValue + secondValue + additional) / 10;

            firstPointer = firstPointer == null ? null : firstPointer.next;
            secondPointer = secondPointer == null ? null : secondPointer.next;

            if (ans == null) {
                ans = new ListNode(value);
                tail = ans;
            } else {
                tail.next = new ListNode(value);
                tail = tail.next;
            }
        }

        return ans;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}