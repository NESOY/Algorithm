package Leetcode;

// @see https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianofTwoSortedArrays {
    // 정렬된 num1, num2를 주었을때 중간값을 찾아
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Min = nums1[0];
        int nums2Min = nums2[0];
        int nums1Max = nums1[nums1.length-1];
        int nums2Max = nums2[nums2.length-1];

        if(nums1Max < nums2Min || nums2Max < nums1Min) {
            double median = (double) (nums1Max + nums2Min) / 2;
            return Math.abs(nums1.length - nums2.length) % 2 == 0 ? median : ;
        }

        return -1;
    }
}
