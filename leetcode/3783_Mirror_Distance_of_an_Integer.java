class Solution {
    public int mirrorDistance(int n) {
        
        StringBuilder s=new StringBuilder(new Integer(n).toString()).reverse();
        System.out.println(s);
        return Math.abs(n-Integer.parseInt(s.toString()));
    }
}
