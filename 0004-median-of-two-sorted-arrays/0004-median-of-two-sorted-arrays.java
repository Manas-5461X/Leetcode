class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = n + m;
        int res[] = new int[k];
        int i = 0; // travelling nums1 
        int j = 0; // travelling nums2
        int idx = 0; // travelling res 

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                res[idx] = nums1[i];
                idx++;
                i++;
            } else {
                res[idx] = nums2[j];
                idx++;
                j++;
            }
        }

        while (j < m) {
            res[idx] = nums2[j];
            idx++;
            j++;
        }

        while (i < n) {
            res[idx] = nums1[i];
            idx++;
            i++;
        }

        // after merging finding the mid value 

        if (k % 2 == 1) {
            return res[k / 2];
        } else {
            return (res[k / 2 - 1] + res[k / 2]) / 2.0;
        }

    }
}