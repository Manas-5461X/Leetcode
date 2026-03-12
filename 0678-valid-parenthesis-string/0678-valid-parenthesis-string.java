class Solution {

    public boolean checkValidString(String s) {
        /*         
        low  = minimum possible open brackets
        high = maximum possible open brackets
        (  → increase open
        )  → decrease open
        "" → ignore */

        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low--;
                high--;
            } else { // '*'
                low--; // treat as ')'
                high++; // treat as '('
            }

            if (high < 0)
                return false;

            if (low < 0)
                low = 0;
        }

        return low == 0;

    }
}
