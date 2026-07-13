class Solution {
public:
    vector<string> letterCombinations(string digits) {
         if (digits.empty())
            return {};

        vector<string> ans;

        vector<string> mp = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        string temp = "";

        function<void(int)> solve = [&](int index) {
            if (index == digits.size()) {
                ans.push_back(temp);
                return;
            }

            for (char ch : mp[digits[index] - '0']) {
                temp.push_back(ch);
                solve(index + 1);
                temp.pop_back();
            }
        };

        solve(0);

        return ans;
    }
};