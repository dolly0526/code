public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0) return 0;
        if (exponent == 0) return 1.0;
        
        double res = PowerCore(base, Math.abs(exponent));
        if (exponent < 0) return 1 / res;
        return res;
    }
    //base != 0, exponent > 0时
    private double PowerCore(double base, int exponent) {
        if (exponent == 1) return base;
        //二分迭代计算
        double res = PowerCore(base, exponent >> 1);
        res *= res;
        //exponent为奇数
        if ((exponent & 1) == 1) res *= base;
        return res;
    }
}