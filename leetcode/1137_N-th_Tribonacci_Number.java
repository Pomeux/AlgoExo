class Solution {
    public int tribonacci(int n) {
        int[] tab=new int[n];
        return tribonacciRecursive(n,tab); 
    }
    public int tribonacciRecursive(int n,int[] tab) {
        if(n==2 || n==1) return 1;
        if(n==0) return 0;

        if(tab[n-1]!=0) return tab[n-1];

        int result=tribonacciRecursive(n-1,tab)+tribonacciRecursive(n-2,tab)+tribonacciRecursive(n-3,tab);
        tab[n-1]=result;
        return result;
    }
}
