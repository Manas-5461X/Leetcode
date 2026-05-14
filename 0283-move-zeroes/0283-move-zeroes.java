class Solution {
    public void moveZeroes(int[] nums) {
        // we are building the "non-zero section" at the front so we are swapping when it is non zero 

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}