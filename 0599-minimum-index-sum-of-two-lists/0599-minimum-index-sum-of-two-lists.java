import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        int n = list1.length;
        int m = list2.length;

        int min = Integer.MAX_VALUE;

        // find minimum index sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;
                    min = Math.min(min, sum);
                }
            }
        }

        // find all strings having that minimum sum
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (list1[i].equals(list2[j])) {

                    int sum = i + j;
                    if (sum == min) {
                        ans.add(list1[i]);
                    }
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}