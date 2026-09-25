class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>() ;
        HashMap<Character, Integer> mapT = new HashMap<>() ;

        if(s.length() != t.length()) return false ;

        for(char x : s.toCharArray()){
            mapS.put(x,mapS.getOrDefault(x,0)+1);
        }

        for(char x : t.toCharArray()){
            mapT.put(x,mapT.getOrDefault(x,0)+1);
        }

        for(char c : mapS.keySet()){
            int val = mapS.get(c) ;
            int req = mapT.getOrDefault(c,0) ;

            if(val != req){
                return false ;
            }
        }
        return true ;
    }
}