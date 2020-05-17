public class Solution {
    public int Fibonacci(int n) {
        if (n <= 1) return n;
        int f = 0, g = 1;
        while (--n != 0) {
            g += f;
            f = g - f;
        }
        return g;
    }
}