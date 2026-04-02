class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int j=nums.length;
        boolean res=false;
        for(int i=0;i<nums.length;i++){
            if(i>max) return false;
            max=Math.max(max,nums[i]+i);
        }
        return true;
    }
}