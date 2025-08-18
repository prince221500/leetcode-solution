class Solution {
public int rob(int[] nums) {
    int a = nums.length;
    if(nums==null || a==0) return 0;
    if(a==1) return nums[0];
    if(a==2) return Math.max(nums[0], nums[1]);
    int[] d = new int[a];
    d[0] = nums[0];
    d[1]=Math.max(nums[1], nums[0]);
    for(int i=2;i<a;i++) {
        d[i]=Math.max(d[i-2]+nums[i], d[i-1]);
    }
    return d[a-1];
}

}