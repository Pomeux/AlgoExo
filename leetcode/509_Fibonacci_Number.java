class Solution {
    public int fib(int n) {
        int[] tab=new int[n];
        return fib_recursive(n,tab);
    }
    public int fib_recursive(int n, int[] tab) {
    

        if(n==0) return 0;
        if(n==1) return 1;

        if(tab[n-1]!=0) return tab[n-1];

        int result=fib_recursive(n-1,tab)+fib_recursive(n-2,tab);
        tab[n-1]=result;
        return result;
    }
}
