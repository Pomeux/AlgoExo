class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>(nums.length);

        int[] tab = null;
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                tab=new int []{i,map.get(nums[i])};
                return tab;
            }
            map.put(target-nums[i],i);
        }
        return tab;
    }
}
