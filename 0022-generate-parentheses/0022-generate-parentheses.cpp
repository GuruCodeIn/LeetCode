class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        string temp = "";

        function<void(int, int)> solve = [&](int open, int close) {

            if (temp.size() == 2 * n) {
                ans.push_back(temp);
                return;
            }

            if (open < n) {
                temp.push_back('(');
                solve(open + 1, close);
                temp.pop_back();
            }

            if (close < open) {
                temp.push_back(')');
                solve(open, close + 1);
                temp.pop_back();
            }
        };

        solve(0, 0);

        return ans;
    }
};