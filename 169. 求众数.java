class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Integer res = null;
        
        for (Integer x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) > nums.length / 2) {
                res = x;
                break;
            }
        }
        return res;
    }
}