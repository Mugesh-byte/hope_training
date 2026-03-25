class Solution {
    public boolean canAliceWin(int[] nums) {
        int sdigit=0;
        int ddigit=0;
        for(int i:nums){
            if(i<10){
                sdigit+=i;
            }
            if(i>=10){
                ddigit+=i;
            }
        }
        return sdigit!=ddigit;
    
    }
}