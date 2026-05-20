class Solution {
    public int firstUniqChar(String s) {
        char arr[]=s.toCharArray();
        HashMap<Character,Integer> f=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            f.put(arr[i],f.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(f.get(arr[i])==1) return i;
        }
        return -1;
    }
}