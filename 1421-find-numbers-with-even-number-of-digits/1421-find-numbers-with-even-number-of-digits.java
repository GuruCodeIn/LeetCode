class Solution {
    public int findNumbers(int[] nums) {
         int dig=0;
        for (int j : nums) {
            int count = 0;
            int n = j;
            while (n != 0) {
                int rem = n % 10;
                count = count + 1;
                n /= 10;
            }
            if (count % 2 == 0) {
                dig += 1;
            }
        }
        return dig;
    }
}
