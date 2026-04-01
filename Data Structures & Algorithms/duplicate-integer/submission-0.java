class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicateNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (duplicateNums.contains(nums[i])) {
                return true;
            } else {
                duplicateNums.add(nums[i]);
            }
        }
        return false;
    }
}