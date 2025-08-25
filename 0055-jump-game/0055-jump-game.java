class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        int m = 0;
      for (int index =0; index < n-1 && m>= index; index++) {
          if(m < index+nums[index])  {
              m = index+nums[index];

          }
          if(m>=n-1) {
              return true;
          }


      }
      return false;
    }
}