class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                // skip duplicate j
                if (j > i + 1 && nums[j] == nums[j - 1])continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {

                    long csum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (csum == target) {
                        ArrayList<Integer> quadruplets = new ArrayList<>();
                        quadruplets.add(nums[i]);
                        quadruplets.add(nums[j]);
                        quadruplets.add(nums[k]);
                        quadruplets.add(nums[l]);
                        result.add(quadruplets);

                        k++;
                        l--;

                        // skip duplicate k
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        
                        // skip duplicate l
                        while (k < l && nums[l] == nums[l + 1]) l--;


                    } else if (csum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return result;
    }
}