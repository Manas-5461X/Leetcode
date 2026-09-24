class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> mapR = new HashMap<>();
        HashMap<Character, Integer> mapM = new HashMap<>();

        for (char x : ransomNote.toCharArray()) {
            mapR.put(x, mapR.getOrDefault(x, 0) + 1);
        }

        for (char x : magazine.toCharArray()) {
            mapM.put(x, mapM.getOrDefault(x, 0) + 1);
        }

        for (char c : mapR.keySet()) {
            int need = mapR.get(c);
            int have = mapM.getOrDefault(c, 0);

            if (have < need) {
                return false;
            }
        }

        return true;
    }
}