class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>() ;

        for(char x: text.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1) ;
        }

        // balloon

        HashMap<Character,Integer> need = new HashMap<>() ;
 
        String b = "balloon" ;
        for(char x: b.toCharArray()){
            need.put(x, need.getOrDefault(x,0)+1) ;
        }

        int ans = Integer.MAX_VALUE;

        for (char c : need.keySet()) {
            int available = map.getOrDefault(c, 0);
            int required = need.get(c);
            int possible = available / required;
            ans = Math.min(ans, possible);
        }

       return ans ; 
    }
}