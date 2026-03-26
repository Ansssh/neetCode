package binarySearch.question7;

class Solution {
    // So, the approach is to find the partition of elements in both arrays that mark the middle point of combined array, and divide the arrays such that the left side is always heavier 
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] a = nums2;
            nums2 = nums1;
            nums1 = a;
        }
        int n = nums1.length + nums2.length;
        int half = (n + 1) / 2;
        int l = 0, r = nums1.length;
        while (l <= r) {
            int mid = l + (r-l)/2;

            int leftA = mid == 0 ? Integer.MIN_VALUE : nums1[mid - 1] ;
            int rightA = mid >= nums1.length ? Integer.MAX_VALUE : nums1[mid];
            int leftB = half - mid == 0 ? Integer.MIN_VALUE : nums2[half - mid - 1];
            int rightB = half - mid >= nums2.length ? Integer.MAX_VALUE : nums2[half - mid];
            // Left A should be smaller than Right B && Left B should be smaller than Right A
            if (leftA > rightB) {
                r = mid - 1;
            }else if (leftB > rightA) {
                l = mid + 1;
            }else{
                if (n % 2 == 0) {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB))/2.0;
                }else{
                    return Math.max(leftA, leftB);
                }
            }
        }
        return -1;
    }
}

public class FindMedian {
    public static void main(String[] args) {
        Solution x = new Solution();
        // System.out.println(x.findMedianSortedArrays(
        // new int[]{3, 7, 15, 22, 38, 41, 49, 50, 62, 75, 81, 84, 93, 99},
        // new int[]{12, 29, 45, 67, 88, 91}
        // ));
        System.out.println(x.findMedianSortedArrays(
        new int[]{1,2},
        new int[]{3}
        ));
        // System.out.println(x.findMedianSortedArrays(
        //     new int[] { 1, 2, 3, 4, 5 },
        //     new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }
        // ));
    }
}
