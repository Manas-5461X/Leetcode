class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        // Count frequency
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Check whether frequencies are unique
        for (int value : map.values()) {
            if (hs.contains(value)) {
                return false;
            }
            hs.add(value);
        }

        return true;
    }
}