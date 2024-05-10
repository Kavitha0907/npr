

//User function Template for Java

class Solution{
    static long nPr(long n, long r){
        long k=1,k1=1;
        for(int i=2;i<=n;i++)
           k*=i;
         for(int i=2;i<=n-r;i++)
           k1*=i;
           
        return (long)k/k1;
        // code here
    }
}
