class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateOneByOne("", res, n, n);
        return res;
    }
    
    public void generateOneByOne(String subList, List<String> res, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(subList);
            return;
        }
        if (left > 0) {
            generateOneByOne(subList + "(", res, left - 1, right);
        }
        if (right > left) {
            generateOneByOne(subList + ")", res, left, right - 1);
        }
    }
}