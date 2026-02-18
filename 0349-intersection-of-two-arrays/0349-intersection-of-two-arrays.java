class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!al.contains(nums1[i])) {
                        al.add(nums1[i]);
                    }
                }
            }
        }

        int[] result = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            result[i] = al.get(i);
        }
        return result;
    }
}
