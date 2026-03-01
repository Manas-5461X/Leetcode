class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;
     /*    HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
           if (map.get(nums[i]) > 1) {
                return true ;
            }
        }
        return false;
 */

         HashSet<Integer> hs = new HashSet<>();

         for(int x : nums){
            hs.add(x);
         }
         if(n == hs.size())return false;
         else return true  ;
    }
}