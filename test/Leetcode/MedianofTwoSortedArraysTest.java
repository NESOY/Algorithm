package Leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianofTwoSortedArraysTest {

    @Test
    public void test() {
        MedianofTwoSortedArrays app = new MedianofTwoSortedArrays();
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7};
        assertEquals(4, app.findMedianSortedArrays(nums1, nums2));
        assertEquals(4, app.findMedianSortedArrays(nums2, nums1));
    }
}