class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for(int x : nums) hs.add(x);
        int ans = 0;

        for(int x : hs){
            if(!hs.contains(x - 1 )){
                int len = 1;
                while(hs.contains(x + len)) len++ ;
                ans = Math.max(ans, len);
            }
        }
        return ans ;
    }
}