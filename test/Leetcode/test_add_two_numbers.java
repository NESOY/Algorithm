package Leetcode;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class test_add_two_numbers {
    @Test
    public void 한자리_수를_더할수있다() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6);
        add_two_numbers solution = new add_two_numbers();

        ListNode result = solution.addTwoNumbers(node1, node2);

        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    public void 두자리_수_한자리_수를_더할수있다() {
        ListNode node1 = new ListNode(1);

        ListNode node2 = new ListNode(9);
        node2.next = new ListNode(9);
        add_two_numbers solution = new add_two_numbers();

        ListNode result = solution.addTwoNumbers(node1, node2);

        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
    }

    @Test
    public void 세자리_수_한자리_수를_더할수있다() {
        ListNode node1 = new ListNode(1);

        ListNode node2 = new ListNode(9);
        node2.next = new ListNode(9);
        node2.next.next = new ListNode(9);
        add_two_numbers solution = new add_two_numbers();

        ListNode result = solution.addTwoNumbers(node1, node2);

        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(0, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }

    @Test
    public void 두자리_수끼리_더할수있다() {
        ListNode node1 = new ListNode(4);
        node1.next = new ListNode(4);
        ListNode node2 = new ListNode(6);
        node2.next = new ListNode(4);

        add_two_numbers solution = new add_two_numbers();

        ListNode result = solution.addTwoNumbers(node1, node2);
        assertEquals(0, result.val);
        assertEquals(9, result.next.val);
    }
}
