class Solution {
    public int countCommas(int n) {
        // int c=0;
        // for(int i=1;i<=n;i++){
        //     if(i>=1000 && i<=999999){
        //         c+=1;
        //     }
        //     else if(i>=10000000 && i<=999999999){
        //         c+=2;
        //     }
        //     // else if(i>=1000000000){
        //     //     c+=3;
        //     // }
        // }
        // return c;

        if(n<1000) return 0;
        else{
            return n-999;
        }
    }
}