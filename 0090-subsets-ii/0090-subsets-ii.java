class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        fun(nums, 0, new ArrayList<>());
        return ans;
    }

    private void fun(int[] a, int idx, List<Integer> al) {
        ans.add(new ArrayList<>(al));
        for (int i = idx; i < a.length; i++) {

            // Skip duplicate elements at the same level
            if (i > idx && a[i] == a[i - 1]) {
                continue;
            }
            al.add(a[i]);
            fun(a, i + 1, al);
            // Backtrack
            al.remove(al.size() - 1);
        }
    }
}