class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1)
            return true;
        return parcoursProfondeur(nums,0,nums.length-1);
    }
  
    
    public boolean parcoursProfondeur(int[] nums,int p,int f) {
    
        for(int i=1;i<=nums[p];i++) {
            if(p+i<nums.length) {
                if(p+i==f) {
                    return true;
                }
                return parcoursProfondeur(nums,p+i,f);
                   
                
            }
        }
        return false;
    }
}
