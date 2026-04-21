import java.util.*;
class Sol{
    public int fairPairs(int[] nums,int lower,int upper){
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int n=0;
        while(i<j){
            if((nums[i]+nums[j])>=lower || (nums[i]+nums[j])<=upper){
                n++;
                if((nums[i]+nums[j])>=lower){
                    i++;
                }
                if((nums[i]+nums[j])<=upper){
                    j--;
                        
                }
            }
            if((nums[i]+nums[j])<lower){
                i++;
            }
            if((nums[i]+nums[j])>upper){
                j--;
                
            }
            //System.out.println(".");
        }
        return n;
    }
}
public class Test{
    public static void main(String[] args) {
        Sol s=new Sol();
        int[] nums={0,1,7,4,4,5};
        int n=s.fairPairs(nums, 3, 6);
        System.out.println(n);

    }
}