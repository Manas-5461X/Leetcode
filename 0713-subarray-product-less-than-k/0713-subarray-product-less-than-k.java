class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int num = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;

            for (int j = i; j < n; j++) {
                prod *= nums[j];

                if (prod < k) {
                    num++;
                } else {
                    break;
                }
            }
        }

        return num;
    }
}