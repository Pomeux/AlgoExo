
class Solution {
    public int missingNumber(int[] nums) {
        int sum=Arrays.stream(nums).reduce(0,(a,b)->(a+b));
        int n=nums.length;
        int maxSum=n*(n+1)/2;
       
        return maxSum-sum;
    }
}
