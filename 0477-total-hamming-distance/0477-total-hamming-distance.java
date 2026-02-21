class Solution {

    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < 32; i++) { // i = bit position
            int count1 = 0;

            for (int j = 0; j < n; j++) { // j = array index  count set bit for every element
                if ((nums[j] & (1 << i)) != 0) {
                    count1++;
                }
            }

            int count0 = n - count1; // count of unset bit

            ans += (count1 * count0 );
        }

        return ans;
    }
}
