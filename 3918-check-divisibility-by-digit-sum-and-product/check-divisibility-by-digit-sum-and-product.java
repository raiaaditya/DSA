class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int s=0;
        int prod=1;
        while(n!=0){
            int rem=n%10;
            s+=rem;
            prod*=rem;
            n/=10;
        }
        if(num%(s+prod)==0) return true;
        else return false;
    }
}