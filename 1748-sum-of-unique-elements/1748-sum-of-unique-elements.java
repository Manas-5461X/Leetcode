class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])){

            if (map.get(nums[i]) > 1) {
                map.remove(nums[i]);
            }
            }
        }

        int sum = 0;
        for (int key : map.keySet()) {
            sum += key;
        }
        return sum;
    }
}