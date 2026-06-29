class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int alt=0, max=0;

        for(int i=0;i<n;i++){
            alt+=gain[i];
            max=Math.max(max,alt);
        }
        return max;
    }
}