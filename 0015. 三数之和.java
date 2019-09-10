class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0 ) {
            return new ArrayList();
        }
        
        if (nums[0] == nums[nums.length - 1]) {
            result.add(Arrays.asList(nums[0], nums[0], nums[0]));
            return new ArrayList(result);
        }

        for (int i = 1; i < nums.length; i++) {
            
            set.clear();
            for (int j = 0; j < i; j++) {

                int tmp = -(nums[i] + nums[j]);
                if (set.contains(tmp)) {
                    result.add(Arrays.asList(tmp, nums[j], nums[i]));
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList(result);
    }
}