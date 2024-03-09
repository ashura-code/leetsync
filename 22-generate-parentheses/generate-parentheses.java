import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        recursive(0, 0, n, "");
        return ans;
    }

    private void recursive(int leftp, int rightp, int n, String temp) {
        if (leftp == rightp && leftp == n) {
            ans.add(temp);
            return;
        }

        if (leftp < n) {
            recursive(leftp + 1, rightp, n, temp + "(");
        }

        if (leftp > rightp) {
            recursive(leftp, rightp + 1, n, temp + ")");
        }
    }
}
