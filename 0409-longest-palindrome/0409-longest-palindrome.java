class Solution {
    public int longestPalindrome(String s) {
        // need longest plaindrome - upper or lowercase  - lets try something with freq of letters 

        HashMap<Character , Integer> map = new HashMap<>() ;

        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1) ;
        }

        boolean odd = false ;
        int res = 0 ;

         for (char c : map.keySet()) {
            int val = map.get(c) ;

            if(val % 2 == 0){
                res += val ; // agar freq even hai toh directly length mai add kardo
            }else {
                odd = true ;
            }
         }

         if(odd == false){
            return res ;
         }

          // handing odd seperately - if freq of any char is odd lets say 
          /*  freq[a] = 5 
              so here we can take pairs as they are even they can make palindrome so 5 - 1 = 4 two pairs taken so add 4 

              now finally all other odds will have freq 1 then just take one of them so return final answer as , ans + 1 as we can add any single char in even plaindrome 
           */
          
         for (char c : map.keySet()) {
            int val = map.get(c) ;

            if(val %2 == 1){
                res += val - 1 ;
            }
         }
        return res + 1 ;
    }
}