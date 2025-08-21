class Solution {
    public int removeElement(int[] nums, int val) {
        int a1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[a1] = nums[i];
                a1++;
            }
        }
        return a1;
    }
}