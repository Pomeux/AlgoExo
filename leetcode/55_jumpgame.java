class Solution {
    public boolean canJump(int[] nums) {
        boolean[] etiquette=new boolean[nums.length];
        if(nums.length<=1)
            return true;
        return parcoursProfondeur(nums,0,nums.length-1,etiquette);
    }
  
    
    public boolean parcoursProfondeur(int[] nums,int p,int f,boolean[] etiquette) {
        
       
        if(p==f) {
          
            return true;
        }
        if(!etiquette[p]) {
            etiquette[p]=true;
            for(int i=1;i<=nums[p];i++) {
          
                if(p+i<nums.length) {
               
                    if(parcoursProfondeur(nums,p+i,f,etiquette)) {
                        return true;
                    }
                    
                    
                }
            }
        }
        return false;
    }
}
