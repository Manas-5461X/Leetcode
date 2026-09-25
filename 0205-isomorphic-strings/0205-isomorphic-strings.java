class Solution {
    public boolean isIsomorphic(String s, String t) {

        int n = s.length();
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        for (int i = 0; i < n; i++) {

            char chS = s.charAt(i);
            char chT = t.charAt(i);

            // Check s -> t
            if (map.containsKey(chS)) {
                if (map.get(chS) != chT) {
                    return false;
                }
            } else {
                map.put(chS, chT);
            }

            // Check t -> s
            if (reverse.containsKey(chT)) {
                if (reverse.get(chT) != chS) {
                    return false;
                }
            } else {
                reverse.put(chT, chS);
            }
        }

        return true;
    }
}