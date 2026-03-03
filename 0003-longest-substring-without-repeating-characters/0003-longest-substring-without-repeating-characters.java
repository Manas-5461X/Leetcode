class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        int l = 0 ;
        int r = 0 ;
        int ans = 0;

        while(r < n){
            char ch = s.charAt(r);
            while(hs.contains(ch)){
                char c = s.charAt(l);
                hs.remove(c);
                l++ ;
            }
            hs.add(ch);
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans ;
    }
}