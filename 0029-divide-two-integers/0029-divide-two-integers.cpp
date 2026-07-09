class Solution {
public:
    int divide(int dividend, int divisor) {
        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        long long dividendValue = llabs((long long)dividend);
        long long divisorValue = llabs((long long)divisor);

        long long quotient = 0;

        while (dividendValue >= divisorValue) {

            long long temp = divisorValue;
            long long multiple = 1;

            while ((temp << 1) <= dividendValue) {
                temp <<= 1;
                multiple <<= 1;
            }

            dividendValue -= temp;
            quotient += multiple;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            quotient = -quotient;
        }

        return (int)quotient;
    }
};