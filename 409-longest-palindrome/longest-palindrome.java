class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int [128];
        for(char c: s.toCharArray()){
            freq[c]++;
        }
        int len=0;
        boolean oddfound=false;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0){
                len+=freq[i];
            }
            else{
                len+=freq[i]-1;// agar 5 letter hoga to 1 kam kr ke 4 ko length me add kr denge
                oddfound=true;
            }
        }
        if(oddfound==true){
            len+=1;
        }
        return len;
    }
}