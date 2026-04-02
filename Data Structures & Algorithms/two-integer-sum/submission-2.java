class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compute = target - nums[i];

            if (numMap.containsKey(compute)) {
                return new int[] { numMap.get(compute), i };
            }

            numMap.put(nums[i], i);
        }

        return new int[] {}; 
    }
}