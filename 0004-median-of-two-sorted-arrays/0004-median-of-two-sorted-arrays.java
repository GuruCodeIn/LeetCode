class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] mergearr = merge(nums1, nums2);
        return findmedian(mergearr);
    }
    static double findmedian(int[] mergearr) {
        int size = mergearr.length;
        if (size % 2 != 0) {
            return mergearr[size / 2];
        } else {
            int mid1 = mergearr[(size / 2) - 1];
            int mid2 = mergearr[size / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
    static int[] merge(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        // Append remaining elements from nums1 if any
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        // Append remaining elements from nums2 if any
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }
}