class Solution {
    public boolean canJump(int[] nums) {
        int[][] graph=createMatrix(nums);
        return jump(graph,nums.length-1);
    }
    public boolean jump(int[][] graph,int p) {
        System.out.println(p);
        if(p==0)
            return true;

        for(int i=0;i<graph.length;i++) {
            if(graph[p][i]!=0) {
                return jump(graph,graph[p][i]-1);
            }
        }
        return false;
    }
    public int[][] createMatrix(int[] nums) {
        int[][] graph=new int[nums.length][nums.length];
        int n=nums.length;


        for(int i=0;i<n;i++) {
            for(int j=1;j<=nums[i];j++) {
                if(j+i<nums.length) {
                    graph[i+j][i]=i+1;
                }
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                //System.out.print(" "+graph[i][j]);
            }
            //System.out.println("");
        }

        return graph;
    }
}
