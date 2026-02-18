class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) set1.add(i);

        HashSet<Integer> intersect = new HashSet<>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                intersect.add(i);
            }
        }

        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index++] = num;
        }
        return result;
    }
}